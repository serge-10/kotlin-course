package org.sergei.org.kotlincourse.lesson30.homework


// Напиши функцию, которая определит, какой тип кофе предложить посетителю
// исходя из его функциональной принадлежности.

// Эспрессо - СТО или тимлид
// Латте - дизы и геймдев
// Капучино - Менеджеры
// Американо - бэкендеры и сисадмины
// Для QA добавь в enum ещё один вид напитка: Nescafe classic

// Реши задачу через доработку enum CharacterTypes

enum class CoffeeType(val cost: Double, val coffeeBase: String, val recommendedSugar: Int, val hasMilk: Boolean = false) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0),
    NESCAFECLASSIC(0.50, "Nescafe classic", 3);

    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}

enum class CharacterTypes(val coffee: CoffeeType) {
    CTO(CoffeeType.ESPRESSO),
    UX_UI(CoffeeType.LATTE),
    CRM(CoffeeType.CAPPUCCINO),
    GAME_DEV(CoffeeType.LATTE),
    TEAM_LEAD(CoffeeType.ESPRESSO),
    BACKEND_DEV(CoffeeType.AMERICANO),
    PM(CoffeeType.CAPPUCCINO),
    SYSADMIN(CoffeeType.AMERICANO),
    QA(CoffeeType.NESCAFECLASSIC);

    companion object {
        fun getCoffeeForRole(role: CharacterTypes): CoffeeType {
            return role.coffee
        }
    }
}

fun main() {
    // Перебираем все роли из CharacterTypes
    CharacterTypes.values().forEach { role ->
        val coffee = CharacterTypes.getCoffeeForRole(role)
        println("Для ${role.name} рекомендуется: ${coffee.description()}")
    }
}
