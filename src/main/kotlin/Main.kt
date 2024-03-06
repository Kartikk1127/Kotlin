import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("start of the program")

    runBlocking {
        println("coroutine started")

        val job = launch{
            val result = fetchData()
            println(result)
        }

        println("other tasks being performed")

        job.join()

        println("coroutine completed")
    }
}

suspend fun fetchData(): String{

    delay(2000)
    return "data fetched successfully"
}