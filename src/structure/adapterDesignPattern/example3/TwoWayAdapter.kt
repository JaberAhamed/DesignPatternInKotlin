package structure.adapterDesignPattern.example3

interface TwoWayAdapter<T, U> {

    fun adaptTo(source: T): U

    fun adaptFrom(target: U): T
}