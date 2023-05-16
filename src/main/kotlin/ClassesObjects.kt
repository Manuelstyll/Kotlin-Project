class Person{
    //Variables/Attributes/Properties/Data Members
    var name:String="Manuel"
    var age:Int=20
    var location:String="Nairobi"
    var yearOfBirth:Int=1980

    //Functions/Variables
    fun eat(){
        println("Eating")
    }

    fun sleep(){
        println("Sleeping")
    }
}

fun main(){
    var teacher=Person()
    println(teacher.location)

    teacher.eat()

    var honda=Car()
    println(honda.make)
    honda.stop()

    var swift=Car()
    println(swift.model)
    swift.drive()

    println(swift.make+" "+swift.model+" "+swift.color+" "+swift.drivingspeed)

}

class Car{
    var make:String="Toyota"
    var model:String="Supra"
    var color:String="Red"
    var drivingspeed:Int=200

    fun drive(){
        println("Driving")
    }

    fun turn(){
        println("Turning")
    }

    fun stop(){
        println("Stopping")
    }
}