class Bird(name: String, age: Int, weight: Double, isHungry: Boolean = true) : Animal(name, age, weight, isHungry), Voice {
    override fun makeSound() {
        println("$name chirps!")
    }

    override fun loudVoice() {
        println("$name sings loudly!")
    }

    override fun quietVoice() {
        println("$name chirps softly")
    }

    fun fly() {
        println("$name flies.")
    }
}