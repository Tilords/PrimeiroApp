package com.prev.primeiroapp.teste

import com.prev.primeiroapp.Analista

fun main() {

    val patricia =
        Analista("Patricia Almeida", "24548995490", "27/07/1989", 2658.20)

    ImprimeRelatorioAuxilio.imprime(patricia)

    println("Sua idade é de " + idadePessoa(patricia.dataNascimento) + " anos")
    println("Seu Signo é " + signos(patricia.dataNascimento))
}