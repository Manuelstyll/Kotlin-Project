import java.util.Scanner

fun main(){
    var read= Scanner(System.`in`)

    println("Enter side A:")
    var sideA=read.nextInt()
    println("Entered side A")

    println("Enter side B:")
    var sideB=read.nextInt()
    println("Entered side B")

    println("Enter height:")
    var height=read.nextInt()
    println("Entered height")

    var area=(sideA+sideB)/2*height
    println("Area of trapezium = $area")
}