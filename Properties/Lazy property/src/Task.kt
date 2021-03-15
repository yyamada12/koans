class LazyProperty(val initializer: () -> Int) {
    var a: Int? = null
    val lazy: Int
        get() {
            if (a == null) {
                a = initializer()
            }
            return a!!
        }
}
