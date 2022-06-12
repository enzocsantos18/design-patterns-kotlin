package creational.factory.factories

import creational.factory.vehicle.Bicycle
import creational.factory.vehicle.Vehicle

class BicycleFactory : VehicleFactory() {
    override fun getVehicle(name: String): Vehicle {
        return Bicycle(name)
    }
}