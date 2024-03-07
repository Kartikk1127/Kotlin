sealed class Result {
    class Success(val data: String): Result()
    class Error(val data: String): Result()
}