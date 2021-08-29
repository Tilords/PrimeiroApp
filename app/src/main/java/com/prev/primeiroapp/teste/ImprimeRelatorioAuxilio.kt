package com.prev.primeiroapp.teste

import com.prev.primeiroapp.Funcionario

class ImprimeRelatorioAuxilio {
    companion object{
        fun imprime(funcionario: Funcionario) = println(funcionario.toString())
    }
}