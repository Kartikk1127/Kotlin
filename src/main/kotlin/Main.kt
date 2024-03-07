
fun main() {

    val successMessage: Result = Result.Success("with good marks")
    val errorMessage: Result = Result.Error("with bad marks")

    handleResult(successMessage)
    handleResult(errorMessage)
}

fun handleResult(result: Result){
    when(result){
       is Result.Success->{
            println("Passed: ${result.data}")
        }
        is Result.Error->{
            println("Failed: ${result.data}")
        }
    }
}
