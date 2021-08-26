package com.prev.primeiroapp

class Pessoas {
    var nome:String = "Mauricio"
    var cpf:String = "424.456.458.82"
    private set

    constructor()

    fun juntaNomeCpf()  = "$nome e $cpf"
}
fun main(){
    val jether = Pessoas()

    println(jether.juntaNomeCpf())
}