import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Positive and Negative Reader")

    println("Enter number:")
    var num1 = read.nextInt()
    println("Number entered")

    if(num1 < 0){
        println("Number is negative")
    }
    else if(num1>0){
        println("Number is positive")
    }
    else{
        println("Number is neutral")
    }
}