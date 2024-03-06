class FastClass {
    private val slowObject: SlowClass by lazy {
        SlowClass()
    }

    fun access() {
        println(slowObject)
    }
}