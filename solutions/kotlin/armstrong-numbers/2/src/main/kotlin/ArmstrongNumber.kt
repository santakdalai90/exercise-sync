import kotlin.math.abs
import kotlin.math.log10
import kotlin.math.pow

object ArmstrongNumber {
    fun check(input: Int): Boolean = "$input".run {sumOf{it.digitToInt().toDouble().pow(length).toInt()} == input}
}
