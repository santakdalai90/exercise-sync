object WordCount {
    fun phrase(phrase: String): Map<String, Int> = phrase.lowercase().split("[^a-zA-Z0-9']+".toRegex()).map{it.trim('\'')}.filter { it.isNotEmpty() }.groupingBy { it }.eachCount()
}