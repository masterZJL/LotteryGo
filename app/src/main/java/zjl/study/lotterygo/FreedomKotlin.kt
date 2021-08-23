package zjl.study.lotterygo

import java.util.*


fun main() {
    for (i in 0..4) {
        val redBalls = redBall().contentToString()
        val blueBall = blueBall()
        println("本期双色球号码为：$redBalls,$blueBall")
    }
}
fun redBall() : IntArray {
    val set = mutableSetOf<Int>()
    while (set.size < 6) {
        set.add(Random().nextInt(33) + 1)
    }
    return sortIntArray(set.toIntArray())
}
fun blueBall(): Int {
    return Random().nextInt(16)+1
}
fun sortIntArray(arr: IntArray): IntArray {
    val mutableList = arr.toMutableList()
    mutableList.sort()
    return mutableList.toIntArray()
}