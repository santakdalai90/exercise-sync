class Dna(val sequence: String) {
    val nucleotideCounts
        get() = mapOf('A' to 0, 'C' to 0, 'T' to 0, 'G' to 0) + sequence.groupingBy {it}.eachCount()
    
    init {
        require(sequence.all {it in "ACGT"})
    }
}
