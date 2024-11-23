package org.sergei.org.kotlincourse.lesson24.Homework

//Задание 4. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError
// и принимающий текст. Выброси это исключение в main

class MyCustomException(message: String) : AssertionError(message)
