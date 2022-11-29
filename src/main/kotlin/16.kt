fun main() {
    //这是一个单行注释
    //进行一些操作（一般语句）
    var x = 3
    var name = "Cormoran"
    x = x + 10
    print("x is $x")
    //重复进行某个操作（循环语句）
    while (x > 20){
        x = x - 1
        print("x is now $x")
    }
    for (i in 1..10){
        x = x + 1
        print("x is now $x")
    }
    //在满足条件的情况下进行某项操作（条件分支）
    if (x == 20) {
        println("x must be 20")
    } else {
        println("x isn't 20")
    }
    if (name.equals("Cormoran")) {
        println("$name Strike")
    }
}