class Anagram(private val source: String) {
    fun match(anagrams: Collection<String>): Set<String> {
        val lowerSource = source.lowercase()
        val sourceFreq = lowerSource.groupingBy { it }.eachCount()
        return anagrams.filterTo(mutableSetOf()) { anagram ->
            val lowerAnagram = anagram.lowercase()
            lowerSource.length == lowerAnagram.length &&
                    lowerSource != lowerAnagram && sourceFreq == lowerAnagram.groupingBy { it }.eachCount()
        }
    }
}
