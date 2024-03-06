
fun main() {
    val result1 = "Hello, Kotlin"
        .let {
            println(it)
            it.length
        }
    println("Length: $result1")

    val result2 = with("Kotlin"){
        println(length)
        length
    }

    println(result2)
}
