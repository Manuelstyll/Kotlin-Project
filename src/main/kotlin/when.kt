fun main(){
    var number=3

    var result = when(number){
        1->"one"
        2->"two"
        3->"three"
        4->"four"
        5->"five"
        else->"Invalid Number"
    }
    println("The number is $result")
}