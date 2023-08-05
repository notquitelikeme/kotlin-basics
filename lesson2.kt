// the main function
// variables
// val, var
// val=20 cannot be initialized after it has been used
// var - can be initialized after first use
fun main(){
    val number1:Int=50 //upto 2b
    val number2:Double=21.4
    val number3:Long=2424243535353
    val number4:Short=31630
    
    println("Your number 1 is $number1")
    println("Your number 2 is $number2")
    println("Your number 3 is $number3")
    println("Your number 4 is $number4")

// addition
val answer=number1 + number2
println("The addition is $answer")

val answer2=number3 + number1 + number2
println("The addition of the two numbers is $answer2")

// multiplication of 2 numbers
val answer3=number1 * number2
println("The multiplication of the two numbers is $answer3")

// subtraction
val answer4=number2 - number4
    println("The subtraction of the two numbers is $answer4")

// simple interest
val p=300000
val r=0.1
val t=3
val answer5=(p*r*t)/100
println("The simple interest is $answer5")

}