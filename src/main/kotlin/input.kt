import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your name:")
    var name = readln()
    println("My name is $name")

    println("Enter an integer:")
    var num = read.nextInt()
    println("Entered $num")

    println("Enter your float")
    var number = read.nextFloat()
    println("Entered $number")

    println("Enter your length:")
    var length= read.nextInt()
    println("Entered $length")

    println("Enter your width:")
    var width = read.nextInt()
    println("Entered $width")

    var area=length*width
    println("Area is $area")

    println("Enter your radius")
    var rad=read.nextInt()
    println("Entered $rad")

    val pi=3.142

    var area1=rad*rad*pi
    println("Area1 is $area1")
}