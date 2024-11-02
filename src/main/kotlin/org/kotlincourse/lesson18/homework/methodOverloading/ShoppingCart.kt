package org.sergei.org.kotlincourse.lesson18.homework.methodOverloading

class ShoppingCart {
    private val items = mutableMapOf<Int, Int>() // Словарь ID товаров и их количества

    // Базовый метод добавления одной единицы товара
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    // Перегрузка метода для добавления указанного количества товара
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    // Перегрузка метода для добавления списка ID товаров (по одной единице каждого)
    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    // Перегрузка метода для добавления словаря ID и количества товаров
    fun addToCart(itemsToAdd: Map<Int, Int>) {
        for ((itemId, amount) in itemsToAdd) {
            addToCart(itemId, amount)
        }
    }

    // Переопределение метода toString для красивого вывода содержимого корзины
    override fun toString(): String {
        val totalItems = items.size
        val totalQuantity = items.values.sum()
        val builder = StringBuilder()

        builder.append("Корзина товаров:\n")
        builder.append("ID товара | Количество\n")
        builder.append("-----------------------\n")
        for ((id, quantity) in items) {
            builder.append("$id         | $quantity\n")
        }
        builder.append("-----------------------\n")
        builder.append("Всего артикулов: $totalItems\n")
        builder.append("Общее количество товаров: $totalQuantity\n")

        return builder.toString()
    }
}
