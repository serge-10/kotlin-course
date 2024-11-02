package org.sergei.org.kotlincourse.lesson18.homework.methodOverloading

fun main() {
    val cart = ShoppingCart()

    // Добавление одной единицы товара
    cart.addToCart(101)

    // Добавление указанного количества товара
    cart.addToCart(102, 5)

    // Добавление списка ID товаров
    cart.addToCart(listOf(103, 104, 105))

    // Добавление словаря ID и количества товаров
    cart.addToCart(mapOf(106 to 3, 107 to 2))

    // Печать содержимого корзины
    println(cart)
}