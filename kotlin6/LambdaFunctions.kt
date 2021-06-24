package kotlin6

fun main() {
    // val lambdaName: (InputType) -> Return Type = { arguments:InputType -> body }

    val greeter: (String) -> String = { name:String -> "Hello $name" }
    println(greeter("Jorge"))

    val greeter2: (String, String) -> String = { fName: String, lName: String ->
        val modifiedFname = fName.uppercase()
        val modifiedLname = lName.uppercase()
        "Hello $modifiedFname $modifiedLname"
    }
    println(greeter2("Jorge", "Paz"))

    val greeter3: (String, String) -> Unit = { fName: String, lName: String ->
        val modifiedFname = fName.uppercase()
        val modifiedLname = lName.uppercase()
        println("Hello $modifiedFname $modifiedLname")
    }
    greeter3("Jorge", "Paz2")

    //using type inference
    val greeter4 = { fName: String, lName: String ->
        val modifiedFname = fName.uppercase()
        val modifiedLname = lName.uppercase()
        println("Hello $modifiedFname $modifiedLname")
    }
    greeter4("Jorge", "Paz3")

    println(greeter6("YESYES"))

}

val greeter6: (String) -> String = { name:String -> "Hello $name" }
