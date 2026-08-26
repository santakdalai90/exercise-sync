class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
    private val x = a.toDouble()
    private val y = b.toDouble()
    private val z = c.toDouble()
    
    init {
        require(x > 0 && y > 0 && z > 0) {"All sides must be greater than zero"}
        require(x+y>=z && y+z>=x && x+z>=y) {"Triangle inequality violated"}
    }

    val isEquilateral: Boolean = x == y && x == z
    val isIsosceles: Boolean = x == y || y == z || x == z
    val isScalene: Boolean = x!=y && y!=z && x!=z
}
