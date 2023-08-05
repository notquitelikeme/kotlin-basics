fun main(){
    val distance:Int=50
    when{
        distance<=100->println("The cost is 5.00")
        distance>100 && distance<=500->println("The cost is 8.00")
        distance>500 && distance<=1000->println("The cost is 10.00")
        distance>1000->println("The cost is 12.00")
        else-> println("Invalid")
    }
}