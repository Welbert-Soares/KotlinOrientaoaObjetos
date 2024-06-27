package com.w3soft.kotlin_orientao_a_objetos

class Carro {
  var cor = "Vermelho"

  fun acelerar() {
    println("Acelerando...")
  }
}

fun main() {
  var carro: Carro? = null

  //  carro = Carro()
  // ***

  println( carro?.cor)

}