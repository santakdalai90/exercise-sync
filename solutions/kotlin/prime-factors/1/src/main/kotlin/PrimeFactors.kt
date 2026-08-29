object PrimeFactorCalculator {
    fun primeFactors(int: Int): List<Int> = primeFactors(int.toLong()).map(Long::toInt)
    fun primeFactors(long: Long): List<Long> = buildList {
        var (x, f) = long to 2L
        while (f*f <= x) if (x % f == 0L) { add(f); x /= f } else f++
        if (x > 1L) add(x)
    }
}