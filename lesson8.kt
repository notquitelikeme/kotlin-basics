// functions
// functions- group of related code/programs that performs a specific task
// in kotlin we have two types of functions
// 1. In-built/Kotlin standard library
// 2. User-defined functions
// we call user-defined functions inside the main function
// syntax of kotlin functions fun(keyword) functionName (parenthesis){functionbody}
// In-built functions
fun main(){
    val number1:Double=30.0
    val square_root:Double=Math.sqrt(number1)
    println("The square root if $number1 is$square_root")
    // multiplication
    val num1=30
    val num2=20
    val multiple=Math.multiplyExact(num1,num2)
    println("The multiple of $num1 and $num2 is $multiple")
    // calling the user defined functions
    addition()
    multiplication()
    circle()
} // end of main function
// User-defined functions
fun addition(){
    val a=50
    val b=30
    val sum=a+b
    println("The sum of $a and $b is $sum")
}
// create a function that calculates the area of a triangle
fun multiplication(){
    val b=25
    val h=7
    val area=0.5*b*h
    println("The area of the triangle is $area")
}
// crate a function that calculates the area of a circle
fun circle(){
    val radius=1.4
    val pi=3.1415926535
    val area_circle=pi*radius*radius
    println("The area of the circle is $area_circle")
}