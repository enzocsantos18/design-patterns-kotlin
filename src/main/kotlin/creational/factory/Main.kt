package creational.factory

import creational.factory.factories.BicycleFactory
import creational.factory.factories.CarFactory
import creational.factory.vehicle.Vehicle

fun main() {

    val carFactory = CarFactory()
    val car1 = carFactory.getVehicle("Mustang")
    val car2 = carFactory.getVehicle("Camaro")


    car1.pickup("Rose")
    car1.stop()

    car2.pickup("Michael")
    car2.stop()

    val customers = listOf("Ana", "John", "Robert", "Miranda")

    for(i in 1..10) {
        val randomVehicle = randomVehicle()
        randomVehicle.pickup(customers.random())
        randomVehicle.stop()
    }

}

fun randomVehicle() : Vehicle {
    val carFactory = CarFactory()
    val car1 = carFactory.getVehicle("Mustang")
    val car2 = carFactory.getVehicle("Camaro")
    val bicycleFactory = BicycleFactory()
    val bike1 =bicycleFactory.getVehicle("Super73")
    val bike2 = bicycleFactory.getVehicle("Specialized")

    val vehicleList = listOf(car1, car2, bike1, bike2)

    return vehicleList.random()
}
