

fun helloWorld(){
    println("Hello World")
}

fun returnString(): String{
    return "Helloooo!"
}

fun showAge(age: Int, isHappy: Boolean = true, name: String){
    println("$name, your age is $age and it is $isHappy that you are happy")
}

fun main() {
    var x = helloWorld()
    println(x)
    println(returnString())

    //positioned parameters
    showAge(
        22,
        true,
        "Jane"
    )

    //named parameters
    showAge(
        name = "Bob",
        isHappy = true,
        age = 31
    )
}
