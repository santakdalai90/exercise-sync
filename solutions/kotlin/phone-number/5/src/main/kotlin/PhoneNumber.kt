class PhoneNumber(input: String) {
    val number = input.filter { it.isDigit() }.removePrefix("1").also {require(it.matches(Regex("[2-9][0-9]{2}[2-9][0-9]{6}")))}
}