fun main(){
    val dimArray = arrayOf("Cups","Coffee","Sugar","Cream","Caramel","Ice Cream","Vanilla","Chocolate","Coffee Machine")
    val quant = arrayOf("35", "55", "15", "30", "10", "20", "10","10", "-1")

//    print("Size: ${dimArray.size}")
//    print("  ")
//    println("Elements: ${dimArray[5]}")

//    for (i in 0..dimArray.size - 1) {
//        println("The ${dimArray[i]} has ${quant[i]} items.")
//    }

    var combArray = arrayOf<Array<String>>()

    combArray+= dimArray
    combArray+= quant

    var row = combArray[0].size -1

    for (i in 0..row){
        var items = combArray[0][i]
        var qtys = combArray[1][i]
        println("Please enter the total amount you would like to add or subtract from the $items storage")
        println("In the storage: $items has $qtys items.")
        if (qtys < "0")
            println("\nERROR: Negative numbers is not a valid number of supply please enter a valid number")
        var x = readLine()
        if (x == "5")
            qtys + 5


    }
}