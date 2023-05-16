import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Calculator Programme")

    println("Enter first number:")
    var num1 = read.nextFloat()
    println("First number entered")

    println("Enter second number:")
    var num2 = read.nextFloat()
    println("Second number entered")

    println("Enter operator:")
    var operator = readLine()
    println("Operator entered")

    var answer= when(operator){
        "+"->num1+num2
        "-"->num1-num2
        "*"->num1*num2
        "/"->num1+num2

        else-> "Invalid Input"
    }
    println("Answer = $answer")
}