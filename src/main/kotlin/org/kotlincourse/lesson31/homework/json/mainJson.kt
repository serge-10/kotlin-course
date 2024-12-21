package org.sergei.org.kotlincourse.lesson31.homework.json

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

// Создай дата класс сотрудника компании Employee, содержащий:
// имя
// статус трудоустройства (булево)
// дата рождения (строка)
// должность CharacterTypes (enum из прошлого урока)
// список подчинённых с типом Emploee
//
// Создай небольшую иерархию из сотрудников где во главе CTO.

// Это значит что в объект сотрудника с должностью CTO в поле списка подчинённых должны попасть пара тим лидов,
// в списке подчинённых которых есть разработчики, дизайнеры и тестировщики. Чтобы было немного но и была вложенность.

// Сериализуй CTO в текст с настройкой prettyPrinting и текст запиши в файл в корне проекта.

// Прочитай текст из файла, десериализуй его в объект класса Employee и распечатай в консоль.

fun main() {
    // Создаем подчинённых
    val designer = Employee(
        name = "Елена Новосёлова",
        isEmployed = true,
        birthDate = "28-03-1978",
        position = CharacterTypes.UX_UI
    )
    val qa = Employee(
        name = "Сергей Власов",
        isEmployed = true,
        birthDate = "10-05-1980",
        position = CharacterTypes.QA
    )
    val programmer1 = Employee(
        name = "Дмитрий Степанов",
        isEmployed = true,
        birthDate = "12-04-1980",
        position = CharacterTypes.BACKEND_DEV
    )
    val programmer2 = Employee(
        name = "Максим Удодов",
        isEmployed = true,
        birthDate = "01-10-1986",
        position = CharacterTypes.BACKEND_DEV
    )

    // Создаем тимлидов
    val teamLead1 = Employee(
        name = "Александр Мишин",
        isEmployed = true,
        birthDate = "18-03-1998",
        position = CharacterTypes.TEAM_LEAD,
        subordinates = listOf(designer, qa)
    )
    val teamLead2 = Employee(
        name = "Николай Рогов",
        isEmployed = true,
        birthDate = "25-05-1978",
        position = CharacterTypes.TEAM_LEAD,
        subordinates = listOf(programmer1, programmer2)
    )

    // Создаем CTO
    val cto = Employee(
        name = "Григорий Иванов",
        isEmployed = true,
        birthDate = "11-12-1979",
        position = CharacterTypes.CTO,
        subordinates = listOf(teamLead1, teamLead2)
    )

    // Сериализация объекта в JSON
    val gson: Gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(cto)

    // Запись JSON в файл
    val file = File("cto.json")
    file.writeText(json)

    // Чтение JSON из файла
    val jsonFromFile = file.readText()
    val deserializedCto = gson.fromJson(jsonFromFile, Employee::class.java)

    // Вывод десериализованного объекта
    println(deserializedCto)
}