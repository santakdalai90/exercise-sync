fun reverse(input: String): String {
    if (input.isEmpty()) {
        return input
    }

    return reverse(input.substring(1)) + input.first()
}
