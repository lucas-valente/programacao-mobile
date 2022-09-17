class ContaBancaria(val cliente:String , var saldo:Float, val numero:Int, val agencia:Int){
     
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
    
  var conta1 = ContaBancaria("Marco",1200f,1212,2248)

  var conta2 = ContaBancaria("Veio",1200f,5454,6845)
  
 
   conta1.Depositar(1200f)
   
   conta1.Sacar(1200f)
   
   conta1.Transferir(200f)
   
   conta2.Depositar(1200f)
   
   conta2.Sacar(1200f)
    
   conta2.Transferir(200f)
      
   conta1.Depositar(conta2.valorT)
   conta2.Depositar(conta2.valorT)
   conta1.imprimirExtrato()   
   conta2.imprimirExtrato()
 
}