object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val result = mutableListOf<Any>()
        for (item in source) {
            if (item is Collection<*>) {
                result.addAll(flatten(item))
            } else {
                if (item != null) {
                    result.add(item)
                }
            }
        }
        return result
    }
}
