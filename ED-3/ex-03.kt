class ContaBancaria(val cliente:String , var saldo:Float, val numero:Int, val agencia:Int): Comparable<ContaBancaria>{
   
    override fun compareTo(other: ContaBancaria): Int = this.cliente.compareTo(other.cliente) 
//  override fun compareTo(other: ContaBancaria): Int = this.saldo.compareTo(other.saldo) 
   
    override fun toString(): String = "$cliente $$saldo"

    var valorT: Float = 0f
    
    fun Depositar(valorDeposito:Float){
        saldo = saldo + valorDeposito
    }
    
    fun Sacar(valorRetirar:Float){
       saldo =  saldo - valorRetirar        
    }
    
    fun Transferir(ValorTransferencia:Float){       
        saldo = saldo - ValorTransferencia
        valorT  = ValorTransferencia       
    }
    
    fun imprimirExtrato() {
        println("Cliente: $cliente,\nSaldo: R$ $saldo \n")
    }
    
}

fun main() {
   

 val Banco = arrayOf(
     
     ContaBancaria("Marco",2345f,5632,2452),
     ContaBancaria("Veio",9970f,2525,5352),
     ContaBancaria("Billy",6857f,9488,7536),
     ContaBancaria("The",1400f,65858,7897),
     ContaBancaria("Kid",6600f,8558,8585)
     
 )
  
   Banco.sort()
   println(Banco.joinToString())   
 
}