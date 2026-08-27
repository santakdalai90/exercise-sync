class Clock(hours: Int, minutes: Int) {
    private var totalMinutes: Int = Math.floorMod(hours*60 + minutes, 24*60)
    val hours get() = totalMinutes / 60
    val minutes get() = totalMinutes % 60
    fun add(inputMinutes: Int) {totalMinutes = Math.floorMod(totalMinutes + inputMinutes, 24*60) }
    fun subtract(inputMinutes: Int) = add(-inputMinutes)
    override fun toString(): String = String.format("%02d:%02d", hours, minutes)
    override fun equals(other: Any?): Boolean = other is Clock && totalMinutes == other.totalMinutes
    override fun hashCode(): Int = totalMinutes
}