package org.kotlincourse.lesson31.homework.Unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.sergei.org.kotlincourse.lesson31.homework.Unit.Cereal
import org.sergei.org.kotlincourse.lesson31.homework.Unit.CerealStorageImpl

class CerealStorageImplTest {

    // Проверяет успешную инициализацию объекта с корректными параметрами
    @Test
    fun `test initialization with valid parameters`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        assertEquals(10f, storage.containerCapacity)
        assertEquals(50f, storage.storageCapacity)
    }

    // Проверяет выброс исключения при отрицательной ёмкости контейнера
    @Test
    fun `test initialization with invalid containerCapacity`() {
        val exception = assertThrows<IllegalArgumentException> {
            CerealStorageImpl(containerCapacity = -1f, storageCapacity = 50f)
        }
        assertEquals("Ёмкость контейнера не может быть отрицательной", exception.message)
    }

    // Проверяет выброс исключения, если ёмкость хранилища меньше ёмкости одного контейнера
    @Test
    fun `test initialization with storageCapacity less than containerCapacity`() {
        val exception = assertThrows<IllegalArgumentException> {
            CerealStorageImpl(containerCapacity = 10f, storageCapacity = 5f)
        }
        assertEquals("Ёмкость хранилища не должна быть меньше ёмкости одного контейнера", exception.message)
    }

    // Проверяет успешное добавление крупы в контейнер, не превышая его ёмкости
    @Test
    fun `test addCereal with valid amount`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        val remaining = storage.addCereal(Cereal.RICE, 8f)
        assertEquals(0f, remaining)
        assertEquals(8f, storage.getAmount(Cereal.RICE))
    }

    // Проверяет добавление крупы в контейнер с превышением его ёмкости и возврат остатка
    @Test
    fun `test addCereal exceeding container capacity`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        val remaining = storage.addCereal(Cereal.RICE, 12f)
        assertEquals(2f, remaining)
        assertEquals(10f, storage.getAmount(Cereal.RICE))
    }

    // Проверяет выброс исключения при попытке добавить отрицательное количество крупы
    @Test
    fun `test addCereal with negative amount`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        val exception = assertThrows<IllegalArgumentException> {
            storage.addCereal(Cereal.RICE, -5f)
        }
        assertEquals("Количество крупы не может быть отрицательным", exception.message)
    }

    // Проверяет успешное изъятие заданного количества крупы из контейнера
    @Test
    fun `test getCereal with valid amount`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        storage.addCereal(Cereal.RICE, 10f)
        val retrieved = storage.getCereal(Cereal.RICE, 5f)
        assertEquals(5f, retrieved)
        assertEquals(5f, storage.getAmount(Cereal.RICE))
    }

    // Проверяет изъятие большего количества крупы, чем доступно в контейнере, и возвращение доступного объёма
    @Test
    fun `test getCereal exceeding current amount`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        storage.addCereal(Cereal.RICE, 5f)
        val retrieved = storage.getCereal(Cereal.RICE, 10f)
        assertEquals(5f, retrieved)
        assertEquals(0f, storage.getAmount(Cereal.RICE))
    }

    // Проверяет выброс исключения при попытке изъять отрицательное количество крупы
    @Test
    fun `test getCereal with negative amount`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        val exception = assertThrows<IllegalArgumentException> {
            storage.getCereal(Cereal.RICE, -5f)
        }
        assertEquals("Количество крупы не может быть отрицательным", exception.message)
    }

    // Проверяет успешное удаление пустого контейнера
    @Test
    fun `test removeContainer with empty container`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        storage.addCereal(Cereal.RICE, 0f)
        val result = storage.removeContainer(Cereal.RICE)
        assertTrue(result)
    }

    // Проверяет невозможность удаления непустого контейнера
    @Test
    fun `test removeContainer with non-empty container`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        storage.addCereal(Cereal.RICE, 5f)
        val result = storage.removeContainer(Cereal.RICE)
        assertFalse(result)
    }

    // Проверяет корректное получение количества крупы в контейнере
    @Test
    fun `test getAmount for existing cereal`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        storage.addCereal(Cereal.RICE, 7f)
        assertEquals(7f, storage.getAmount(Cereal.RICE))
    }

    // Проверяет корректное вычисление доступного места в контейнере
    @Test
    fun `test getSpace for existing cereal`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        storage.addCereal(Cereal.RICE, 7f)
        assertEquals(3f, storage.getSpace(Cereal.RICE))
    }

    // Проверяет корректное текстовое представление хранилища с содержимым контейнеров
    @Test
    fun `test toString`() {
        val storage = CerealStorageImpl(containerCapacity = 10f, storageCapacity = 50f)
        storage.addCereal(Cereal.RICE, 5f)
        storage.addCereal(Cereal.BUCKWHEAT, 8f)
        val result = storage.toString()
        assertTrue(result.contains("RICE: 5.0"))
        assertTrue(result.contains("BUCKWHEAT: 8.0"))
    }
}
