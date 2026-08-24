object EliudsEggs {

    fun eggCount(number: Int): Int{
        var x = number
        var eggCount = 0
        while (x != 0) {
            eggCount += x and 1
            x = x shr 1
        }

        return eggCount
    }
}
