// functions with parameters
// we declare the parameters inside the paranthesis when we are creating the function
// then we parse the parameters when calling the function
fun main(){
    // this is the main function
    rectangle(Length = 50,Width = 40)
    electricity(units = 100)
} // end of main function
// calculate the area of a rectangle
fun rectangle(Length:Int,Width:Int){
    // formula for calculating the area
    val a_rectangle=Length*Width
    println("The area of the rectangle is $a_rectangle")
}
// create a program to calculate electricity bill
fun electricity(units:Int){
    if (units<=50){
        var bill=units*0.50+10
        println("Your units are $units and your bill is $bill")
    }
    else if (units>50 && units<=150){
        var bill=(50*0.50)+((units-50)*1.0)+10
        println("Your units are $units and your bill is $bill")
    }
    else if (units>150 && units<=250){
        var bill=(50*0.50)+(100*1.0)+((units-150)*1.2)+10
        println("Your units are $units and your bill is $bill")
    }
    else if (units>250){
        var bill=(50*0.50)+(100*1.0)+(100*1.2)+((units-250)*1.5)+10
        println("Your units are $units and your bill is $bill")
    }
    else{
        println("Invalid")
    }
}
// create a kotlin program to convert degrees celcius to degrees fahrenheit
fun temp(celsius:Int=60){
    val fahrenheit=(celsius*(9/5)+32)
    println("$celsius degrees celsius is equal to $fahrenheit degrees fahrenheit")
}