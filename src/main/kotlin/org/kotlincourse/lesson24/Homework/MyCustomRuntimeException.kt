package org.sergei.org.kotlincourse.lesson24.Homework

// Задание 5. Создай свой тип исключения в отдельном файле,
// наследуемый от RuntimeException и принимающий ArrayIndexOutOfBoundsException
// тип в качестве аргумента. Напиши код, который спровоцирует выброс
// ArrayIndexOutOfBoundsException, перехвати его с помощью try-catch
// и в блоке catch выведи сообщение в консоль и сделай выброс своего типа исключения.

class MyCustomRuntimeException(cause: ArrayIndexOutOfBoundsException) : RuntimeException(cause)
