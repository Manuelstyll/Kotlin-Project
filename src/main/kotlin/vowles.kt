import java.util.Scanner

fun main(){
    var read= Scanner(System.`in`)

    println("Vowel And Consonant reader")
    println("Enter a letter:")
    var letter:String=readln()

    if (letter=="a"|| letter=="e" || letter=="i"|| letter=="o" ||  letter=="u"){
        println("$letter is a vowel")
    }

    else{
        println("$letter is a consonant")
    }

}