import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond(input: LocalDateTime) {
    constructor(input: LocalDate): this(LocalDateTime.of(input, LocalTime.MIDNIGHT))
    val date: LocalDateTime = input.plusSeconds(1000000000)
}
