package com.prev.primeiroapp

abstract class Funcionario(
    nome: String,
    cpf: String,
    dataNascimento: String,
    val salario: Double

) : Pessoas(nome, cpf, dataNascimento) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()

}