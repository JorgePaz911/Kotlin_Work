package kotlin1

import java.util.*

enum class AccountType{
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}

//enum with constructor parameters
enum class AccountTypeConstructor(val discount: Int, val subs: Int){
    BRONZE(10, 1),
    SILVER(15, 5),
    GOLD(20, 10),
    PLATINUM(25, 15)
}

private class UserBank(var name: String, var account: AccountType = AccountType.BRONZE){

    fun info() = "Name: $name | Account: $account"

}

private class UserBank2(var name: String, var account: AccountTypeConstructor = AccountTypeConstructor.BRONZE){

    fun info() = "Name: $name | Account: $account"

}

fun main() {
    println(AccountType.SILVER)
    val accountTypeFromApi = "gold"
    val accountType = AccountType.valueOf(accountTypeFromApi.uppercase(Locale.getDefault()))
    println(accountType == AccountType.GOLD)

    var user1 = UserBank("Jane")
    user1.account = AccountType.PLATINUM
    println(user1.info())

    var user2 = UserBank2("John", AccountTypeConstructor.GOLD)
    println(user2.info())
    println("Discount: ${user2.account.discount}")
    println("Subscriptions: ${user2.account.subs}")


}