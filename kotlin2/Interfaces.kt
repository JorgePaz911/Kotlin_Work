package kotlin2


interface Discountable{

    fun discountPercent(): Double
    fun isActive(): Boolean

}

class GenericToy : Discountable{
    override fun discountPercent(): Double {
        return 5.3
    }

    override fun isActive(): Boolean {
        return true
    }
}

class DigitalProduct: Discountable{
    override fun discountPercent(): Double {
        TODO("Not yet implemented")
    }

    override fun isActive(): Boolean {
        TODO("Not yet implemented")
    }

}