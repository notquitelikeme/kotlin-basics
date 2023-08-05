// for loop
// works exactly the same way as in python
// it iterates through anything, list, array, range, tuple, string
// array- collection of items
fun main(){
    // range
    for (i in 1..10){
        println("My number is $i")
    }
    for (i in 20 downTo 10 step 2){
        println(i)
    }
    for (i in 1..5){
        print(i)
    }
    for (i in 5 downTo 1 step 2){
        print(i)
    }
    // array
    var fruits=arrayOf("Orange","Mango","Apple","Banana")
    for (item in fruits){
        println(item)
    }
}