fun main(args: Array<String>) {
    //$
    var x = 42
    var value = "x的值是$x"

    var myArray = arrayOf(1, 2, 3)
    var arraySize = "myArray的大小是${myArray.size}"
    var firstItem = "第一个变量是${myArray[0]}"

    var result = "myArray是${if (myArray.size > 10) "大的" else "小的"}"
}