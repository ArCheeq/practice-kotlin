abstract class Animal(protected val name: String,
             var age: Int,
             var weight: Double,
             protected var isHungry: Boolean) {

    fun feed() {
        if (isHungry) {
            isHungry = false
            println("$name is no longer hungry.")
        } else {
            println("$name is is already full")
        }
    }

    abstract fun makeSound()

    fun printInfo() {
        println("$name is $age years old, weighs $weight kg, and is${if (isHungry) "" else " not"} hungry.")
    }
}