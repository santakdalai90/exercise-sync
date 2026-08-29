class PhoneNumber(input: String) {
    val number: String

    init {
        var digits = input.filter { it.isDigit() }.removePrefix("1")
        require(digits.length == 10)
        require(digits[0] !in "01")
        require(digits[3] !in "01")
        number = digits
    }
}