class Allergies(private val score: Int) {
    fun getList(): List<Allergen> =
        Allergen.entries.filter(::isAllergicTo)

    fun isAllergicTo(allergen: Allergen): Boolean =
        (score and (1 shl allergen.ordinal)) != 0
}
