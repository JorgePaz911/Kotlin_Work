
private fun init(){
    var name = "JohnnyB"
    var isAwesome = true

    println("$name is awesome? The asnwer is $isAwesome")

    name = ""
    println(name.isBlank())
    println(name.isEmpty())
    println(name::class)

    val float = 45.66F
    println(float + 4)
    println(float.toDouble()::class)

    val bigLong: Long = 1_000_000
    println(bigLong)

    println(bigLong.plus(6))

    var fullName = "Jorge Paz"
    println(fullName.lowercase())

    val char = 'h'

    var multiLineString = """
        Hello world,
        My name is Jorge.
        YEAH!
    """.trimIndent()
    println(multiLineString)

    var age = 31
    println("Hello $fullName, your age is $age and your name is ${fullName.length} characters long")

    var boolean = true
    println("${boolean.not()} or " + !boolean)

}

fun main() {
    init()
}