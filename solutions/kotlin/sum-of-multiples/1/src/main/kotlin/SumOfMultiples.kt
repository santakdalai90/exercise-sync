object SumOfMultiples {
    fun sum(factors: Set<Int>, limit: Int): Int {
        val multiples = mutableSetOf<Int>()
        for (f in factors) {
            if (f == 0) {
                continue
            }
            var i = 1
            while(f*i < limit) {
                multiples.add(f*i)
                i++
            }
        }
        var sum = 0
        for (m in multiples) {
            sum += m
        }
        return sum
    }
}
