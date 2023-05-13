fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("X = $numeroX")
    println("Y = $numeroY")

    val contaJoao = Conta(titular = "João",numero = 1003)
    contaJoao.titular = "João "
    var contaMaria = Conta(titular = "Maria", numero = 1004)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("conta ${contaMaria.titular}")
    println("conta ${contaJoao.titular}")

}
