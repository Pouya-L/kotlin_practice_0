/*It prompts the user to input the number of hours and rating.
 Calculates the salary, bonus and the total salary.*/
fun exercise_11(){
    val hoursnum: Int = readValidNumber("What are the number of working hours?")
    val rating: Int = readValidNumber("What is the rating?")
    val baseSalary: Int = hoursnum * 30
    val bonus: Int = rating * 3
    val totalSalary: Int = baseSalary + bonus
    println("Base salary = ${baseSalary}\nBonus = ${bonus}\nSalary = ${totalSalary}")
}

/* It prompts the user to input the number of hours and rating.
 Calculates the salary, bonus and the total salary. the bonus can depend on the rating
 if rating is less than three -> bonus * 0.5 else -> bonus * 2*/
fun exercise_12(){
    val hoursnum: Int = readValidNumber("What are the number of working hours?")
    val rating: Int = readValidNumber("What is the rating?")
    val baseSalary: Int = hoursnum * 30
    val bonus: Double
    if (rating < 3)
        bonus = rating * 0.5
    else
        bonus = rating * 2.0
    val totalSalary: Double = baseSalary + bonus
    println("Base salary = ${baseSalary}\nBonus = ${bonus}\nSalary = ${totalSalary}")
}