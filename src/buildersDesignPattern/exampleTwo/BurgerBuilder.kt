package buildersDesignPattern.exampleTwo

class BurgerBuilder() {
    private  var size: String = ""
    private  var cheese: String = ""
    private  var pepperoni: String = ""
    private  var lettuce: String = ""
    private  var tomato: String = ""

    fun setSize(size: String): BurgerBuilder {
        this.size = size
        return this
    }

    fun setCheese(cheese: String): BurgerBuilder {
        this.cheese = cheese
        return this
    }

    fun setPepperoni(pepperoni: String): BurgerBuilder {
        this.pepperoni = pepperoni
        return this
    }

    fun setLettuce(lettuce: String): BurgerBuilder {
        this.lettuce = lettuce
        return this
    }

    fun setTomato(tomato: String): BurgerBuilder {
        this.tomato = tomato
        return this
    }

    fun build(): Burger {
        return Burger(this)
    }

    fun getSize(): String {
        return size
    }

    fun getCheese(): String {

        return cheese
    }

    fun getPepperoni(): String {
        return pepperoni
    }

    fun getLettuce(): String {
        return lettuce
    }

    fun getTomato(): String {
        return tomato
    }

}