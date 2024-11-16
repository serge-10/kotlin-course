package org.sergei.org.kotlincourse.lesson22.classwork.Homework

fun String.spellOutWithAuthors(authors: List<String>) {
    // Проверяем, что список авторов не пуст
    if (authors.isEmpty()) {
        println("Authors list is empty!")
        return
    }

    // Пробегаем по буквам строки и распределяем их между авторами
    val lines = this.mapIndexed { index, char ->
        val author = authors[index % authors.size] // Круговой перебор авторов
        "| $author: $char |"
    }

    // Рисуем рамку и выводим результат
    val border = "-".repeat(lines.maxOf { it.length }) // Ширина рамки
    println(border)
    lines.forEach { println(it) }
    println(border)
}
