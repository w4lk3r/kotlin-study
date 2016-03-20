package demo

/**
 * Created by wangkang on 2/13/16.
 */
fun main(args: Array<String>) {

    val sum1 = sum1(3, 5)
    println("sum1: 3 + 5 = ${sum1}")

    var sum2: Int;
    sum2 = sum2(3, 5)
    println("sum2: 3 + 5 = ${sum2}")

    val max1 = max1(3, 5)
    println("max1: 3 , 5 = ${max1}")

    val max2 = max2(3, 5)
    println("max2: 3 , 5 = ${max2}")
}

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun max1(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun max2(a: Int, b: Int) = if (a > b) a else b