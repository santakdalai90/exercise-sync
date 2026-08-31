object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> =
        Signal.entries.filterIndexed { index, _ ->  number and (1 shl index) != 0}
            .let{signals -> if (number and (1 shl 4) != 0) signals.reversed() else signals}
}