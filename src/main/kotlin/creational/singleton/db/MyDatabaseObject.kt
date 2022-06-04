package creational.singleton.db

object MyDatabaseObject {
    private var users: MutableList<String> = mutableListOf()

    fun addUser(name: String) = users.add(name)

    fun remove(index: Int) = users.removeAt(index)

    fun show() {
        users.forEach {
            println(it)
        }
    }
}

class MyDatabaseClassic {
    private var users: MutableList<String> = mutableListOf()

    companion object {
        val instance = MyDatabaseClassic()
    }

    fun addUser(name: String) = users.add(name)

    fun remove(index: Int) = users.removeAt(index)

    fun show() {
        users.forEach {
            println(it)
        }
    }
}

class Test{
    fun testMyDatabaseObject() {
        MyDatabaseObject.show()
    }

    fun testMyDatabaseClassic() {
        MyDatabaseClassic.instance.show()
    }
}

fun main() {

//    Using class object
    println("---------------------")
    println("Using class object")
    println("---------------------")

    MyDatabaseObject.addUser("Enzo")
    MyDatabaseObject.addUser("Maria")
    MyDatabaseObject.addUser("Soraia")
    MyDatabaseObject.show()
    MyDatabaseObject.remove(1)
    println("------Test Class-----")
    Test().testMyDatabaseObject()

//    Using companion object
    println("---------------------")
    println("Using companion object")
    println("---------------------")

    val instance = MyDatabaseClassic.instance
    instance.addUser("Andrew")
    instance.addUser("Barney")
    instance.addUser("Cris")
    instance.show()
    instance.remove(1)
    println("------Test Class-----")
    Test().testMyDatabaseClassic()

}