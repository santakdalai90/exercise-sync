import kotlin.math.floor

class Clock(var hours: Int, var minutes: Int) {
    init {
        hours = (hours + floor(minutes.toDouble() / 60.0).toInt()) % 24
        if (minutes < 0) {
            minutes = ((minutes % 60) + 60)%60
        } else if (minutes >= 60) {
            minutes %= 60
        }

        if (hours < 0) {
            hours = ((hours % 24) + 24)%24
        }
    }

    override fun toString(): String {
        return String.format("%02d:%02d", hours, minutes)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Clock) return false
        return hours == other.hours && minutes == other.minutes
    }

    fun subtract(inputMinutes: Int) {
        add(-inputMinutes)
    }

    fun add(inputMinutes: Int) {
        minutes += inputMinutes
        val c = Clock(hours, minutes)
        hours = c.hours
        minutes = c.minutes
    }
}
