/*Checks whether the user has input a valid int which is not null as an input*/
fun readValidNumber(prompt: String) : Int
{
    while (true)
    {
        println(prompt);
        val input = readLine();
        val num = input?.toIntOrNull();
        if (num != null)
            return num;
        else
            println("Please enter a valid number");
    }
}

/*Checks whether the user has input a valid string which is not null as an input*/
fun nameChecker(prompt: String) : String
{
    while (true)
    {
        println(prompt)
        val nameCheck = readLine()
        if (nameCheck != null)
            return (nameCheck)
        else
            println("Invalid name, please enter a string as your name.")
    }
}

/*Checks whether the user has input a valid int which is not null as an input and its between 1 & 12*/
fun readValidMonth(prompt: String) : Int
{
    while (true)
    {
        println(prompt);
        val input = readLine();
        val num = input?.toIntOrNull();
        if (num != null && (num in 1..12))
            return num;
        else
            println("Please enter a valid month");
    }
}

