class Person constructor(var firstName: String,
                         var lastName: String,
                         var middleName: Char,
                         var age: Int) {

    var fullName: String = ""
    var

    init {
        // Random comment
        fullName = "$firstName $middleName $lastName"
    }

    fun printAll(){
        println("$firstName $middleName $lastName is $age")
    }
}