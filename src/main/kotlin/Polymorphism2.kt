open class shape{
    open fun area(){
        println("Calculating area")
    }
}

class circle:shape(){
    override fun area(){
        println("Calculating area of circle")
    }
}

class triangle:shape(){
    override fun area(){
        println("Calculating area of triangle")
    }
}

class rectangles:shape(){
    override fun area(){
        println("Calculating area of rectangle")
    }
}

fun main(){
    var c=circle()
    c.area()
    var t=triangle()
    t.area()
    var r=rectangles()
    r.area()

}