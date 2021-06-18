package kotlin1

enum class AccountType2{
    BRONZE,
    SILVER,
    GOLD
}

fun main() {
    var account = AccountType2.GOLD
    //exhaustive when (written as an expression)
    val message = when(account){
        AccountType2.BRONZE -> "Bronze Member"
        AccountType2.SILVER -> "Silver Member"
        else -> "Other"
    }
}