package com.prev.primeiroapp.teste

import com.prev.primeiroapp.Funcionario

fun main() {

    val patricia =
        Funcionario("Patricia Almeida", "24548995490", "27/07/1989", 2658.20)

    println("R$" + patricia.salario)
    println("Nome " + patricia.nome)
    println("Sua idade é de " + idadePessoa(patricia.dataNascimento) + " anos")
    println("Seu Signo é " + signos(patricia.dataNascimento))
}

fun signos(date: String): String? {
    val retornoData = date.split("/").toTypedArray()
    val dia = retornoData[0].toInt();
    val mes = retornoData[1].toInt();
    var signo = "indefinido"

    when (mes) {
        1 -> if (dia >= 1 && dia <= 20) signo = "Capricórnio" else signo = "Aquário"
        2 -> if (dia >= 1 && dia <= 19) signo = "Aquário" else signo = "Peixes"
        3 -> if (dia >= 1 && dia <= 20) signo = "Peixes" else signo = "Áries"
        4 -> if (dia >= 1 && dia <= 20) signo = "Áries" else signo = "Touro"
        5 -> if (dia >= 1 && dia <= 20) signo = "Touro" else signo = "Gêmeos"
        6 -> if (dia >= 1 && dia <= 20) signo = "Gêmeos" else signo = "Câncer"
        7 -> if (dia >= 1 && dia <= 21) signo = "Câncer" else signo = "Leão"
        8 -> if (dia >= 1 && dia <= 22) signo = "Leão" else signo = "Virgem"
        9 -> if (dia >= 1 && dia <= 22) signo = "Virgem" else signo = "Libra"
        10 -> if (dia >= 1 && dia <= 22) signo = "Libra" else signo = "Escorpião"
        11 -> if (dia >= 1 && dia <= 21) signo = "Escorpião" else signo = "Sagitário"
        12 -> if (dia >= 1 && dia <= 21) signo = "Sagitário" else signo = "Capricórnio"
    }
    return signo
}

fun idadePessoa(date: String): Int? {
    val retornoData = date.split("/").toTypedArray()
    val dia = retornoData[0].toInt();
    val mes = retornoData[1].toInt();
    val ano = retornoData[2].toInt();
    val anoAtual = 2021;

    return anoAtual - ano
}