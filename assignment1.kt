fun main(){
    val weight=50
    val height=1.49
    val bmi=weight/(height*height)
    println("The patient's BMI is $bmi")
    if (bmi<18.5){
        println("The patient is underweight")
    }
    else if (bmi<=22.9 && bmi>18.5){
        println("The patient is normal")
    }
    else if (bmi<=24.9 && bmi>=23){
        println("The patient is overweight")
    }
    else if (bmi<=29.9 && bmi>=25){
        println("The patient is pre-obese")
    }
    else if (bmi<=34.9 && bmi>=30){
        println("The patient is obese class I")
    }
    else if (bmi<=39.9 && bmi>=35){
        println("The patient is obese class II")
    }
    else if (bmi>=40){
        println("The patient is obese class III")
    }
    else{
        println("Invalid BMI")
    }
}