package org.sergei.org.kotlincourse.lesson15.homework

fun main(){

    // Создаем объект класса Party

    val party = Party("Планета Красноярск", 150)
    // Вызываем метод details()
    party.details()


    // Создаем обтект класса Emotion

    val emotion = Emotion("Laughter", 30)
    // Вызываем метод express()
    emotion.express()

    // Настраиваем видимость и фазу Луны

    Moon.isVisible = true
    Moon.phase = "Full Moon"
    // Вызываем метод showPhase()
    Moon.showPhase()

    // Cоздаем объекта класса PresentProductinStore

    val product = PresentProductinStore(name = "Apple", price = 0.99, quantity = 10)
    // Выводим информацию о продукте
    println("Product: ${product.name}")
    println("Price: $${product.price}")
    println("Quantity: ${product.quantity}")

    // Создаем объект класса Concert
    val concert = Concert(group = "The Rolling Stones",
        venue = "Madison Square Garden",
        price = 150.0,
        capacity = 50000)

    // Выводим информацию о концерте
    concert.showInfo()

    // Покупаем несколько билетов
    concert.buyTicket()  // Покупка билета
    concert.buyTicket()  // Еще одна покупка билета

    // Повторно выводим информацию
    concert.showInfo()


    val shelf = Shelf(20)  // Создаем полку с вместимостью 20 символов

    println(shelf.addItem("Book"))           // true
    println(shelf.addItem("Notebook"))       // true
    println(shelf.addItem("Laptop"))         // false, если места недостаточно
    println(shelf.removeItem("Book"))        // true, удаляет предмет
    println(shelf.containsItem("Notebook"))  // true, предмет на полке
    println(shelf.canAccommodate("Laptop"))  // false, места недостаточно для предмета
    println(shelf.getItems())                     // Показывает предметы на полке
    println("Remaining capacity: ${shelf.remainingCapacity()}")  // Показывает оставшееся место


}

