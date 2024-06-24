package buildersDesignPattern.exampleTwo

class Burger(burgerBuilder: BurgerBuilder) {
    var size: String = burgerBuilder.getSize()
    var cheese: String = burgerBuilder.getCheese()
    var pepperoni: String = burgerBuilder.getPepperoni()
    var lettuce: String = burgerBuilder.getLettuce()
    var tomato: String = burgerBuilder.getTomato()
}