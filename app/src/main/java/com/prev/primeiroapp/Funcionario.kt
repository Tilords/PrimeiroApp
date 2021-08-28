package com.prev.primeiroapp

abstract class Funcionario(
    nome: String,
    cpf: String,
    dataNascimento: String,
    val salario: Double

) : Pessoas(nome, cpf, dataNascimento) {
}