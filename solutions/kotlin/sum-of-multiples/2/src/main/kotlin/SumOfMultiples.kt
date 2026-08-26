object SumOfMultiples {
    fun sum(factors: Set<Int>, limit: Int): Int {
       var validFactors = factors.filter { it > 0 }
       if (validFactors.isEmpty() || limit <= 1) return 0

        return (1 until limit)
                .filter{n -> validFactors.any{f -> n%f == 0}}
                .sum()
    }
}
