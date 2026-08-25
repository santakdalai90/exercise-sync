import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        if (number <= 0 || number > 64) {
            throw IllegalArgumentException()
        }
        return BigInteger("2").pow(number-1)
    }

    fun getTotalGrainCount(): BigInteger {
        return BigInteger("2").pow(64) - BigInteger.ONE
    }
}
