package creational.factory.factories

import creational.factory.vehicle.Vehicle

abstract class VehicleFactory {
    //factory method
    abstract fun getVehicle(name: String): Vehicle

    fun pickUp(custumerName: String, vehicleName: String) : Vehicle {
        val vehicle = this.getVehicle(vehicleName)
        vehicle.pickup(custumerName)
        return vehicle
    }
}