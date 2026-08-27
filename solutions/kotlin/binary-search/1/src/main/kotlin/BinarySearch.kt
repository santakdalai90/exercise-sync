object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        var start = 0
        var end = list.size - 1
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (list[mid] == item) return mid
            if (list[mid] > item)
                end = mid - 1
            else
                start = mid + 1
        }
        throw NoSuchElementException()
    }
}
