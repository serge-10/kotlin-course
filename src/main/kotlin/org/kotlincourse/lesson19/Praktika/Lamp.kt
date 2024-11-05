package org.sergei.org.kotlincourse.lesson19.Praktika

class Lamp() {
    private var isOn = false

    fun ternOn(){
        isOn = true
    }
    fun ternOff(){
        isOn = false
    }
}

open  class Gemaconsole(){
     fun startGame(nameGame: String){
        initHardWare()
        loadGame(nameGame)
    }

    protected open fun initHardWare(){

    }
    private fun loadGame(nameGame: String){

    }
}

class Atm(private var balance: Float = 0f) { // Инициализация переменной баланса
    private var pin = "2333" // Секретный ПИН-код для проверки

    // Приватная функция для проверки правильности ПИН-кода
    private fun chekPin(inputPin: String) {
        if (inputPin != this.pin) {
            throw Exception("Неверный ПИН-код") // Генерация исключения, если ПИН-код неправильный
        }
    }

    // Функция для внесения денег на счет
    fun deposit(amount: Float, inputPin: String) {
        chekPin(inputPin) // Проверка ПИН-кода
        if (amount <= 0) {
            throw IllegalArgumentException("Сумма для внесения должна быть положительной") // Проверка корректности суммы
        }
        balance += amount // Обновление баланса
    }

    // Функция для снятия денег со счета
    fun withdraw(amount: Float, inputPin: String): Float {
        chekPin(inputPin) // Проверка ПИН-кода
        if (amount <= 0) {
            throw IllegalArgumentException("Сумма для снятия должна быть положительной") // Проверка корректности суммы
        }
        if (amount > balance) {
            throw Exception("Недостаточно средств на счете") // Проверка наличия достаточных средств
        }
        balance -= amount // Обновление баланса после снятия
        return amount // Возвращение снятой суммы
    }

    // Функция для получения текущего баланса
    fun getBalance(inputPin: String): Float {
        chekPin(inputPin) // Проверка ПИН-кода
        return balance // Возвращение текущего баланса
    }
}
