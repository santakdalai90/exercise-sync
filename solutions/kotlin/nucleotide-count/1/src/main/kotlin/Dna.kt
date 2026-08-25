class Dna(val sequence: String) {
    val nucleotideCounts: Map<Char, Int>
    
    init {
        val m = mutableMapOf('A' to 0, 'C' to 0, 'T' to 0, 'G' to 0)
        for (letter in sequence) {
            require(letter in m.keys)
            m[letter] = m.getOrDefault(letter, 0) + 1
        }
        nucleotideCounts = m
    }
}
