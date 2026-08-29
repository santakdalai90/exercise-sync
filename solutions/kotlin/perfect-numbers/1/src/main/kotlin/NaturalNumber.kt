enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    require(naturalNumber > 0)
    val sum = (1..naturalNumber/2).filter { naturalNumber%it == 0 }.sum()
    return when{
        sum < naturalNumber -> Classification.DEFICIENT
        sum > naturalNumber -> Classification.ABUNDANT
        else -> Classification.PERFECT
    }
}
