package org.sergei.org.kotlincourse.lesson17.homework

// Базовый класс Учебное Заведение
open class EducationalInstitution(
    val name: String,
    val address: String,
    val foundationYear: Int
) {
    open fun provideEducation() {
        println("Образовательное учреждение предоставляет образовательные услуги.")
    }
}

// Класс Школа, наследующийся от Учебного Заведения
open class School(
    name: String,
    address: String,
    foundationYear: Int,
    val schoolСlass: String
) : EducationalInstitution(name, address, foundationYear) {

    override fun provideEducation() {
        println("Школа предоставляет базовое образование на уровне: $schoolСlass.")
    }
}

// Класс Университет, наследующийся от Учебного Заведения
open class University(
    name: String,
    address: String,
    foundationYear: Int,
    val accreditationLevel: String
) : EducationalInstitution(name, address, foundationYear) {

    override fun provideEducation() {
        println("Университет предоставляет высшее образование, аккредитация: $accreditationLevel.")
    }
}

// Класс Колледж, наследующийся от Учебного Заведения
open class College(
    name: String,
    address: String,
    foundationYear: Int,
    val diplomaType: String
) : EducationalInstitution(name, address, foundationYear) {

    override fun provideEducation() {
        println("Колледж предоставляет профессиональное образование, тип диплома: $diplomaType.")
    }
}

// Класс Начальная Школа, наследующийся от Школы
class PrimarySchool(
    name: String,
    address: String,
    foundationYear: Int
) : School(name, address, foundationYear, "Начальная") {

    fun organizeRecess() {
        println("Начальная школа организует перемены для младших классов.")
    }
}

// Класс Средняя Школа, наследующийся от Школы
class MiddleSchool(
    name: String,
    address: String,
    foundationYear: Int
) : School(name, address, foundationYear, "Средняя") {

    fun organizeScienceFair() {
        println("Средняя школа организует научную ярмарку.")
    }
}

// Класс Институт, наследующийся от Университета
class Institute(
    name: String,
    address: String,
    foundationYear: Int,
    accreditationLevel: String,
    val specialization: String
) : University(name, address, foundationYear, accreditationLevel) {

    fun conductResearch() {
        println("Институт проводит исследование по специализации: $specialization.")
    }
}


