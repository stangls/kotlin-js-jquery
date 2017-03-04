
fun main(args: Array<String>) {
    //js("require('jQuery');")
    println("Hello JavaScript!")
    //val arr = Array<Int>(10,{ 0 })
    x();
}

fun require(pkg:String) {
    js("var req = require(pkg)")
}
