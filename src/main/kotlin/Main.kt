fun main(args: Array<String>) {
    randon(arrayOf(1,4,20,1,16))

var cashed=moneyed("Omara",)
    moneyed.details()

//deposit()
    takein("OmaraSon")

    var saved=cashed.Savingsaccount("")


}

//
//Kotlin Assessment 2
//Time: 90 minutes (1.5 hours)
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randon(number: Array<Int>):Array<Int> {
    for (i in number) {
        var index = 0
        if (i == index) {
            println(i)
        } else {
            println("Not here")
        }
    }


//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
fun takeIn(password:String){
//1. Must be at least 8 characters long
var i="password"
//    for (i in password) {
    if (i.length <= 8) {
    println(i)
    }


//2. Must be at most 16 characters long

//3. Must not be “password”
    if (i == i) {
        println("Can't be delivered")
    } else {
        println(i)
    }

//4. Must contain a digit

    //Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
    fun determine(password: Any):Boolean {
        //        var s=password.
//        if (i == s){
//
//        }
//    }
//}
//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
        fun words() {
            for (i in 1..1000) {
                if (i % 6 == 0 && i % 8 == 0) {
                    println("Bingo")
                } else {
                    println(i)
                }
            }
        }
//
//

        //4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
       open class moneyed(var accountnumber: Int, var varnumber: Int, var Accountname: String,var balance: Int) {


            fun deposit(amount: Double) {
                var x = amount + balance
            }


        }


            //b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
            fun details() {
                var x = "accountnumber"
                var w = "balance"
                var z = "name"
                println("Account number ${x} with balance ${w} is operated by ${z}")
            }






//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(accountnumber: Int, number: Int, Accountname: String, balance: Int,withdrawals:Int):moneyed(accountnumber, number, Accountname, balance){
    for(i in withdrawals){
    if(i<4){
        println()
    }
    }
    }
}

}



