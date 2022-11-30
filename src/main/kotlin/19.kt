fun main(args: Array<String>) {
    val x = 3
    val y = 1
    /*
    if (x > y){
        println("x比y大")
    } else {
        println("x不比y大")
    }
    */
    println(if (x > y) "x比y大" else "x不比y大")
    println("无论怎么样这一行都将会被执行")
}