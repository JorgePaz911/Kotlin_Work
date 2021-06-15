



class User2(var firstName: String, var lastName: String){

    fun fullName(): String = "$firstName $lastName"
    fun nameLength(): Int = fullName().length

    fun addSuffix(suffix: String){
        firstName = "$suffix $firstName"
    }
}

fun main() {
    var u1 = User2("Joe", "Smith")

    u1.addSuffix("Mr.")

    println(u1.fullName())
    println(u1.nameLength())
}