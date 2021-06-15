

class User(var firstName: String = "", var lastName: String = "Smith"){

    fun printFullName(){
        println("$firstName $lastName")
    }

    fun updateName(name: String){
        firstName = name
    }
}

fun main() {
    var user1 = User()
    var user2 = User()
    user2.updateName("Bobby")

    user1.printFullName()
    user2.printFullName()
}