import kotlin.math.round
import kotlin.math.roundToInt

data class Person(var name: String ="", var age: Int = 0)

fun main(){
//    var list = listOf(1, 2, 3)
//    var list = mutableListOf(1, 3)
//    list.add(123)
//    print(list)

    val numbers = mutableListOf("one", "two", "one",  "three", "two")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[0]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")
    println("Last index of element \"two\" ${numbers.lastIndexOf("two")}")
    println("First element: ${numbers.first()}")
    println("First element: ${numbers.last()}")
    println(numbers.subList(1, 3))
    println("List contains two?: ${numbers.contains("twou")}")
    println("twoh" in numbers)
    println(numbers.indices)
    println(numbers.asReversed())
    println(numbers.distinct())
    println(numbers.drop(3))
    println(numbers.dropLast(3))
    println(numbers.chunked(numbers.size/2 + 1))
    println((numbers.size.toFloat() / 2).roundToInt())
    var sortedNumbers =  numbers.sorted()
    println(sortedNumbers)

    val bob = Person("Bob", 31)
    val alice = Person("Alice", 16)
    var people = listOf(bob, alice)
    people[0].name = "Bob"
    println(people)

    var people2 = listOf(mutableListOf("Bob", 31), mutableListOf("Alice", 16))
    people2[0][0] = 2345263543
    println(people2)
//    API заправок -> json
}