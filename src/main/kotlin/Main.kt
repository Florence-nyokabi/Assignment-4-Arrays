fun main(args: Array<String>) {
    // Invoking myArray()
    myArray()

    // Invoking cityNames()
    cityNames()

    // Invoking digitalList()
    digitList()

    // Invoking askNames()
    askNames("Florence", "Beth", "Ian")
    askNames("Bob", "Ruby", "Ada")
}

/*
Question 1
Create a function that takes in 4 strings and creates an array out of them then
prints out the array.
 */

fun myArray(){
    val cars = arrayOf("BMW", "Volkswagen", "Mazda", "Ford")
    println(cars.contentToString())
}


/*
Question 2
Create a function that given an array below:

var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
prints out the names of the cities in the correct grammatical case.
 */

fun cityNames(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    var gramaticalCase = cities.map { it.capitalize()}
    println(gramaticalCase.sorted())
}


/*
Question 3
Create one function that given the below array:

var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
(i) prints out the sum of the second and fifth elements
(ii) prints out the index of 158 (1 point)
(iii) prints out the elements in ascending order
 */

fun digitList(){
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sum = numbers[1] + numbers[4] // sum of second and fifth elements.
    println(sum)

    println(numbers.indexOf(158)) // finding the index of 158

    println(numbers.sortedArray().contentToString()) // ascending order.
}


/*
Question 4
Create a function that takes in 3 names and returns a string array containing
all 3 names.
 */
fun askNames(name1: String, name2: String, name3: String){
    var nameArray = arrayOf(name1, name2, name3)
    println(nameArray.contentToString())

}