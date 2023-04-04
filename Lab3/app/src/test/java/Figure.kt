data class Figure(val width: Double, val height: Double) {
    // Закрите поле area
    private var _area: Double = 0.0

    // Геттер, що повертає area (width * height)
    val area: Double
        get() = _area

    // Приватний сеттер, що встановлює area (width * height)
    private fun setArea() {
        _area = width * height
    }

    // Викликаємо setArea() при створенні екземпляру класу
    init {
        setArea()
    }
}