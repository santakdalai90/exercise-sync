object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> = buildMap {
        for ((point, letters) in source) {
            for (letter in letters) {
                put(letter.lowercaseChar(), point)
            }
        }
    }
}
