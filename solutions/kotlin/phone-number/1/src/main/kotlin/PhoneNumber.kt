class PhoneNumber(input: String) {

    var number: String

    init {
        number = input.filter { it.isDigit() }
        require(number.length in 10..11)
        if (number.length == 11) {
            if (number[0] != '1') {
                throw IllegalArgumentException()
            } else {
                number = number.substring(1)
            }
        }

        if (number[0] !in '2'..'9' || number[3] !in '2'..'9') {
            throw IllegalArgumentException()
        }
    }


}
