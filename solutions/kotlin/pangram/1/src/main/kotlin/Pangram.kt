object Pangram {
    fun isPangram(input: String): Boolean = input.lowercase().filter { it.isLetter() }.groupingBy { it }.eachCount().size == 26
}