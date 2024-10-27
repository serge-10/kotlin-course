package org.sergei.org.kotlincourse.lesson16

fun main() {

    val item1 = Item("Water", ItemType.LIQUIDS, 1000)
    val item2 = Item("Juice", ItemType.LIQUIDS, 500)
    val item3 = Item("Milk", ItemType.LIQUIDS, 1000)
    val item4 = Item("Wine", ItemType.ALCOHOL, 750)
    val item5 = Item("Beer", ItemType.ALCOHOL, 500)
    val item6 = Item("Vodka", ItemType.ALCOHOL, 700)
    val item7 = Item("Apple", ItemType.FRUIT, 150)
    val item8 = Item("Banana", ItemType.FRUIT, 120)
    val item9 = Item("Orange", ItemType.FRUIT, 130)
    val item10 = Item("Lettuce", ItemType.VEGETABLE, 80)
    val item11 = Item("Tomato", ItemType.VEGETABLE, 100)
    val item12 = Item("Cucumber", ItemType.VEGETABLE, 90)
    val item13 = Item("Pineapple", ItemType.FRUIT, 1000)
    val item14 = Item("Grapes", ItemType.FRUIT, 300)
    val item15 = Item("Carrot", ItemType.VEGETABLE, 50)
    val item16 = Item("Peach", ItemType.FRUIT, 120)
    val item17 = Item("Cherry", ItemType.FRUIT, 10)
    val item18 = Item("Spinach", ItemType.VEGETABLE, 60)
    val item19 = Item("Broccoli", ItemType.VEGETABLE, 250)
    val item20 = Item("Strawberry", ItemType.FRUIT, 15)
    val item21 = Item("Watermelon", ItemType.FRUIT, 5000)
    val item22 = Item("Melon", ItemType.FRUIT, 2000)
    val item23 = Item("Radish", ItemType.VEGETABLE, 30)
    val item24 = Item("Pumpkin", ItemType.VEGETABLE, 3000)
    val item25 = Item("Zucchini", ItemType.VEGETABLE, 200)
    val item26 = Item("Cabbage", ItemType.VEGETABLE, 1500)
    val item27 = Item("Peas", ItemType.VEGETABLE, 100)
    val item28 = Item("Pear", ItemType.FRUIT, 150)
    val item29 = Item("Plum", ItemType.FRUIT, 70)
    val item30 = Item("Kiwi", ItemType.FRUIT, 80)
    val item31 = Item("Coconut Water", ItemType.LIQUIDS, 300)
    val item32 = Item("Whiskey", ItemType.ALCOHOL, 700)
    val item33 = Item("Rum", ItemType.ALCOHOL, 750)
    val item34 = Item("Tequila", ItemType.ALCOHOL, 700)
    val item35 = Item("Avocado", ItemType.FRUIT, 200)
    val item36 = Item("Blueberry", ItemType.FRUIT, 10)
    val item37 = Item("Raspberry", ItemType.FRUIT, 8)
    val item38 = Item("Mango", ItemType.FRUIT, 300)
    val item39 = Item("Lemon", ItemType.FRUIT, 50)
    val item40 = Item("Lime", ItemType.FRUIT, 40)
    val item41 = Item("Basil", ItemType.VEGETABLE, 5)
    val item42 = Item("Mint", ItemType.VEGETABLE, 5)
    val item43 = Item("Parsley", ItemType.VEGETABLE, 10)
    val item44 = Item("Celery", ItemType.VEGETABLE, 100)
    val item45 = Item("Garlic", ItemType.VEGETABLE, 15)
    val item46 = Item("Ginger", ItemType.VEGETABLE, 50)
    val item47 = Item("Eggplant", ItemType.VEGETABLE, 200)
    val item48 = Item("Cauliflower", ItemType.VEGETABLE, 300)
    val item49 = Item("Onion", ItemType.VEGETABLE, 150)
    val item50 = Item("Bell Pepper", ItemType.VEGETABLE, 100)

    val items = listOf(
        item1, item2, item3, item4, item5, item6, item7, item8, item9, item10,
        item11, item12, item13, item14, item15, item16, item17, item18, item19, item20,
        item21, item22, item23, item24, item25, item26, item27, item28, item29, item30,
        item31, item32, item33, item34, item35, item36, item37, item38, item39, item40,
        item41, item42, item43, item44, item45, item46, item47, item48, item49, item50
    )

    val sections = listOf(
        Section(ItemType.LIQUIDS, 1200),
        Section(ItemType.LIQUIDS, 2031),
        Section(ItemType.ALCOHOL, 2500),
        Section(ItemType.ALCOHOL, 3138),
        Section(ItemType.FRUIT, 4480),
        Section(ItemType.FRUIT, 8500),
        Section(ItemType.VEGETABLE, 4500),
        Section(ItemType.VEGETABLE, 6200),
        Section(ItemType.FRUIT, 4000),
        Section(ItemType.VEGETABLE, 2700)
    )

    val fridge = Fridge(12)

    sections.forEach { fridge.addSection(it) }
    items.forEach {
        if (!fridge.addItem(it)) {
            println("Не добавлено")
            println(it)
        }
    }
    fridge.viewFridge()
}
