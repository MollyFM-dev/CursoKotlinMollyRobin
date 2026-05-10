fun main () {
    // suma_numeros_positivos()
    // buscar_elemento()
    // eliminar_vocales()
    // imprimir_numeros_impares()
    // filtrar_nombres()
    // imprimir_secuencia()
    sumar_pares()
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

fun eliminar_vocales(frase: String): String {   // No entiendo qué error da este... Tampoco sé hacerlo
    val frase = "Mi chica meow meow"
    // var sinVocales = frase.replace("[aeiouAEIOU]".toRegex(), "")
    var resultado = ""

    for (caracter in frase) {
        if (caracter.lowercaseChar() in "aeiou") { // Pero qué cojones
            continue
        }
        resultado += caracter
    }
    return resultado
    println(frase)
}

fun imprimir_numeros_impares() {   // Lo hice yo solito :3
    var numeroInicial = 1
    while (numeroInicial in 1..9) {
        if (numeroInicial %2 != 0) {
            println(numeroInicial)
            numeroInicial++
        } else {
            numeroInicial++
            continue
        }
    }
}

fun filtrar_nombres () {   // A la puta primera lo hice FUUUUAAAAA
    val listaNombres = arrayOf("Meow" , "Sandía" , "Cthulhu" , "Max")
    val caracterMinimo = 5
    for (i in listaNombres) {
        if (i.length > caracterMinimo) {
            println(i)
        } else {
            continue
        }
    }
}

fun imprimir_secuencia() {   // Eeeeez
    var numeroInicial = 1
    while (numeroInicial in 1..20) {
        if (numeroInicial %2 != 0) {
            println(numeroInicial)
            numeroInicial++
        } else {
            numeroInicial++
            continue
        }
    }
}

fun sumar_pares() {   // Mi cabeza no da pa más hoy
    val listaNumeros = arrayOf(32 , 15 , 17 , 28)
    var inicialLista = 0
    for (n in listaNumeros) {
        if (n %2 == 0){

        } else {
            inicialLista++
            continue
        }
    }
}