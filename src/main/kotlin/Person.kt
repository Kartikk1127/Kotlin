class Person {

    var _age = 0
        set(value) {
            if (value>=0){
                field=value
            } else {
                println("age cannot be negative")
            }
        }
        get() {
            println("getting age of the person")
            return field
        }
}