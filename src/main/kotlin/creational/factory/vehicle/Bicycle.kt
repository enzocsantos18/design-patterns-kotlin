package creational.factory.vehicle

class Bicycle(private val name: String) : Vehicle {
    override fun pickup(customerName: String) {
        println("=============================")
        println("${this.name} bicycle is looking for $customerName")
    }

    override fun stop() {
        println("${this.name} bicycle stopped.")
    }
}