package org.sergei.org.kotlincourse.lesson31.homework.json


data class Employee (
    val name: String,
    val isEmployed: Boolean,
    val birthDate: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = emptyList()
)