object Darts {

    fun score(x: Number, y: Number): Int {
        val xd = x.toDouble()
        val yd = y.toDouble()
        val distSqrd = xd*xd + yd*yd
        return when {
            distSqrd <= 1.0 -> 10
            distSqrd <= 25.0 -> 5
            distSqrd <= 100.0 -> 1
            else -> 0
        }
    }
}
