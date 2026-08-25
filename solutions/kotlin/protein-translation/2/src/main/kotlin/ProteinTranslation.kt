private val codons = mapOf(
    "AUG" to "Methionine",
    "UUU" to "Phenylalanine", "UUC"	to "Phenylalanine",
    "UUA" to "Leucine", "UUG" to "Leucine",
    "UCU" to "Serine", "UCC" to "Serine", "UCA"	to "Serine", "UCG" to "Serine",
    "UAU" to "Tyrosine", "UAC" to "Tyrosine",
    "UGU" to "Cysteine", "UGC" to "Cysteine",
    "UGG" to "Tryptophan",
    "UAA" to "STOP", "UAG" to "STOP", "UGA"	to "STOP"
)

fun translate(rna: String?): List<String> {
     if (rna.isNullOrEmpty()) return emptyList()

     return rna.chunked(3)
             .asSequence()
             .map{chunk -> codons[chunk] ?: throw IllegalArgumentException("Invalid codon: $chunk")}
             .takeWhile{protein -> protein != "STOP"}
             .toList()
}
