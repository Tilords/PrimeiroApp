package com.prev.primeiroapp.teste

import com.prev.primeiroapp.ClienteTipo
//cria uma função onde vai até uma classe e pega o que foi definido e depois imprime com o foreach
fun main(){
    ClienteTipo.values().forEach {
        it -> println("${it.name} + ${it.descricao}")
    }
}