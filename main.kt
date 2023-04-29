class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

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
            destino.deposita(valor)
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
    val contaLeonardo = Conta(titular = "LEONARDO", numero = 1000)
    val contaMaria = Conta(titular = "MARIA", numero = 1001)
    val contaJulio = Conta(titular = "JULIO", numero = 1002)


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

    println("Seja Bem Vindo(a) ${contaJulio.titular}")
    println("Titular: ${contaJulio.titular}")
    println("Número: ${contaJulio.numero}")
    println("Saldo: ${contaJulio.saldo}")
    println()
    println("SAQUE SENDO REALIZADO NA CONTA: ${contaMaria.titular}")
    contaMaria.sacar(3.50)
    println("SALDO ATUAL: ${contaMaria.saldo}")

    println("TRANSFERENCIA DA CONTA: ${contaLeonardo.titular} PARA A CONTA: ${contaMaria.titular}")
    contaLeonardo.transfere(valor = 25.0, destino = contaMaria)
    println("SALDO ATUAL DA CONTA MARIA: ${contaMaria.saldo}")

}


