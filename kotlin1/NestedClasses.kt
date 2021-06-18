package kotlin1

class Vehicle{
    var brand: String = "Brand"
    fun info() = println(brand)

    //nested class
    class SteeringWheel{
        var name: String = "Steering Wheel"
        fun info()= println(name)
    }

    //inner class
    inner class Transmission{
        var type = "Transmission"
        fun info() = println(type)
    }

}

fun main() {
    var veh1 = Vehicle()
    veh1.brand = "Toyota"
    veh1.info()

    var sw1 = Vehicle.SteeringWheel()
    sw1.name = "Large Steering Wheel"
    sw1.info()

    var tran1 = Vehicle()
    tran1.Transmission().type = "Automatic"
    tran1.Transmission().info()
}