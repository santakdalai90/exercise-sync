object RunLengthEncoding {

    fun encode(input: String): String {
        if (input.length <= 1) return input
        return buildString {
            var count = 1
            for (i in 1 until input.length) {
                if (input[i] == input[i - 1]) {
                    count++
                } else {
                    if (count > 1) append(count)
                    append(input[i - 1])
                    count = 1
                }
            }
            if (count > 1) append(count)
            append(input.last())
        }
    }

    fun decode(input: String): String {
        return buildString {
            var count = ""
            for (i in input.indices) {
                if (input[i].isDigit()) {
                    count += input[i]
                } else {
                    repeat(if (count.isEmpty()) 1 else count.toInt()) { append(input[i]) }
                    count = ""
                }
            }
        }
    }
}
