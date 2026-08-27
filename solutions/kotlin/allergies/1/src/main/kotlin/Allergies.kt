class Allergies(private val score: Int) {
    fun getList(): List<Allergen> {
        val allergies = mutableListOf<Allergen>()
        var x = score
        var idx = 0
        while(x != 0) {
            if (((x and 1) == 1) && (idx < Allergen.entries.size)) {
                allergies.add(Allergen.entries[idx])
            }
            x = x shr 1
            idx++
        }
        return allergies
    }

    fun isAllergicTo(allergen: Allergen): Boolean {
        var allergies = getList()
        for (a in allergies) {
            if (a == allergen) {
                return true
            }
        }
        return false
    }
}
