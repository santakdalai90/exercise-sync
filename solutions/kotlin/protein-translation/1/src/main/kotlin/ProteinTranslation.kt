fun translate(rna: String?): List<String> {
     val codons = mapOf(
         "AUG" to "Methionine",
         "UUU"	to "Phenylalanine",
         "UUC"	to "Phenylalanine",
         "UUA" to "Leucine",
         "UUG" to "Leucine",
         "UCU"	to "Serine",
          "UCC"	to "Serine",
         "UCA"	to "Serine",
          "UCG"	to "Serine",
         "UAU" to	"Tyrosine",
         "UAC" to	"Tyrosine",
         "UGU"	to "Cysteine",
         "UGC"	to "Cysteine",
         "UGG" to	"Tryptophan",
         "UAA"	to "STOP",
         "UAG"	to "STOP",
         "UGA"	to "STOP"
     )

     val proteins = mutableListOf<String>()
     var chunks  = rna?.chunked(3) ?: emptyList()
     for (chunk in chunks) {
         val protein = codons[chunk] ?: throw IllegalArgumentException()
         if (protein == "STOP") {
             break
         }
         proteins.add(protein)
     }
     return proteins
}
