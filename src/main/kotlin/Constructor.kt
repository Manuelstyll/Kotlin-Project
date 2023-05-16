class Dog(var color:String,var breed:String,var sex:String,var age:Int){

}
fun main(){
    var d=Dog("white", "German Shepherd", "Female", 5)

      println(d.color)
      println(d.color+" "+d.breed+" "+d.sex+" "+d.age)

    var puppy=Dog("brown", "Kenyan", "Male", 2)
    println(puppy.breed)
    println(puppy.color+" "+puppy.breed+" "+puppy.sex+" "+puppy.age)
}

