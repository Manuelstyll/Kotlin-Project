//Parent Class
open class Animal{
    var age:Int=10
    var gender:String="Male"

    fun isMammal(){
        println("Animal is a mammal")
    }
}

//Child Classes
class Duck:Animal(){
    var color:String="Black"

    fun Swim(){
        println("Is swimming")
    }
}

class Fish:Animal(){
    var eating:Boolean=true
    fun Swim(){
        println("Is swimming")
    }
}

class Horse:Animal(){
    var isrunning:Boolean=true
    fun run(){
        println("Is running")
    }
}

fun main(){
    var d=Duck()
    println(d.color)
    var f=Fish()
    println(f.eating)
    var h=Horse()
    println(h.isrunning)


    var c=Circle()
    println(c.radius)
    var r=Rectangle()
    println(r.perimeter)
    var s=Square()


}


//Parent Class2
open class Figure{
    var start:String="Starting"

    var area:Int=200
    var perimeter:Int=100
    var draw:String="Drawing"
}

class Circle:Figure(){
    var radius:Int=15

}

class Rectangle:Figure(){
    var width:Int=10
    var height:Int=14
}

class Square{

}