object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> = source.flatMap { item ->
        when(item) {
            null -> emptyList()
            is Collection<*> -> flatten(item)
            else -> listOf(item)
        }
    }
}
