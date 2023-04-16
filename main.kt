class Conta(var titular:String,var saldo:Double,var numero:Int){


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
