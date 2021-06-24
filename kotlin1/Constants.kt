package kotlin1

object Constants{
    //const is compile time vs just val runtime
    const val MAX_AGE = 18
    const val MIN_AGE = 10
}

class ClassConstant{
    companion object{
        const val MAX_AGE = 18
    }
}


fun main(){
    Constants.MAX_AGE
    ClassConstant.MAX_AGE
}