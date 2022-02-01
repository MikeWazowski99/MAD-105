fun main(){
    val dimArray = arrayOf("Cups","Coffee","Sugar","Cream","Caramel","Ice Cream","Vanilla","Chocolate","Coffee Machine")

    print("Size: ${dimArray.size}")
    print("  ")
    println("Elements: ${dimArray[5]}")

    for (singlePart in dimArray) {
        println("${singlePart}")
    }
}