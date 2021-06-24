package kotlin4




fun main(){

    val names = mutableSetOf("john", "jane", "don", "john")
    names.add("jenny")
    //println(names)

    val people = mutableSetOf(
        Person("John"),
        Person("John"),
        Person("Jane")
    )
    //println(people)

    val otherPeople = mutableListOf(
        Person("Mary"),
        Person("Jane"),
        Person("Carl"),
        Person("Dylan")
    )

    //union combines two lists and has no duplicates like a set
    val uniquePeople = people.union(otherPeople).union(listOf(Person("Barry")))
    println(uniquePeople)

}


private data class Person(val name: String)