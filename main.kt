class Conta(var titular: String, var saldo: Double, var numero: Int) {
    //MÉTODO PARA DEPOSITAR VALOR NA CONTA
    fun deposita(valor: Double) {
        this.saldo += valor
    }

    //MÉTODO PARA SACAR VALOR DA CONTA
    fun sacar(valor: Double) {

        if (saldo >= valor) {
            this.saldo -= valor
        }
        if (saldo < valor) {
            println("NÃO FOI POSSÍVEL REALIZAR SAQUE")
            println("SALDO INSUFICIENTE!")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        } else {
            println("SALDO INSUFICIENTE")
            return false
        }
    }


}

fun main() {
    println(" ---------- Bem Vindo ao ByteBank ----------")
    println()
    //instanciando os objetos: contaLeonardo, contaMaria
    val contaLeonardo = Conta("Leonardo", 1200.55, 1000)
    val contaMaria = Conta("Maria", 1200.22, 1001)

    println("Seja Bem Vindo(a) ${contaLeonardo.titular}")
    println("Titular: ${contaLeonardo.titular}")
    println("Número: ${contaLeonardo.numero}")
    println("Saldo: ${contaLeonardo.saldo}")
    println("DEPOSITO SENDO REALIZADO NA CONTA: ${contaLeonardo.titular}")
    contaLeonardo.deposita(234.50)
    println("SALDO ATUAL: ${contaLeonardo.saldo}")
    println()
    println()

    println("Seja Bem Vindo(a) ${contaMaria.titular}")
    println("Titular:${contaMaria.titular}")
    println("Número:${contaMaria.numero}")
    println("Saldo:${contaMaria.saldo}")
    println("DEPOSITO SENDO REALIZADO NA CONTA: ${contaMaria.titular}")
    contaMaria.deposita(234.50)
    println("SALDO ATUAL: ${contaMaria.saldo}")
    println()

    println("SAQUE SENDO REALIZADO NA CONTA: ${contaMaria.titular}")
    contaMaria.sacar(3.50)
    println("SALDO ATUAL: ${contaMaria.saldo}")

    println("TRANSFERENCIA DA CONTA: ${contaLeonardo.titular} PARA A CONTA: ${contaMaria.titular}")
    contaLeonardo.transfere(20000.0, contaMaria)
    println("SALDO ATUAL DA CONTA MARIA: ${contaMaria.saldo}")

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
