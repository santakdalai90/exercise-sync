class RotationalCipher(val n: Int) {
    fun encode(text: String) = buildString(text.length) {
        for (c in text) {
            if (c.isLetter()) {
                val start = if (c.isUpperCase()) 'A' else 'a'
                append(start + ((c - start + n) % 26))
            } else {
                append(c)
            }
        }
    }
}
