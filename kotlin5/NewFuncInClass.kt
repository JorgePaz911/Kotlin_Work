package kotlin5


fun main(){

    val name = "Jorge Paz"
    println(name.initials())

    val age = 17
    println(age.isAdult())
//exception
//    val one = "Yes"
//    println(one.initials())

}
//Extension functions
fun Int.isAdult() = this >= 18

//should go in Extensions.kt class
fun String.initials(): String{
    val values = this.split(' ')
    val first = values[0].substring(0,1)
    val sec = values[1].substring(0,1)
    return "$first$sec"
}