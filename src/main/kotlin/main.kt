fun main(){

    var w = CurrentAccount("3548sin","jambo12",1000,500,100)
    println(w)
println(w.deposit(200.0))
    println(w.details())
    println(w.withdrawal(300.0))

}


open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Int, var depositt:Int,var withdraw:Int){
    fun deposit(amount:Double){
       var add=balance+depositt
        println(add)

    }
    fun withdrawal(amount:Double){
       var minus=balance-withdraw
        println(minus)
    }
    fun details(){
        println("$accountNumber with $balance is operated by $accountName")
    }
}

class SavingsAccount(accountNumber:String,accountName:String,balance:Int,withdrawals:Int)   {


}

data class Products(val name:String,val weight:Int,val price:Int,)
when(products)
   "Sunlight"-


fun words(word:String):String{
    word.forEach { x->
        if ((word%2)!==0)
    }
    return word
}