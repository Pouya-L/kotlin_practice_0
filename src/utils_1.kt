/*Prints a banner for the day count calculator*/
fun printBannerDC(){
    val purpleColor = "\u001B[35m"
    val defaultColor = "\u001B[37m"
    val cyanColor = "\u001B[36m"
    val greenColor = "\u001B[32m"

    println("\t${purpleColor}╔════════════════════════════════════════╗${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}║  Welcome to the day count calculator!  ║${defaultColor}")
    println("\t${purpleColor}║               ${greenColor}by Pouya-L${purpleColor}" +
            "               ║${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}║      ${cyanColor}As foretold by Nostradamus.       " +
            "${purpleColor}║${defaultColor}")
    println("\t${purpleColor}║                                        ║${defaultColor}")
    println("\t${purpleColor}╚════════════════════════════════════════╝${defaultColor}")
}

/*Checks if the given year was a leap year or not. Leap years are divisible by 4,
except for years that are divisible by 100 but not by 400. */
fun checkLeapYear(num : Int) : Boolean
{
    if (num % 4 == 0)
    {
        if (num % 100 == 0 && num % 400 != 0)
            return (false)
        else
            return (true)
    }
    else
        return (false)
}

/*Receives the number of a month and returns the name of the month*/
fun monthName(num : Int) : String
{
    if (num == 1)
        return ("January")
    else if (num == 2)
        return ("February")
    else if (num == 3)
        return ("March")
    else if (num == 4)
        return ("April")
    else if (num == 5)
        return ("May")
    else if (num == 6)
        return ("June")
    else if (num == 7)
        return ("July")
    else if (num == 8)
        return ("August")
    else if (num == 9)
        return ("September")
    else if (num == 10)
        return ("October")
    else if (num == 11)
        return ("November")
    else
        return ("December")
}