
fun main() {

    /*val successMessage: Result = Result.Success("with good marks")
    val errorMessage: Result = Result.Error("with bad marks")

    handleResult(successMessage)
    handleResult(errorMessage)*/

    val person = Person()

    person._age=25

    println("Person's age is : ${person._age}")

    person._age= -1
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
