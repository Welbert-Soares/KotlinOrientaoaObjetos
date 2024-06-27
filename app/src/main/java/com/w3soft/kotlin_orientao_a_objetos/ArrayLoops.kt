package com.w3soft.kotlin_orientao_a_objetos

fun main() {

  val names = arrayOf(
    "Welbert",
    "Lucas",
    "Pedro",
    "João"
  )
//  names[0] = "Lucas"

  println("A lista de nomes tem ${names.size} elementos")

  for ( nome in names) {
    println("O $nome está na lista, na posição ${names.indexOf(nome)}.")
  }

}