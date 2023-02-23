import kotlin.IllegalArgumentException
import kotlin.system.exitProcess


fun pow(n: Double, m: Double): Any {
    val result= Math.pow(n,m)
    return when {
        m > 1 -> result
        m==1.0 -> n
        else -> 1
    }
}
fun main() {
    println("Enter your arithmetic operation: (Please use space for readability)")

    var input: String? = readLine()

    while (input != null && input.isNotBlank()) {
        val values: List<String> = input.split(' ')

        if (values.size < 3) {
            println("Invalid input. Expected: value + value. Received: $input")
        } else {
            val operator: String = values[1]
            val num1 = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("INVALID INPUT: ${values[0]}")
            val num2 = values[2].toDoubleOrNull() ?: throw IllegalArgumentException("INVALID INPUT: ${values[2]}")

            val answer = when (operator) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> num1/num2
                "%" -> num1 % num2
                "^" -> pow(num1, num2)

                else -> throw IllegalArgumentException("INVALID OPERATOR: $operator")
            }
            println(answer)
        }
        input = readLine()
    }
}
