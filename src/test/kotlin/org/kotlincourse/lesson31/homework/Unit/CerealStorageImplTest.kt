package org.kotlincourse.lesson31.homework.Unit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.sergei.org.kotlincourse.lesson31.homework.Unit.Cereal
import org.sergei.org.kotlincourse.lesson31.homework.Unit.CerealStorageImpl
import kotlin.test.assertFailsWith

// Юнит-тесты
class CerealStorageImplTest {

    @Test
    fun testInitialization() {
        val storage = CerealStorageImpl(10f, 100f)
        assertEquals(10f, storage.containerCapacity, 0.01f)
        assertEquals(100f, storage.storageCapacity, 0.01f)
    }

    @Test
    fun testAddCereal() {
        val storage = CerealStorageImpl(10f, 50f)
        val remaining = storage.addCereal(Cereal.BUCKWHEAT, 5f)
        assertEquals(0f, remaining, 0.01f)
        assertEquals(5f, storage.getAmount(Cereal.BUCKWHEAT), 0.01f)
    }

    @Test
    fun testAddCerealOverflow() {
        val storage = CerealStorageImpl(10f, 50f)
        val remaining = storage.addCereal(Cereal.BUCKWHEAT, 15f)
        assertEquals(5f, remaining, 0.01f)
        assertEquals(10f, storage.getAmount(Cereal.BUCKWHEAT), 0.01f)
    }

    @Test
    fun testAddCerealThrowsForNegativeAmount() {
        val storage = CerealStorageImpl(10f, 50f)
        assertFailsWith<IllegalArgumentException> {
            storage.addCereal(Cereal.BUCKWHEAT, -5f)
        }
    }

    @Test
    fun testGetCereal() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.BUCKWHEAT, 10f)
        val retrieved = storage.getCereal(Cereal.BUCKWHEAT, 5f)
        assertEquals(5f, retrieved, 0.01f)
        assertEquals(5f, storage.getAmount(Cereal.BUCKWHEAT), 0.01f)
    }

    @Test
    fun testGetCerealNotEnough() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.BUCKWHEAT, 5f)
        val retrieved = storage.getCereal(Cereal.BUCKWHEAT, 10f)
        assertEquals(5f, retrieved, 0.01f)
        assertEquals(0f, storage.getAmount(Cereal.BUCKWHEAT), 0.01f)
    }

    @Test
    fun testRemoveContainer() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.BUCKWHEAT, 5f)
        assertFalse(storage.removeContainer(Cereal.BUCKWHEAT))
        storage.getCereal(Cereal.BUCKWHEAT, 5f)
        assertTrue(storage.removeContainer(Cereal.BUCKWHEAT))
    }

    @Test
    fun testToString() {
        val storage = CerealStorageImpl(10f, 50f)
        storage.addCereal(Cereal.BUCKWHEAT, 5f)
        storage.addCereal(Cereal.RICE, 7f)
        val result = storage.toString()
        assertTrue(result.contains("BUCKWHEAT: 5.0"))
        assertTrue(result.contains("RICE: 7.0"))
    }
}
