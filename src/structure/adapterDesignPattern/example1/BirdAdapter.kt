package structure.adapterDesignPattern.example1

class BirdAdapter(val bird: Bird) : ToyDuck {

    override fun squeak() {
        bird.makeSound()
    }
}