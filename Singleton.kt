

//singleton. only 1 instance
object FavoriteFood{
    var name: String = "UNKNOWN"
    var ingredients = mutableListOf<String>()
}

fun main() {
    FavoriteFood.name = "Chicken"
    FavoriteFood.ingredients.add("Salt")
    FavoriteFood.ingredients.add("Pepper")
    FavoriteFood.ingredients.add("Lemon")

    //println(FavoriteFood.ingredients)
    FavoriteFood.ingredients.forEach { println(it) }
}