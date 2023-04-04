class Fish(name: String, age: Int, weight: Double, isHungry: Boolean = true) : Animal(name, age, weight, isHungry) {
    override fun makeSound() {
        println("$name does not speak. It's a fish!")
    }

    fun swim() {
        println("$name swims.")
    }
}