package kotlin2


abstract class Vehicle(var color: String, val numWheels: Int, val numDoors: Int){

    abstract fun drive()
    fun doorOpen(){
        println("Door is open!")
    }

    fun vehicleInfo() = "$color | $numWheels | $numDoors"

}

class Car(color: String = "red", numWheels: Int = 4, numDoors: Int = 4, var weight: Int = 500):
    Vehicle(color, numWheels, numDoors){
    override fun drive() {
        println("Car driving")
    }
    fun carInfo() = "$color | $numWheels | $numDoors | $weight"

}


fun main() {
    var car1 = Car()
    car1.color = "yellow"
    println(car1.vehicleInfo())
    println(car1.carInfo())


}