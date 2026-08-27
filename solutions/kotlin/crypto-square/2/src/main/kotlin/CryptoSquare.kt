import kotlin.math.ceil
import kotlin.math.sqrt

object CryptoSquare {

    fun ciphertext(plaintext: String): String {
        var normalizedText = plaintext.filter { it.isLetterOrDigit() }.lowercase()
        val c = ceil(sqrt(normalizedText.length.toDouble())).toInt()
        val r = ceil(normalizedText.length.toDouble() / c).toInt()

        val spaceCount = c*r - normalizedText.length
        normalizedText += " ".repeat(spaceCount)
        var final = ""
        for ( i in 0 until c) {
            for (j in 0 until r) {
                final += normalizedText[i + j*c]
            }
            if (i != c-1) {
                final += " "
            }
        }
        return final
    }

}
