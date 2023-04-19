fun main() {
    var user=User("Jemima","Nyaguthii","jemimanyaguthiiwambugu@gmail.com",
        "792035101","jem**")
    println(user.firstName)
    println(user.email)
    var human=Human("mitchelle",20,40.0)
    human.eat(4)
    human.speak("Its a good day")
    human.birthday(1)
    println(total(arrayOf(10,34,56,78,34,94)))
    var calculator=Calculator(750,75)
    println(calculator.addition())
    println(calculator.subtraction())
    println(calculator.division())
    println(calculator.multiplication())
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
//A data class does not perform any operation while a class performs many operations
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,
                var password:String)
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//Create an instance of this human class and invoke all its functions

class Human(var name:String,var age:Int,var weight:Double){
//    eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
    //and increments the human’s weight by the weight of the food eaten
    fun eat (foodweight:Int){
    weight+=4
    println("I am eating $weight of food)")
}
    //- speak(speech: String) :Prints the string passed to it
    fun speak(speech:String){
        var word="Its a good day"
        println(word)
    }
//birthday() :Increments the human’s age by 1
    fun birthday(add:Int) {
    age += 1
    println(age)
}
}
//Write and invoke one function that takes in an array of integers(Array<Int>)and returns
//these 3 values(Total): smallest, largest and average of all the elements
data class Total(var min:Int,var max:Int,var avg:Double)
fun total(numb:Array<Int>):Total{
    var minimum=numb.min()
    var maximum=numb.max()
    var average=numb.average()
    var output =Total(minimum,maximum,average)
    return output
}
//Create a calculator class that is capable of the following functions:
 class Calculator(var num1:Int,var num2:Int) {
//    Addition of any 2 numbers
    fun addition():Int{
        var sum=num1 + num2
        return sum
    }
//    Subtraction between any 2 numbers
    fun subtraction():Int{
        var minus=num1 -num2
        return minus
    }
//    Accurate division between any 2 numbers
    fun division():Int{
        var divide=num1 / num2
        return divide
    }
//    Multiplication of any 2 numbers
    fun multiplication():Int{
        var multiply=num1 * num2
        return multiply
    }

}