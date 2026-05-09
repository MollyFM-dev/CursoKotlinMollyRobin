fun main () {
    // suma_numeros_positivos()
    // buscar_elemento()
    eliminar_vocales()
    println("Todos putos, me dan el curso a medias")
}

fun suma_numeros_positivos() {
    val arrayNumeros = arrayOf(20 , -14 , 45 , 65 , -87)
    var acumulaNumeros = 0
    for (n in arrayNumeros) {
        if (n < 0) {
            continue
        }
        acumulaNumeros += n
    }
    println(acumulaNumeros)
}

fun buscar_elemento() {
    val arrayElementos = arrayOf("Meow" , "Guau" , "Muuu" , "Meh" , "Cuack")
    for (i in arrayElementos){
        if ("Muuu" in i){
            println(true)
            break
        } else {
            println(false)
        }

    }
}

fun eliminar_vocales(){

}