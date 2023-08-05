// when
// works the same as if statements
// when expression checks if a condition is true then prints the desired output
// range
fun main(){
    val temp:Int=40 //create a variable
    when(temp){
        in -10..15-> println("It is very cold.Keep warm")
        in 16..27-> println("Normal temperatures.Feel free to do your activities")
        in 28..45-> println("High temperatures.Avoid direct sunlight and take shelter")
        else-> println("Abnormal temperatures")
    }
    // when
    val marks:Int=70
    when{
        marks<50->println("Below average")
        marks>=50 && marks<75->println("Average")
        marks>=75 && marks<90->println("Above average")
        marks>=90 && marks<=100->println("Exceptional")
        else-> println("Invalid input")
    }
}