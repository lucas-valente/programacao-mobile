class MediaP(var n1: Float, var n2: Float, var n3: Float){
    
  val p1: Int = 2
  val p2: Int = 3
  val p3: Int = 5
    
  var resultado: Float = 0f
    
    fun calculo(){
      
        resultado = resultado + (p1 * n1 + p2 * n2 + p3 * n3) / (p1 + p2 + p3)  
   
    }
    
    fun mostraResultado(){
     
        if(resultado >= 6 ){
   	 	println("Aprovado")
    	}else if(resultado >= 3){
        println("Recuperação")
    	}else {
        println("Reprovado")
    	}
   
    }
  
}


fun main() {
     
  val mediaPonderada:MediaP = MediaP(6f,6f,6f)
  
  mediaPonderada.calculo()
  mediaPonderada.mostraResultado()

}