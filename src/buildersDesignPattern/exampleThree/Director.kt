package buildersDesignPattern.exampleThree

class Director {

    fun constructCar(builder: Builder){
        builder.setSeat("Auto car")
        builder.setColor("White")
        builder.setType("Normal")
    }

    fun constructManualCar(builder: Builder){
        builder.setSeat("Manual car")
        builder.setColor("Black")
        builder.setType("Manual")
    }
}