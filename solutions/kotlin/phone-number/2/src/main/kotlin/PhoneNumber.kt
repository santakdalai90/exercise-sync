class PhoneNumber(input: String) {
    val number: String

    init {
        var digits = input.filter { it.isDigit() }
        require(digits.length in 10..11)
        if (digits.length == 11) {
            require(digits.startsWith('1'))
            digits = digits.substring(1)
        }

        if (digits[0] !in '2'..'9' || digits[3] !in '2'..'9') {
            throw IllegalArgumentException()
        }

        number = digits
    }
}