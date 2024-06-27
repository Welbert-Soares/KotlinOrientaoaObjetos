package com.w3soft.kotlin_orientao_a_objetos

fun somar( numero1: Int, numero2: Int = 0, numero3: Int = 0) {
  println(numero1 + numero2 + numero3)
}

fun main() {
  somar(10, 50)
}