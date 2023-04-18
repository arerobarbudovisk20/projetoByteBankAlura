class Conta(var titular:String,var saldo:Double,var numero:Int){
       
       fun deposita(valor:Double){
           this.saldo += valor
       
       
       }

       fun sacar(valor:Double){
            if(saldo >= valor){
                this.saldo -= valor
            }   
            if(saldo < valor){
                println("NÃO FOI POSSÍVEL REALIZAR O SAQUE")
                println("SALDO INSUCIENTE")
            }
           
       }
       
}

fun main(){
    println(" ---------- Bem Vindo ao ByteBank ----------")
    println()
    //instanciando os objetos: contaLeonardo, contaMaria
    val contaLeonardo = Conta("Leonardo",1200.55,1000)
    val contaMaria = Conta("Maria",1200.22,1001)

    println("Seja Bem Vindo(a) ${contaLeonardo.titular}")
    println("Titular: ${contaLeonardo.titular}")
    println("Número: ${contaLeonardo.numero}")
    println("Saldo: ${contaLeonardo.saldo}")

    println()
    println()

    println("Seja Bem Vindo(a) ${contaMaria.titular}")
    println("Titular:${contaMaria.titular}")
    println("Número:${contaMaria.numero}")
    println("Saldo:${contaMaria.saldo}")
    println()
    
    println("SALDO SENDO REALIZADO DA CONTA: $contaMaria.titular")
    contaMaria.sacar(250.50)
    println("SALDO ATUAL: $contaMaria.saldo")







}

/*
fun testaCopiaEReferencia(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println(numeroX)
    println(numeroY)

    val contaJoao = Conta("Joao",0.0,0)
    var contaJulia = contaJoao
    contaJulia.titular = "Julia"
    println(contaJoao.titular)
    println(contaJulia.titular)

}
*/
