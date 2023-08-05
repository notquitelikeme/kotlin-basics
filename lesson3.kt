// if statements
// main function
fun main(){
    // create a program that calculates total marks(5 subjects) of students
    // calculate the mean
    // English, Kiswahili, Mathematics, Science, Social Studies
    val English=51
    val Kiswahili=57
    val Mathematics=77
    val Science=92
    val Social_Studies=68
    // formula to calculate total marks
    val Total_marks=English+Kiswahili+Mathematics+Science+Social_Studies
    println("The student's total marks is $Total_marks")
    val mean=Total_marks/5
    println("The student's mean score is $mean")
    // if statements
    if (mean<50){
        println("The student has failed")
    }
    else if (mean>=50 && mean<75){
        println("The student has passed")
        println("Average student")
    }
    else if (mean>=75 && mean<90){
        println("The student is above average")
    }
    else if (mean>=90 && mean<=100){
        println("The student is exceptional")
        println("Congratulations!")
    }
    else{
        println("Invalid")
    }
}