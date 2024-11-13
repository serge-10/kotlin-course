package org.sergei.org.kotlincourse.lesson21.Homework

class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun transformation(element: String): List<String> {
        return element.split(" ")   // Этот метод разбивает строку на слова по символу пробела
                                              // и возвращает список слов.
    }


    override fun transformList(elementList: List<String>): List<List<String>> {
        return elementList.map { it.split(" ") }  // Этот метод разбивает каждую строку списка на слова
                                                            // и возвращает список списков слов.


    }
}
