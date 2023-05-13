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
