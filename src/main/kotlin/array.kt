fun main(){
    var languages= arrayOf("Python", "Kotlin", "Java")

    println(languages[0]) //Assessing an Element

    languages[0]="Javascript" //Changing an Element
    println(languages[0])

    var language=languages.plus("c") //Adding an element
    for(lang in language){
        println(lang)
    }

    for (c in languages){
        println(c)
    }

    println(languages.size)
}