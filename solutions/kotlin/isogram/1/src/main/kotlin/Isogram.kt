object Isogram {
    fun isIsogram(input: String): Boolean {
        val freq = mutableMapOf<Char, Int>()
        val lowerInput = input.lowercase()
        for (letter in lowerInput) {
            if (letter == ' ' || letter == '-') continue
            var currentFreq = freq.getOrDefault(letter, 0) + 1
            if (currentFreq > 1) {
                return false
            }
            freq[letter] = currentFreq
        }
        return true
    }
}
