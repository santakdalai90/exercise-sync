import kotlin.math.abs
import kotlin.math.log10
import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        if (input < 0) return false
        if (input in 0..9) return true

        var x = input

        val numLength = (log10(abs(x.toDouble())) + 1).toInt()

        var sum = 0
        while(x != 0) {
            val digit = x % 10
            sum += digit.toDouble().pow(numLength).toInt()

            if (sum > input) return false

            x /= 10
        }

        return input == sum
    }

}
