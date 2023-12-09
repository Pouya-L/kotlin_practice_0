/*Prompts the user for an Int, then checks if a number is between 5 and 10*/
fun exercise_6()
{
    val num = readValidNumber("Add a number between 5 and 10")
    if (num in 5..10)
        println("Muito bem!")
    else
        println("The number is not between 5 and 10")
}

/*Prompts the user for an Int, then it passes that number into the fluxogram provided in the pdf*/
fun exercise_7()
{
    var sum = 0
    var num = readValidNumber("Enter a number")

    if (num != 7)
        sum += num
    if (sum > 5)
    {
        num *=  2
        sum += num
        if (num < 20 && sum > 15)
            println("Final num is $num")
    }
    println("Final sum is $sum")
}

/*Prompts the user for an Int, then checks if its even or odd and prints the result*/
fun exercise_8()
{
    val num = readValidNumber("Enter a number")
    if (num % 2 == 0)
        println("Number $num is even")
    else
        println("Number $num is odd")
}

/*Prompts the user for an Int, then checks if its even or odd and prints the result
* The ame was to learn how to use let and lambada functions, so had to do everything in one line */
fun exercise_9()
{
    println("Enter a number")
    val number = readln().toInt()
    val result = number.let { it % 2 == 0}
    println("The number $number is ${if (result) "even" else "odd"}")
}

/*Prompts the user for an Int, then checks if its positive, zero or negative and prints the result*/
fun exercise_10() {
    val num = readValidNumber("Enter a number")
    if (num > 0)
        println("Number $num is positive")
    else if (num == 0)
        println("Number $num is zero")
    else
        println("Number $num is negative")
}