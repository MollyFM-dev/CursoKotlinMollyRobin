import kotlin.math.pow

fun main () {
    // suma_numeros_positivos()
    // buscar_elemento()
    // eliminar_vocales()
    // imprimir_numeros_impares()
    // filtrar_nombres()
    // imprimir_secuencia()
    // sumar_pares()

    // 11/05 - 04:47
    // encontrar_mayor()
    // calcular_primos()
    // println(calcular_factorial(5))
    // println(calcular_factorial())

    // 12/05
    //// PARÁMETROS RETORNO ////
    // var areaCirculo = calcular_area_circulo(3.0)

    // val listaNumeros = listOf(2, 4, 26, 11)
    // println(sumar_lista(listaNumeros))

    // val listaNumeros2 = listOf(3 , 45 , 103 , 20)
    // println(encontrar_maximo(listaNumeros2))

    // val resultado = revertir_cadena("Estamos jodidos")
    // println(resultado)

    // val listaNumeros3 = listOf(23, 44, 56, 88)
    // println(calcular_promedio(listaNumeros3))

    // val resultado = es_palidromo("meow")
    // println(resultado)

    // calcular_potencia(15.0, 3)

    // val frase = contar_vocales("Mi chica me da ideas")

    // println(es_primo(111))

    // calcularFactorial(5)

    // 13/05
    //// VALORES POR DEFECTO ////
    // saludar()

    // calcular_area_rectangulo(7 , 3)

    /* val persona1 = crear_persona("Moshi" , 4)
    val persona2 = crear_persona("Max" , 13 , "Suavesito" , "Tar colgao")
    println(persona1)
    println(persona2) */

    // imprimir_tabla_multiplicar (7)

    // comprar_producto("Patatas" , 2 , 2.35)

    // imprimir_frase("Castigao sin sexo" , 5)

    // calcular_edad(1932)

    // val lista = listOf (23 , 47 , 55)
    // println(sumar_elementos(lista))


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

fun sumar_pares() {
    val listaNumeros = arrayOf(32 , 15 , 17 , 28)
    var numeroFinal = 0
    for (n in listaNumeros) {
        if (n %2 == 0){
            numeroFinal += n
            continue
        } else {
            continue
        }
    }
    println(numeroFinal)
}

// 11/05 - 04:47
fun encontrar_mayor () {    // Este sí, venga
    val lista = listOf(23 , 45 , 103 , 12)
    var mayor = 0
    for (n in lista) {
        if (n <= 100) {
            continue
        } else {
            mayor = n
            break
        }
    }
    println(mayor)
}

fun calcular_primos(): List<Int> {             // Me caguen sus muertos, ni con el ChatGPT lo saco
    var losPrimos = mutableListOf<Int>()
    var primoInicial = 2
    for (n in 2 until primoInicial){
        if (primoInicial %n == 0){
            continue
        } else {
            losPrimos.add(primoInicial)
            continue
        }
        primoInicial++
        if (losPrimos.size == 50) {
            break
        }
    }
    return losPrimos
}

fun calcular_factorial (numero: Int): Int {    // He mejorao pero sigo siendo tonto, lo hice con aiuda D;
    var factorial = 1
    for (n in 0..numero){
        if (n == 0){
            continue
        }
        factorial *= n
        if (n == numero){
            break
        }
    }
    return factorial
}

fun calcular_area_circulo (radio: Double):Double{  // Me sirvió bien para aprender cosas, gg
    var resultado = radio.pow(2) * Math.PI
    println(resultado)
    return resultado
}

fun sumar_lista (lista: List<Int>): Int {
    var suma = 0
    for (n in lista){
        suma += n
    }
    return suma
}

fun encontrar_maximo (lista: List<Int>): Int {   // VAMOOOOOOS Sin ayuda!!
    var maximo = 0
    for (i in lista) {
        if (i > maximo){
            maximo = i
            continue
        } else {
            continue
        }
    }
    return maximo
}

fun revertir_cadena (cadena: String): String {   // No sé si sabría volver a hacerlo si me lo piden
    var invertida = "" // Variable para guardar el texto que le demos
    for (i in cadena.length -1 downTo 0){  // Empieza en la última posición y va bajando hasta la posición 0
        invertida += cadena[i]
    }
    return invertida
}

fun calcular_promedio (lista: List<Int>): Double {   // Mi chica me dio el detalle que me faltaba :3
    var valorInicial = 0.0
    for (n in lista){
        valorInicial += n
    }
    var media = valorInicial/2
    return media
}

fun es_palidromo (texto: String): Boolean {   // Lo estoy entendiendo al final
    var devolucion = false
    var derecho = texto
    var reves = ""
    for (n in texto.length - 1 downTo 0){
        reves += texto [n]
        if (derecho == reves) {
            devolucion = true
        }
    }
    return devolucion
}

fun calcular_potencia (num1: Double , num2: Int): Double {  // Nota: los .pow son especialitos y no funcionan con enteros
    var potencia = num1.pow(num2)
    println(potencia)
    return potencia
}

fun contar_vocales (texto: String): Int {  // Este es ejercicio de mirar apuntes
    var acumulador = 0
    for (n in texto){
        if (n.lowercaseChar() in "aeiou"){
            continue
        }
        acumulador ++
    }
    println(acumulador)
    return acumulador
}

fun es_primo (numero: Int): Boolean {      // No declares más variables Booleanas, caguendios
    if (numero < 2) {
        return false
    }
    for (i in 2 until numero) {
        if (numero %i == 0) {
            return false
        }
    }
    return true
}

fun calcularFactorial (numero: Int): Int {   // Este sin ayuda y sin mirar apuntes!!
    var resultado = 1
    for (i in 1..numero) {
        resultado *= i
    }
    println(resultado)
    return resultado
}

fun saludar (nombre: String = "Abby", saludo: String? = "Meow meow") {    // Fasilito
    // El ? de String? indica que ese valor es opcional en la función y que sin ella se debería ejecutar sin problemas
    println("Hola $nombre!" /* $saludo"*/)
}

fun calcular_area_rectangulo (base: Int , altura: Int , unidades: String? = "Metros cuadrados") {    // Fasilitox2
    var areaRectangulo = base * altura
    println("El área del rectángulo es: $areaRectangulo $unidades")
}

fun crear_persona (    // No sé qué pollas falla si le copié al Chatgepeto... Eran los putos "!!", no te puedo creer
    nombre: String,
    edad: Int,
    sexo: String? = "Fluffy",
    ocupacion: String? = "Mimitos"
): Map<String, Any> {
    var gente = mapOf(
        "nombre" to nombre!!,
        "edad" to edad!!,
        "sexo" to sexo!!,
        "ocupacion" to ocupacion!!)
    return gente
}

fun imprimir_tabla_multiplicar (numero: Int , limite: Int? = 10) {    // Funciona, que es lo importante
    for (i in 1..limite!!){  // Según Kotlin: ponerle "!!" hace que no sea posible un valor nulo (?), no entiendo
        println(numero*i)
    }
}

fun comprar_producto (producto: String , cantidad: Int? = 1, precioUnitario: Double? = 0.0): Double {
    val total = cantidad!! * precioUnitario!!   // A poner !! hasta en la contraseña del PC...
    println("Precio final de $producto = $total")
    return total
}

fun imprimir_frase (frase: String , repeticiones: Int? = 1 , puntuacion: String? = ".") {
    repeat(repeticiones!!){   // Los !! son el ; de Kotlin xD
        println("$frase$puntuacion")
    }
}

fun calcular_edad (anioNacimiento: Int , anioActual: Int? = 2022) {
    var edad = anioActual!! - anioNacimiento
    println("Tiene $edad años")
}

fun sumar_elementos (lista: List<Int> , inicio: Int? = 0): Int {
    var total = 0    // No sé qué le pasa a inicio en la función la verda.... Según el chagepeto no pinta nada
    for (i in lista){
        total += i
    }
    return total
}