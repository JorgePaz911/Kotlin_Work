package kotlin1

class LateInit() {

    lateinit var name: String
    //lateinit val age: Int //cannot lateinit a val

}

fun main() {
    var obj = LateInit()
    //obj.name = "Jane" //without this line we get an error. must be initialized before using
    println(obj.name)
}