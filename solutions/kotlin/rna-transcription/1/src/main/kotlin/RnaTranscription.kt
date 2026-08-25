fun transcribeToRna(dna: String): String {
    var rna = ""
    for (n in dna) {
        rna += when (n) {
            'G' -> "C"
            'C' -> "G"
            'T' -> "A"
            'A' -> "U"
            else -> throw IllegalArgumentException()
        }
    }
    return rna
}
