package org.sergei.org.kotlincourse.lesson31

import com.google.gson.Gson
import com.google.gson.GsonBuilder


data class Address(
    val street: String,
    val city: String,
    val postalCode: Int
)

data class User(
    val id: Int,
    val name: String,
    val isActive: Boolean,
    val address: Address
)
fun main() {
    val address = Address("Baker Street", "London", 221)
    val user = User(1, "Sherlock Holmes", true, address)

    val gson = Gson() // Создаём экземпляр Gson
    val json = gson.toJson(user) // Сериализация объекта
    println("JSON: $json")

    val user1: User = gson.fromJson(json, User::class.java) // Десериализация JSON в объект
    println("User: $user1")

    val gson1 = GsonBuilder()
        .setPrettyPrinting() // Для красивого форматирования JSON
        .serializeNulls() // Включить null-поля в JSON
        .create()
}