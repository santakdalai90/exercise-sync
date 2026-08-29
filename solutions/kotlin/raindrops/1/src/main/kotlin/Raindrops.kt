object Raindrops {
    fun convert(n: Int): String = mapOf(3 to "Pling", 5 to "Plang", 7 to "Plong").filterKeys { n%it == 0 }.values.joinToString("").ifEmpty { n.toString() }
}