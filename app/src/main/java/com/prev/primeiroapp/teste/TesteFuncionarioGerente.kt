package com.prev.primeiroapp.teste

import com.prev.primeiroapp.Gerente

fun main() {

    val Rodrigo =
        Gerente("Rodrigo Martins", "24548995490", "27/07/1989", 22658.20)

    ImprimeRelatorioAuxilio.imprime(Rodrigo)

    println("Sua idade é de " + idadePessoa(Rodrigo.dataNascimento) + " anos")
    println("Seu Signo é " + signos(Rodrigo.dataNascimento))
}