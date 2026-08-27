import kotlin.math.pow
class Squares(val n: Int) {
    fun sumOfSquares() = (n * (n + 1) * (2 * n + 1)) / 6
    fun squareOfSum() = ((n.toDouble() * (n + 1)) / 2).pow(2).toInt()
    fun difference() = squareOfSum() - sumOfSquares()
}