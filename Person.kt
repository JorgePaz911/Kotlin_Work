class Person(var name: String)


fun main() {
    var p1 = Person("Rachel")
    var p2 = Person("Rachel")
    var p3 = p1

    println(p1 === p2)
    println(p1 !== p2)

    println(p1 === p3)

    var num1: Int? = 32
    num1 = null

    var num2: Int = 32
        //num2 = null can't do this

    var p4: Person? = Person("foo")
    p4 = null
}