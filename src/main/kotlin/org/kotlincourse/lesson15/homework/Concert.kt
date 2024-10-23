package org.sergei.org.kotlincourse.lesson15.homework

class Concert(val group: String,      // Название группы
              var venue: String,      // Место проведения
              var price: Double,      // Стоимость билета
              var capacity: Int       // Вместимость зала
)  {

    // Приватное поле для отслеживания количества проданных билетов

    private var soldTickets: Int = 0

    // Метод для вывода информации о концерте
    fun showInfo() {
        println("Group: $group")
        println("Venue: $venue")
        println("Ticket Price: $$price")
        println("Capacity: $capacity")
        println("Sold Tickets: $soldTickets")
    }

    // Метод для покупки билета
    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("Билет успешно куплен! Проданные билеты: $soldTickets")
        } else {
            println("К сожалению, билетов больше нет!")
        }
    }

}