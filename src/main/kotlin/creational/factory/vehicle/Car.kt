package creational.factory.vehicle

class Car(private val name: String) : Vehicle {
    override fun pickup(customerName: String) {
        println("=============================")
        println("${this.name} is looking for $customerName")
    }

    override fun stop() {
        println("${this.name} stopped.")

    }
}