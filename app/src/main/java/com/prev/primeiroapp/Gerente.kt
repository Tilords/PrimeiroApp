package com.prev.primeiroapp

class Gerente(nome: String, cpf: String, dataNascimento: String, salario: Double):
    Funcionario(nome, cpf, dataNascimento, salario) {
    override fun calculoAuxilio(): Double = salario *0.4
}