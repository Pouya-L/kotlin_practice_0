/*Asks the users for two numbers and prints on whichever is the larger number*/
fun exercise_1_v1() {
    var firstNum : Int?
    var secondNum : Int?
    while (true)
    {
        print("What is the first number?")
        val firstInput = readLine()
        firstNum = firstInput?.toIntOrNull()
        if (firstNum != null)
            break
        else
            println("Please enter a valid number")
    }
    while (true)
    {
        print("What is the second number?")
        val secondInput = readLine()
        secondNum = secondInput?.toIntOrNull()
        if (secondNum != null)
            break;
        else
            println("Please enter a valid number")
    }
    if (firstNum != null && secondNum != null)
    {
        if (firstNum > secondNum)
            println(firstNum)
        else
            println(secondNum)
    }
}

/*Asks the users for two numbers and prints on whichever is the larger number*/
fun exercise_1() {
    val firstNum : Int
    val secondNum : Int

    firstNum = readValidNumber("What is the first number?")
    secondNum = readValidNumber("What is the second number?")
    if (firstNum > secondNum)
        println("The bigger number is $firstNum")
    else
        println("The bigger number is $secondNum")
}

/*Asks the user for a name that is a string, then asks for the age that is a not null integer.
then it prints whether the person is of legal age or not.*/
fun exercise_2() {
    var age: Int
    var name: String

    name = nameChecker("Enter your name")
    age = readValidNumber("Enter your age")
    if (age >= 18)
        println("$name is of legal age")
    else
        println("$name is not of legal age")
}

//a practice with boolean values and && and || operators
fun exercise_3()
{
    val result1 : Boolean
    val result2 : Boolean
    val result3 : Boolean
    val result4 : Boolean
    val result5 : Boolean
    val result6 : Boolean
    val result7 : Boolean
    val result8 : Boolean

    val a = 2
    val c = 3
    val d = 2.5
    val b1 = false
    result1 = a != 2
    result2 = a < c
    result3 = a > 1 && a < c
    result4 = !(a == 2)
    result5 = (a < c) && (!(a >= 3) || b1)
    result6 = (a > 3 || b1) && (a + 1 == 4)
    result7 = b1 || !b1 && a > 3
    result8 = !(!(c / 6 > 0) != false) && (d.toInt() == 2*(c - 2))
    println("The results are as follows")
    println("result1 = $result1")
    println("result2 = $result2")
    println("result3 = $result3")
    println("result4 = $result4")
    println("result5 = $result5")
    println("result6 = $result6")
    println("result7 = $result7")
    println("result8 = $result8")
}

//a practice with if and else if statements
fun exercise_4()
{
    var n1 : Int
    var n2 : Int
    val n3 = 4
    val teste = true || false
    val outroTeste = true && true
    n2 = n3
    n1 = n2
    if (teste) {
        n1 = n1 + 1
    } else if (outroTeste) {
        n1 = n1 + 2
    } else {
        n2 = n2 * 2
    }
    val n4 = n1 + n2 + n3
    println("n1 = $n1")
    println("n2 = $n2")
    println("n3 = $n3")
    println("n4 = $n4")
}

/*Gets the name month and the year from the terminal, and then calculates how many days was in
 that month*/
fun exercise_5()
{
    val month : Int
    val year : Int

    printBannerDC();
    month = readValidMonth("Which month of the year? (eg. January is 1," +
            " February is 2 and so on)")
    year = readValidNumber("Which year? (eg. 1998)")

    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        println("${monthName(month)}, $year had 31 days")
    if (month == 4 || month == 6 || month == 9 || month == 11)
        println("${monthName(month)}, $year had 30 days")
    if (month == 2)
    {
        if (checkLeapYear(year))
            println("$year was a leap year; therefore, ${monthName(month)} had 29 days.")
        else
            println("${monthName(month)}, $year had 28 days")
    }
}