object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        if (start <= 0) {
            throw IllegalArgumentException()
        }
        if (start == 1) {
            return 0
        }
        if (start %2 == 0) {
            return 1 + computeStepCount(start / 2)
        } else {
            return 1 + computeStepCount(start * 3 + 1)
        }
    }
}
