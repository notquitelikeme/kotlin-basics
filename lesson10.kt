// functions with return
fun main(){
    // this is the main function
    // call the function
    var addition=add(num1 = 20, num2 = 20)
    println(addition)
    var bmi=BMI(weight = 70.0, height = 1.91)
    println("The BMI value of the patient is $bmi")
    var details=P_details(Name = "Dennis", Email = "conquistador8240@gmail.com")
    println(details)
    var score=mean(French = 68.0, German = 75.0, Spanish = 81.0)
    println("The mean is $score")
} // end of main function
// with return we will return a value and assign it a variable
// we use return keyword
// just after the parenthesis, we specify the data type
fun add(num1:Int, num2:Int):Int{
    return(num1 + num2)
}
fun BMI(weight:Double,height:Double):Double{
    return(weight/(height*height))
}
fun P_details(Name:String,Email:String):String{
    return(Name + Email)
}
// create a function that will return the mean of 3 foreign languages
// French, German, Spanish
fun mean(French:Double, German:Double, Spanish:Double):Double{
    return((French + German + Spanish)/3)
}