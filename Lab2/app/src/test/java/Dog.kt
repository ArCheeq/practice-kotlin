class Dog(name: String, age: Int, weight: Double, isHungry: Boolean = true) : Animal(name, age, weight, isHungry), Voice {
    override fun makeSound() {
        println("$name barks!")
    }

    override fun loudVoice() {
        println("$name barks loudly!")
    }

    override fun quietVoice() {
        println("$name squeaks quietly")
    }

    fun playFetch() {
        println("$name plays fetch.")
    }
}