object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        require(leftStrand.length == rightStrand.length)
        var hamming = 0
        for (i in leftStrand.indices) {
            if (leftStrand[i] != rightStrand[i]) {
                hamming++
            }
        }
        return hamming
    }
}
