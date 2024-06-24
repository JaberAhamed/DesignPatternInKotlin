package buildersDesignPattern.exampleThree

class CarBuilder : Builder {

     private var seat: String = ""
     private var color: String = ""
     private var type: String = ""

    override fun setSeat(seat: String) {
        this.seat = seat
    }

    override fun setColor(color: String) {
        this.color = color
    }

    override fun setType(type: String) {
        this.type = type
    }

    fun build(): Car {
        return Car(seat, color, type)
    }
}