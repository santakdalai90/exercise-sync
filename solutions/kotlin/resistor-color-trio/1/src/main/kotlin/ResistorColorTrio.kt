object ResistorColorTrio {
    fun text(vararg input: Color): String {
        require(input.size >= 3)
        var resistance = (input[0].ordinal*10L + input[1].ordinal)
        repeat(input[2].ordinal){resistance *= 10L}

        var unit = 0
        while (resistance >= 1000L && unit < Unit.entries.lastIndex) {
            resistance /= 1000L
            unit++
        }

        return "$resistance ${Unit.entries[unit].name.lowercase()}"
    }
}
