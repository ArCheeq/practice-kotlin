fun main() {
    val dog = Dog("Buddy", 5, 8.84)
    dog.printInfo()
    dog.loudVoice()

    val bird = Bird("Kesha", 3, 0.64, false)
    bird.fly()
    bird.makeSound()

    val fish = Fish("Shark", 30, 124.3)
    fish.swim()
    fish.printInfo()
}