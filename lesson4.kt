// nested if
fun main(){
    // check max number out of 3
    val no1=4
    val no2=-6
    val no3=-3
    val max=if (no1>no2){
        if (no1>no3)
            no1
        else
            no3
    }
    else {
        if(no2>no3)
            no2
    else
    no3
}
println("The maximum number is $max")
// initial code
    if (no1>no2){
        if (no1>no3){
            println("max=$no1")
        }
        else{
            println("max=$no3")
        }
    }
    else if (no2>no3){
        println("max=$no2")
    }
    else{
        println("max=$no3")
    }
}