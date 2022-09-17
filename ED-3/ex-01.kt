class ContaBancaria(val cliente:String , var saldo:Float, val numero:Int, val agencia:Int){
     
    fun Depositar(valorDeposito:Double){
        saldo = saldo + valorDeposito
    }
    
    fun Sacar(valorRetirar:Float){
       saldo =  saldo - valorRetirar        
    }
    
    var valorT: Float = 0f
    fun Transferir(ValorTransferencia:Double){
       
        saldo = saldo - ValorTransferencia
        valorT  = ValorTransferencia
       
    }
    
    fun imprimirExtrato() {
        println("Cliente: $cliente, Saldo: R$ $saldo")
    }
    
  
    
    override fun toString(): String = "$cliente R$ $saldo"
}

fun main(){
     ContaBancaria("Lucas",1200.00,1212,2248)
}