open class ContaBancaria(val cliente:String , var saldo:Float, val numero:Int, val agencia:Int): Comparable<ContaBancaria>{
   
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

 class ContaPoupanca( cliente:String ,  saldo:Float,  numero:Int,  agencia:Int) : ContaBancaria(cliente, saldo, numero, agencia) {
   
     fun aplicarJuros(dias:Int,juros:Float){
         saldo = saldo + ( saldo * juros * dias )
     }
   
 }
 
  var cp = ContaPoupanca("Melo",10000f,9865,2496)
 

fun main() {

   cp.aplicarJuros(30,0.03f)
   cp.imprimirExtrato()
   
}