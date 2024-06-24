package structure.adapterDesignPattern.example1

class Sparrow : Bird {
    override fun fly() {
        println("Flying")
    }

    override fun makeSound() {
        println("Chirp Chirp")
    }
}