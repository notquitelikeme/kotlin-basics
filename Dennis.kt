fun main(){
    val units=250
    println("The units are $units")
    if (units<=50){
        val cost=(units*0.5)+10
        println("The electricity bill is Rs. $cost")
    }
    else if (units>50 && units<=150){
        val cost=(50*0.5)+((units-50)*1)+10
        println("The electricity bill is Rs. $cost")
    }
    else if (units>150 && units<=250){
        val cost=(50*0.5)+(100*1)+((units-150)*1.2)+10
        println("The electricity bill is Rs. $cost")
    }
    else if (units>250){
        val cost=(50*0.5)+(100*1)+(100*1.2)+((units-250)*1.5)+10
        println("The electricity bill is Rs. $cost")
    }
    else{
        println("Invalid")
    }
 }