fun main() {
    // Створення списку з дата-класів Figure
    val figures = listOf(
        Figure(10.0, 5.0),
        Figure(6.0, 3.0),
        Figure(8.0, 2.5)
    )

    // Підрахунок суми полів area
    val totalArea = figures.sumOf { it.area }

    // Виведення результату
    println("Total area: $totalArea")

    // Cтворення списка з екземплярами класів-наслідників Shape
    val shapes = listOf(
        Rectangle(),
        Oval(),
        Line(),
        Oval(),
        Rectangle(),
        Oval()
    )

    // Змінні-лічильники для кожного типу Shape

    val shapesCount = arrayOf(0, 0, 0)

    // Перевіряємо кожен елемент списку та збільшуємо лічильник відповідного типу Shape
    for (shape in shapes) {
        when (shape) {
            is Rectangle -> shapesCount[0]++
            is Oval -> shapesCount[1]++
            is Line -> shapesCount[2]++
        }
    }

    // Вивід кількісті кожного типу Shape
    println("Кількість прямокутників: ${shapesCount[0]}")
    println("Кількість овалів: ${shapesCount[1]}")
    println("Кількість ліній: ${shapesCount[2]}")

    // Фільтрація кількісті кожного типу Shape
    val counts = shapes.groupBy { it::class }.mapValues { it.value.size }

    // Виведемо кількість елементів кожного типу Shape
    println("Кількість прямокутників: ${counts[Rectangle::class] ?: 0}")
    println("Кількість овалів: ${counts[Oval::class] ?: 0}")
    println("Кількість ліній: ${counts[Line::class] ?: 0}")
}
