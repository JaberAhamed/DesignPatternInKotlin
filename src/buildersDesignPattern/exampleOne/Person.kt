package buildersDesignPattern.exampleOne

class Person(var name: String, var age: Int) {

    constructor(builder: Builder) : this(builder.name, builder.age)

    class Builder {
        lateinit var name: String
        var age: Int = 0

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setAge(age: Int): Builder {
            this.age = age
            return this
        }

        fun build(): Person {

            return Person(this)
        }

    }
}