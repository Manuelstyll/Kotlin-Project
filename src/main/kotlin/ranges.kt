fun main() {
    for (number in 10..15) {
        println(number)
    }

    for (letter in 'c'..'f') {
        println(letter)
    }

    for (number1 in 1..10) {
        println(number1)

        if (number1 == 5) {
            break
        }
    }

    for (letter1 in 'a'..'d') {
        if (letter1 == 'c') {
            continue
        }
        println(letter1)

    }
}