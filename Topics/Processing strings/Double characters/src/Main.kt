fun main() {
    // write your code here
    val input = readLine()!!
    val result = input.map { it.toString() + it.toString() }.joinToString("")
    println(result)
}