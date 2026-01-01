object Acronym {
    fun generate(phrase: String) : String {
        // remove puntuations
        return phrase
            .filter { it.isLetterOrDigit() || it.isWhitespace() || it == '-' }
            .replace('-', ' ')
            .split(Regex("\\s+"))
            .map { it.first().uppercaseChar() }
            .joinToString("")
    }
}
