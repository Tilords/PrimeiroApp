package com.prev.primeiroapp

import com.prev.primeiroapp.Funcionario

class Analista(nome: String, cpf: String, dataNascimento: String, salario: Double): Funcionario(nome, cpf,
    dataNascimento,
    salario) {
    override fun calculoAuxilio() = salario * 0.1

}