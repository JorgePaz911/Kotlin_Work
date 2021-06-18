

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

    println(FavoriteFood.name)
    FavoriteFood.ingredients.forEach { println(it) }

    FavoriteFood.name = "Pasta"
    println(FavoriteFood.name)

    println(FavoriteFood.ingredients[1])
}