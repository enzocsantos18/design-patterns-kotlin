package creational.factory.factories

import creational.factory.vehicle.Car
import creational.factory.vehicle.Vehicle

class CarFactory : VehicleFactory() {
    override fun getVehicle(name: String): Vehicle {
        return Car(name)
    }
}