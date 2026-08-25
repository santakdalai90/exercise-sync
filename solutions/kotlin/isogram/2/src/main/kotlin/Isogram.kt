object Isogram {
    fun isIsogram(input: String): Boolean {
        val seen = mutableSetOf<Char>()
        for (letter in input.lowercase()) {
            if (letter.isLetter()) {
                if (!seen.add(letter)) return false
            }
        }
        return true
    }
}
