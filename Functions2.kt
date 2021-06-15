

fun bookInfo(title: String, vararg authors: String){
    println("Title: $title \nAuthors:")
    authors.forEach { println(it) }
}

fun overload(name: String){
    println("Name is $name")
}
fun overload(name: String, age: Int){
    println("Name is $name and age is $age")
}
fun overload(name: String, age: Int, job: String){
    println("Name is $name, age is $age, and job is $job")
}

fun overload2(name: String, age: Int = 25, job: String = "SW Engineer"){
    println("Name is $name, age is $age, and job is $job")
}

fun main() {
    bookInfo("Green Eggs and Ham", "Dr Seuss", "Jane Doe", "John Doe")
    overload("Jane")
    overload("Jane",21)
    overload("Jane",21,"CEO")

    overload2("Jane")
    overload2("Jane",21)
    overload2("Jane",21,"CEO")
}