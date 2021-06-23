package kotlin5

typealias AuthToken = String

data class UserAuth(val username: String, val token: AuthToken)
data class Order(val token: AuthToken)

fun main(){
    val user = UserAuth("Jane", "1421-1324252389")
    val order = Order(user.token)
}