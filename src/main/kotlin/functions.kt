import javax.print.attribute.standard.MediaSize.NA

//Predefined functions
fun main(){
    println("Kotlin")

    var squareroot=Math.sqrt(81.0)
    println(squareroot)

    var round=Math.ceil(3.45)
    println(round)

    var round1=Math.round(3.45)
    println(round1)

    myFun()
    add(56,12)
    add(61,16)
    myDetails("Manuel", 20)
}

//User-defined Functions
fun myFun(){
    println("Today is Friday")
}

fun add(num1:Int,num2:Int){
    println(num1+num2)
}

fun myDetails(name:String,age:Int){
    println("$name is $age years old")
}