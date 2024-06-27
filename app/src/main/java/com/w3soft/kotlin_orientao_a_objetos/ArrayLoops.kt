package com.w3soft.kotlin_orientao_a_objetos

fun main() {

  var nomes = arrayOf(
    "Welbert",
    "Lucas",
    "Pedro",
    "João"
  )
//  nomes[0] = "Lucas"

  println("A lista de nomes tem ${nomes.size} elementos")

  for ( nome in nomes) {
    println("O $nome está na lista, na posição ${nomes.indexOf(nome)}.")
  }

}