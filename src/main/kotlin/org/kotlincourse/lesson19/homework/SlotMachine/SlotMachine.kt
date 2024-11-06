package org.sergei.org.kotlincourse.lesson19.homework.SlotMachine

class SlotMachine {
    // Публичные поля с фиксированными значениями
    val color: String = "Red" // Цвет автомата
    val model: String = "SuperSlot 3000" // Модель автомата
    var presenceOfJoystick: Boolean = true // Наличие джойстика
    val owner: String = "Casino Owner" // Владелец автомата
    val supportPhone: String = "+1-800-123-4567" // Телефон поддержки

    // Приватные поля, определяющие внутреннее состояние автомата
    private var included: Boolean = false // Включен ли автомат
    private var osLoaded: Boolean = false // Загружена ли ОС
    private var balanceOfProceeds: Float = 0.0f // Баланс вырученных средств
    private val listOfAvailableGames: MutableList<String> = mutableListOf("Poker", "Blackjack", "Slots") // Список доступных игр

    // Метод для включения автомата
    fun turnOn() {
        included = true
        println("Автомат включен.")
    }

    // Метод для выключения автомата
    fun turnOff() {
        included = false
        osLoaded = false // ОС также завершает работу при выключении
        println("Автомат выключен.")
    }

    // Метод для загрузки операционной системы
    fun downloadOS() {
        if (included) {
            osLoaded = true
            println("Операционная система загружена.")
        } else {
            println("Ошибка: автомат выключен.")
        }
    }

    // Метод для завершения работы операционной системы
    fun shutDownOS() {
        if (osLoaded) {
            osLoaded = false
            println("Операционная система завершила работу.")
        } else {
            println("Ошибка: ОС не загружена.")
        }
    }

    // Метод для отображения списка доступных игр
    fun showListOfGames() {
        if (osLoaded) {
            println("Доступные игры: ${listOfAvailableGames}")
        } else {
            println("Ошибка: ОС не загружена. Список игр недоступен.")
        }
    }

    // Метод для оплаты игровой сессии
    // Возвращает true, если оплата прошла успешно
    fun payForGameSession(amount: Float): Boolean {
        if (amount > 0) {
            balanceOfProceeds += amount
            println("Игровая сессия оплачена. Баланс пополнен на $$amount.")
            return true
        } else {
            println("Ошибка: некорректная сумма.")
            return false
        }
    }

    // Метод для выплаты выигрыша
    fun payOutWinnings(amount: Float) {
        if (balanceOfProceeds >= amount && amount > 0) {
            balanceOfProceeds -= amount
            println("Выигрыш выплачен: $$amount. Остаток средств: $$balanceOfProceeds.")
        } else {
            println("Ошибка: недостаточно средств для выплаты или некорректная сумма.")
        }
    }

    // Приватный метод для включения игры
    private fun turnOnGame(game: String) {
        if (osLoaded && listOfAvailableGames.contains(game)) {
            println("Игра \"$game\" запущена.")
        } else {
            println("Ошибка: ОС не загружена или игра недоступна.")
        }
    }

    // Приватный метод для открытия сейфа и выдачи наличных
    private fun openSafeGiveOutCash() {
        println("Сейф открыт. Деньги выданы.")
    }
}

