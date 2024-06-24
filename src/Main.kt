import buildersDesignPattern.exampleOne.Person
import buildersDesignPattern.exampleThree.*
import buildersDesignPattern.exampleTwo.Burger
import buildersDesignPattern.exampleTwo.BurgerBuilder
import factorymethoddesignpattern.enemyfactory.EnemyFactory
import factorymethoddesignpattern.othersuses.EasyLevel
import factorymethoddesignpattern.othersuses.HardLevel
import singleton.exampleone.SingleToneOne
import singleton.exampletwo.SingletonTwo
import singleton.exaplethree.SingletonThree
import structure.adapterDesignPattern.example1.BirdAdapter
import structure.adapterDesignPattern.example1.PlasticToyDuck
import structure.adapterDesignPattern.example1.Sparrow
import structure.adapterDesignPattern.example1.ToyDuck
import structure.adapterDesignPattern.example2.CsvUser
import structure.adapterDesignPattern.example2.CsvUserAdapter
import structure.adapterDesignPattern.example2.JsonUser
import structure.adapterDesignPattern.example3.CsvJsonUserAdapter

fun main() {

    /**
     * ================================================================
     *  Factory method design pattern
     * ================================================================
     *
     *  key element
     *
     *     1. Product(The Enemy abstract class): This is the common interface for the objects the factory method creates.
     *
     *     2. Concrete Products(The Zombie, Alien, and Robot classes that extend Enemy.): These are the different types of objects the factory can create.
     *        They all implement the Product interface.
     *
     *     3. Creator: This is an abstract class that declares the factory method, which returns an object of the Product type. The Creator might also define a
     *        default implementation of the factory method that returns a default ConcreteProduct object.
     *
     *     4.Concrete Creators: These are the classes that override the factory method in order to change the resulting product's type.
     *
     */

    // general concept of factory method design pattern
    val enemy1 = EnemyFactory.createEnemy("ZOMBIE")
    enemy1.attack()

    val enemy2 = EnemyFactory.createEnemy("VAMPIRE")
    enemy2.attack()

    println()

    /**
     * this concept helps to understand why we needed to create @EnemyFactory class
     */

    val easyLevel = EasyLevel()
    easyLevel.start()

    println()


    val hardLevel = HardLevel()
    hardLevel.start()


    /**
     * ================================================================
     *  Builder design pattern
     * ================================================================
     *
     * The Builder pattern provides a way to create complex objects step by step, by separating the construction of
     * each part into individual methods. Each method handles the creation of a specific part of the object and returns a
     * reference to the builder object, which can be used to chain the creation of subsequent parts.
     *
     *  key element
     *
     * 1. Product: This is the final object that will be created by the builder.
     *
     * 2.Builder: This is the interface that defines the steps to create the object.
     *
     * 3.Concrete Builder: This is the implementation of the Builder interface that provides the implementation for the creation of the object.
     *
     * 4.Director: This is an optional component that controls the order of the steps to create the object.
     *
     */

    println()

    // Builder example one
    val person = Person.Builder()
        .setName("John doe")
        .setAge(30)
        .build()

    println(person.name + "  " + person.age)

    println()

    // Builder example two

    var burger: Burger = BurgerBuilder()
        .setSize("5")
        .setCheese("add cheese")
        .build()

    println(burger.size + "  " + burger.cheese)

    println()

    // Builder example three


    val director = Director()
    val carBuilder = CarBuilder()
    director.constructCar(carBuilder)

    val car: Car = carBuilder.build()

    println(car.seat + "  " + car.type)


    val manualCarBuilder = ManualCardBuilder()
    director.constructManualCar(manualCarBuilder)

    val manualCar: ManualCar = manualCarBuilder.build()

    println(manualCar.seat + "  " + manualCar.type)

    /**
     * ================================================================
     *  Single design pattern
     * ================================================================
     *Singleton is a global object that can be accessed from everywhere in your application.
     * This article shows different ways of creating it in Kotlin.
     *
     */

    // Conventional way to create singleton

    SingleToneOne.getInstance().show()


    // Kotlin Object way to create singleton

    SingletonTwo.show()

    // Argument Singleton way to create singleton

    SingletonThree.getInstance("Hasan").show()


    /**
     * ================================================================
     *  Adapter design pattern
     * ================================================================
     *Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
     * example like xml to json
     *
     * 1.The adapter gets an interface, compatible with one of the existing objects.
     * 2.Using this interface, the existing object can safely call the adapter’s methods.
     * 3.Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.
     *
     */

    val sparrow = Sparrow()
    val plasticToyDuck = PlasticToyDuck()

    // Wrap a bird in a birdAdapter so that it
    // behaves like toy duck
    val birdAdapter: ToyDuck = BirdAdapter(sparrow)

    println("Sparrow....")
    sparrow.fly()
    sparrow.makeSound()

    println("ToyDuck...")

    plasticToyDuck.squeak()

    // toy duck behaving like a bird

    birdAdapter.squeak()


    // example 2

    println("Example 2 for json adapter")
    println()

    val csvUser = CsvUser("John doe", "john@gmail.com")

    val jsonAdapter:JsonUser = CsvUserAdapter(csvUser)

    useNewSystem(jsonAdapter)


    // example 3 Two way design pattern adapter
    println("Example Tow way design pattern adapter")
    println()


    val csvUser2 = CsvUser("John doe", "john@gmail.com")

    val csvJsonAdapter = CsvJsonUserAdapter()

    val jsonUser = csvJsonAdapter.adaptTo(csvUser2)
    println("Two way Adapted to JSON format: ${jsonUser.name} ${jsonUser.emailAddress}")


    val csvUserData = csvJsonAdapter.adaptFrom(jsonUser)
    println("Two way Adapted to CSV format:  ${csvUserData.username} ${csvUserData.email}")



}

fun useNewSystem(user: JsonUser){
    println("Name: ${user.name}")
    println("Email: ${user.emailAddress}")
}