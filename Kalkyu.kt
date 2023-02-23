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

fun factorial(n: Int): Any {
  var result = n
  for(i in n downTo 1) {
    if (i == 1) {
      break
    }
    else {
      result = result * (i - 1)
    }
  }
  println (result)
  return result
}
fun main() {
    println("Enter your arithmetic operation: (Please use space for readability)")

    var input: String? = readLine()

    while (input != null && input.isNotBlank()) {
        val values: List<String> = input.split(' ')
        
        if (values.size == 2) {
            val operator: String = values[1]
            val num3 = values[0].toIntOrNull() ?: throw IllegalArgumentException("INVALID INPUT: ${values[2]}")
            val answer = when (operator) {
                "!" -> factorial(num3)

                else -> throw IllegalArgumentException("INVALID OPERATOR: $operator")
            }
        }
        else if (values.size < 2) {
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