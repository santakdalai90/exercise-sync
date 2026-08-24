object Bob {
    private fun isShouting (s: String): Boolean =
        s.any { it.isLetter() } && s.uppercase() == s
    
    fun hey(inp: String): String {
        val input = inp.trim()
        val isQuestion = input.endsWith('?')
        val isYelling = isShouting(input)

        return when {
            input.isEmpty() -> "Fine. Be that way!"
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isQuestion -> "Sure."
            isYelling -> "Whoa, chill out!"
            else -> "Whatever." 
        }
    }
}
