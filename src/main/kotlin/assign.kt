import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Enter your Diameter:")
    var diameter= read.nextInt()
    println("Entered $diameter")

    val pi =3.142
    var perimeter=(diameter*pi)
    println("Perimeter of Circle = $perimeter")



}