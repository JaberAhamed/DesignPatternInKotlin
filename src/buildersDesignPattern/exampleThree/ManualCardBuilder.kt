package buildersDesignPattern.exampleThree

class ManualCardBuilder : Builder {

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

    fun build(): ManualCar {
        return ManualCar(seat, color, type)
    }
}