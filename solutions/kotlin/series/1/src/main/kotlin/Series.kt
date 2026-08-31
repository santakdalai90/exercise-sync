object Series {
    fun slices(n: Int, s: String): List<List<Int>> {
        require(s.isNotEmpty())
        require(n in 1..s.length)
        return s.windowed(n){window -> window.map { it.digitToInt() }}
    }
}
