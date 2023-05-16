class person(var name:String,var age:Int,var job_status:String,var gender:String){

}

fun main(){
    var person1=person("Rita", 18, "Unemployed", "Female")
        println(person1.name+" "+person1.age+" "+person1.job_status+" "+person1.gender)
    var person2=person("David", 43, "Unemployed", "Male")
        println(person2.name+" "+person2.age+" "+person2.job_status+" "+person2.gender)


    var dog1=dog("Neapolitan Matsiff","large",5, "Black")
        println(dog1.breed)
    var dog2=dog("Maltese", "Small", 2, "White")
        println(dog2.breed)
    var dog3=dog("Chow Chow","Medium",6,"Brown")
        println(dog3.breed)

}

class dog(var breed:String,var size:String,var age:Int,var color:String){

    fun Eat(){
        println("Eating")
    }

    fun Sleep(){
        println("Sleeping")
    }

    fun Sit(){
        println("Sitting")
    }
    fun Run(){
        println("Running")
    }
}