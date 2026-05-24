import kotlin.math.pow
import kotlin.random.Random

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
    println(persona2)*/

    // imprimir_tabla_multiplicar (7)

    // comprar_producto("Patatas" , 2 , 2.35)

    // imprimir_frase("Castigao sin sexo" , 5)

    // calcular_edad(1932)

    // val lista = listOf (23 , 47 , 55)
    // println(sumar_elementos(lista))

    // 14/05

    // construir_casa("madera")

    // var elInteres = (calcular_interes(12000 , 0.07 , 1))
    // println(elInteres)

    //// LAMBDA ////
    /* val lista = filtrar_positivos(listOf (20 , -11 , -56 , 43))
    val positivos = filtrar_positivos(lista)
    println(positivos) */
    /* ---- ESTE ES EL BUENO ----
    val filtrarPositivos = {lista: List<Int> -> lista.filter { it > 0 }}
    val Lista = listOf(-1,2,-3,-4,5)
    println(filtrarPositivos(Lista))*/

    /* val lista = listOf(2 , 3 , 4)
    var resultado = doble (lista)
    println(resultado) */
    /* ---- ESTE ES EL BUENO ----
    val doble = { numeros: List<Int> -> numeros.map { it * 2 } }
    val numeros = listOf(1,2,5,20)
    println(doble(numeros)) */

    // var resultado = invertir_cadena("Qué puta mierda es esta") ----- QUÉ COJONES ES ESTA MIERDA -----
    // println(resultado)
    /* ---- ESTE ES EL BUENO ----
    val invertirCadena = { texto: String -> texto.reversed() }
    val texto = "Esto es algo más entendible"
    println(invertirCadena(texto))*/

    /* val filtrarImpares = { numeros: List<Int> -> numeros.filter { it %2 != 0 } } // WOOOO qué guapo
    val numeros = listOf(23 , 12 , 34 , 67)
    println(filtrarImpares(numeros))*/

    /* val mayorACien = { numeros: List<Int> -> numeros.filter { it > 100 } }
    val numeros = listOf(23, 245, 88, 100, 789)
    println(mayorACien(numeros))*/

    /* val numeros = listOf(15, 23, 63, 98)
    val sumarElementos = numeros.reduce { acc, n -> acc + n } // acc = acumulador, n = elemento de la lista
    println(sumarElementos)*/

    /*   Su puta madre...
    val contarVocales = { texto: String -> texto.filter { letra -> letra.lowercaseChar() in "aeiou" }.count () }
    val texto = "A ver como hago yo esto"
    println(contarVocales(texto))*/

    /* Tooooma, lo hice sin tener ni puta idea al principio
    var eliminarDuplicados = { lista: Set<String> -> setOf(lista) }
    var lista = setOf<String>("Meow", "Muuu", "Meow", "Guau", "Aiuda", "Muuu")
    println(eliminarDuplicados(lista))*/

    /* Fasilito
    val encontrarMenor = { lista: List<Int> -> lista.min () }
    val lista = listOf(23, 245, 88, 100, 789)
    println(encontrarMenor(lista))*/

    /* val calcularPromedio = { numeros: List<Int> -> numeros.sum() / numeros.size }
    val numeros = listOf(23, 245, 88, 100, 789)
    println(calcularPromedio(numeros))*/

    //// ESTRUCTURAS CONDICIONALES - SENTENCIA IF //// <- Ahora los pones hijo de puta?
    /*
    //// Si el número es par ////
    val numero = 5
    if ( numero% 2 == 0 ) {
        println("$numero es par")
    } else {
        println("$numero no es par")
    }*/

    /*
    //// Si el caracter es una vocal ////
    var caracter = "m"
    if ( caracter == "a" || caracter == "e" || caracter == "i" || caracter == "o" || caracter == "u") {
        println("$caracter es una vocal")
    } else {
        println("$caracter no es una vocal")
    }*/

    /*
    //// Si el número es negativo ////
    val numero = -4
    if (numero > 0){
        println("$numero no es negatico")
    } else {
        println("$numero es negativo")
    }*/

    /*
    //// Si el número es múltiplo de 3 ////
    val numero = 178
    if ( numero % 3 == 0 ) {
        println("$numero es múltiplo de 3")
    } else {
        println("$numero no es múltipo de 3")
    }*/

    /*
    //// Si el número está entre 10 y 20 ////
    val numero = 14
    if (numero in 10..20) {
        println("$numero está en el range de 10 a 20")
    } else {
        println("$numero no está en el rango de 10 a 20")
    }*/

    /*
    //// Si el número es de un solo dígito ////
    val numero = 3
    if ( numero / 10 >= 1 ){
        println("$numero no es un número de un solo dígito")
    } else {
        println("$numero es un número de un solo dígito")
    }*/

    //// Si el número tiene 3 dígitos ////
    /*val numero = 254
    if ( numero / 100 >= 1 && numero / 100 < 100){
        println("$numero es un número de 3 dígitos")
    } else {
        println("$numero no es un número de 3 dígitos")
    }*/

    //// Si es divisible entre 5 ////
    /* val numero = 170
    if ( numero % 5 == 0 ) {
        println("$numero es divisible entre 5")
    } else {
        println("$numero no es divisible entre 5")
    }*/

    //// Si es capicúa //// ---- Vaaaale tiene sentido
    /*val numero = 22423
    val invertido = numero.toString().reversed()
    if (numero.toString() == invertido) {
        println("$numero es capicúa")
    } else {
        println("$numero no es capicúa")
    }*/
    println("Todos putos, me dan el curso a medias")

//// ESTRUCTURAS CONDICIONALES - SENTENCIA WHEN //// --- La explicación es una basura
    /* val numero1 = 23
    val numero2 = 45
    val result = when {
        numero1 > numero2 -> println("$numero1 es el número mayor")
        numero1 < numero2 -> println("$numero2 es el número mayor")
        else -> {}
    }*/

    /*
    // Llevo varios días sin programar, mi cerebro se está reiniciando pero lo conseguí
    val numero = 98
    val determinarCuartil = when {
        numero in 0..25 -> println("El número está en el primer cuartil")
        numero in 26..50 -> println("El número está en el segundo cuartil")
        numero in 51..75 -> println("El número está en el tercer cuartil")
        else -> println("El número está fuera de los cuartiles")
    }*/

    /* val numero = -435  // FASILITO
    val signo = when {
        numero > 0 -> println("El número es positivo")
        numero < 0 -> println("El número es negativo")
        else -> println("El número es 0")
    }*/

    val calificacion = 2
    val nota = when {
        calificacion in 9..10 -> println("A")
        calificacion in 7..8 -> println("B")
        calificacion in 5..6 -> println("C")
        calificacion in 3..4 -> println("D")
        calificacion in 0..2 -> println("F")
        else -> {}
    }

    val caracter = "u"
    val esVocal = when {
        caracter.lowercase() in "aeiou" -> println("$caracter es una vocal")
        else -> println("$caracter no es una vocal")
    }

    val fecha = 1996
    val esBisiesto = when {
        fecha %4 == 0 -> println("$fecha es un año bisiesto")
        else -> println("$fecha NO es un año bisiesto")
    }

    /* val numero = 23
    val esPar = when {
        numero %2 == 0 -> println("El $numero es par")
        else -> println("El $numero es impar")
    }*/

    val numero1 = 5456
    val numero2= 23
    val divisible = when {
        numero1 %numero2 == 0 -> println("El $numero1 es divisible entre $numero2")
        else -> println("El $numero1 NO es divisible entre $numero2")
    }

    val dia = 3
    val diaSemana = when {
        dia == 1 -> println("Lunes")
        dia == 2 -> println("Martes")
        dia == 3 -> println("Miércoles")
        dia == 4 -> println("Jueves")
        dia == 5 -> println("Viernes")
        dia == 6 -> println("Sábado")
        dia == 7 -> println("Domingo")
        else -> {}
    }

    val palabra = "Muuu3" // Es que tenía que meter el número en el String jeje
    val esNumero = when {
        palabra.lowercase() in "0123456789"-> println("$palabra Es un número")
        else -> println("$palabra no es un número")
    }

//// BUCLES - BUCLE FOR ////
    /* for (i in 2..20 step 2) {
        println(i)
    }

    var sumaNumeros = 0
    for (n in 1..100) {
        sumaNumeros += n
    }
    println(sumaNumeros)

    for (k in 10 downTo 1) {
        println(k)
    }

    val numero = 5
    for (o in 1..10){
        println("$numero x $o = ${numero*o}") // Uff me ha costado hacer esto
    }

    // Imprimir la secuencia de fibonacci hasta un número dado
    var a = 0
    var b = 1
    val numeroDado = 10
    for (u in 0..numeroDado) {
        println(a)
        var siguiente = a + b
        a = b
        b = siguiente
    }*/

    // Imprimir números primos hasta que le diga -- MIRA, ME CAGO EN SU PUTA MADRE
    /*var primoInicial = 2
    val numeroPrimos = 10
    var contador = 0
    println(primoInicial)
    primoInicial++
    while (contador < numeroPrimos) {
        for (p in 2 until primoInicial) {
             if (primoInicial %p == 0) {
                primoInicial++

            }
                println(primoInicial)
                primoInicial++

        }
        contador++
    }*/

    // Imprimir la suma de los cuadrados de los números del 1 al n (donde n es un número dado).
    /* val numero = 4
    var acumulador = 0
    for (n in 1..numero){
        acumulador += n*n
    }
    println(acumulador)*/

    // Imprimir los números perfectos hasta el n-ésimo término (donde n es un número dado) - Este va a ser como los primos
    // NI PUTA IDEA

    // Imprimir la suma de los múltiplos de 3 y 5 hasta n (donde n es un número dado)
    /*val numero = 5
    var acumulador = 0
    for (n in 1..numero) {
        acumulador = 3*n + 5*n
        println(acumulador)
    }*/

    // Imprimir la suma de los dígitos de un número dado. - SUS PUTOS MUERTOS
    /* val numero = 451
    var suma = 0
    for (n in numero.toString()){
        suma += n.toString().toInt()
    }
    println(suma)*/

//// BUCLES - BUCLE FOR EACH ////
    // Dado una lista de números enteros, escribe un código que determine si todos los elementos de la lista son pares.
    // Voy pillando trucos...
    /* val numeros = listOf(2, 6, 88, 42)
    var impares = 0
    numeros.forEach { number ->
        if (number %2 != 0) {
            impares++
        }
    }
    if (impares == 0) {
        println("Todos los números son pares")
    } else {
        println("NO todos los números son pares")
    }*/

    // Dado una lista de cadenas de texto, escribe un código que determine si alguna de las cadenas es un palíndromo
    // (se lee igual de izquierda a derecha y de derecha a izquierda).
    // Sí... ya lo voy pillando
    /*val palabras = listOf("meow", "muuu", "cuack", "wow")
    var acumulador = 0
    palabras.forEach { gato ->
        if (gato != gato.reversed()) {
            acumulador++
        }
    }
    if (acumulador < palabras.size){
        println("Alguna de las cadenas es un palíndromo")
    } else if (acumulador == 0){
        println("Todas las cadenas son palíndromos")
    } else {
        println("Ninguna de las cadenas es un palíndromo")
    }*/

    // Dado una lista de números enteros, escribe un código que calcule la media aritmética de los elementos de la lista.
    /* val numeros = listOf(23, 4, 78, 15)
    var suma = 0
    numeros.forEach { numero ->
        suma += numero
    }
    val media = suma/2
    println(media)*/

    // Dado una lista de cadenas de texto, escribe un código que determine cuántas de las cadenas tienen más de 5 caracteres.
    /* val lista = listOf("Meow", "Grrrrrr", "Woof", "Pspsps")
    var acumulador = 0
    lista.forEach { perro ->
        if (perro.length > 5){
            acumulador++
        }
    }
    println("En la lista hay $acumulador cadenas que tienen más de 5 caracteres")*/

    // Dado una lista de números enteros, escribe un código que determine si hay algún número que sea divisible tanto por 2 como por 3 al mismo tiempo.
    /* val numeros = listOf(23,45, 12, 88)
    var acumulador = 0
    numeros.forEach { meow ->
        if (meow %2 == 0 && meow %3 == 0) {
            acumulador++
        }
    }
    if (acumulador < numeros.size){
        println("Alguno de los números es divisible entre 2 y 3")
    } else if (acumulador == 0){
        println("Ningún número es divisible entre 2 y 3 al mismo tiempo")
    } else {
        println("Todos los números son divisibles entre 2 y 3")
    }*/

    // Dado una matriz de enteros, escribe un código que determine cuántos elementos de la matriz son múltiplos de 3 y no de 5,
    // y que además sean mayores a 10 y menores a 20.
    /* val numeros = listOf(27, 55, 12, 45)
    var acumulador = 0
    numeros.forEach { number ->
        if (number %3 == 0 && number %5 != 0 && number in 11 until 20){
            acumulador++
        }
    }
    println("Números divisibles entre 3, no divisibles entre 5 y comprendidos entre 10 y 20 se han encontrado: $acumulador")*/

//// BUCLES - BUCLE WHILE //// -- Aquí el que escribió los enunciados se fumó un porro
    // Bueno, ni tan mal, creo
    /*println("Ingresa los números positivos que quieras")
    println("Ingresa un número negativo y paro")
    var suma = 0
    while (true) {
        println("Ingresa número:")
        val numero = readln().toIntOrNull()

        if (numero!! < 0){
            break
        }
        suma+=numero
    }
    println("La suma total es: $suma")*/

    // Desarrolla un programa que simule un juego donde los jugadores lanzan un dado hasta que obtienen un 6.
    // El programa debe contar cuántos lanzamientos se necesitaron para obtener un 6. Utiliza un bucle "while" para esto.
    // A TOMAR POR CLETA LA BICICULO - Seguro que pide algo mejor pero que le jodan, que no parezca que he faltado un mes a clase con sus putos ejercicios
    /*var lanzamientos = 0
    var dado = 0
    println("El juego va de lanzar aros, el que saque un 6 gana")
    while (true) {
        dado = Random.nextInt(1,7)
        println("Jugador lanza el dado:")
        if (dado in 1..6) {
            lanzamientos++
            println("Salió $dado")
        }
        if (dado == 6){
            println("Oleee! Tienes la satisfacción de ser ese 16%")
            break
        }
    }
    println("Obtuviste un 6 después de $lanzamientos lanzamientos")*/

    // Crea un programa que solicite al usuario ingresar una cadena de caracteres y luego imprima la cadena,
    // pero omita todas las vocales. Utiliza un bucle "while" y "continue" para ignorar las vocales.
    // Un día sin programar se nota, caguen la puta
    /* println("Escribe lo que sea:")
    var frase = readln()
    var n = 0
    while (n < frase.length) {
        val letra = frase[n]
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            n++
            continue
        }
        print(letra)
        n++
    }*/

    // Diseña un programa que genere una secuencia de números del 1 al 20, pero solo imprime los números impares.
    // Utiliza un bucle "while" y "continue" para omitir los pares.
    // Sencillo, para toda la familia
    /* var inicio = 1
    while (inicio < 20){
        if (inicio %2 == 0){
            inicio++
            continue
        } else {
            println(inicio)
            inicio++
        }
    }*/

    // Desarrolla un programa que recorra una lista de nombres y solo imprima aquellos que tengan más de 5 letras.
    // Utiliza un bucle "while" y "continue" para evitar imprimir los nombres más cortos.
    // Uff, me está costando caguenlaputa
    /* var nombres = listOf("Meow", "Max", "Abbymoshi", "Mollymeow")
    var posicion = 0
    while (posicion < nombres.size){
        var nombre = nombres [posicion]
        if (nombre.length < 5){
            posicion++
            continue
        }
        println(nombre)
        posicion++
    }*/

    // Escribe un programa que imprima los números del 1 al 10, pero omita el número 5.
    // Utiliza un bucle "while" y "continue" para lograr esto.
    // Me meten chorradas de ejercicios en medio, no lo entiendo
    /* var numero = 0
    while (numero <= 10){
        if (numero == 5){
            numero++
            continue
        }
        println(numero)
        numero++
    }*/

    // Crea un programa que solicite al usuario ingresar 5 números enteros y luego imprima la suma de todos los números pares.
    // Utiliza un bucle "while" y "continue" para ignorar los impares.
    // Bieeeeen, he sabido hacerlo sin preguntarle al profe
    /*var contador = 0
    var acumulador = 0
    while (contador < 5){
        println("Ingresa 1 número entero ($contador / 5):")
        val numero = readln().toIntOrNull()
        if (numero!! %2 == 0){
            acumulador += numero
            contador++
            continue
        } else {
            contador++
            continue
        }
    }
    println("La suma total de los números pares introducidos es: $acumulador")*/

    // Diseña un programa que recorra una lista de números y encuentre el primer número mayor que 100.
    // Utiliza un bucle "while" y "break" para detener la iteración una vez que se encuentre dicho número.
    // Vaaaa, cero fallos
    /*val lista = listOf(23, 47, 109, 210)
    var inicioWhile = 0
    while (inicioWhile < lista.size){
        var posicion = lista[inicioWhile]
        if (posicion < 100){
            inicioWhile++
            continue
        } else {
            println(posicion)
            break
        }
    }*/

    // Desarrolla un programa que imprima los primeros 50 números primos. Utiliza un bucle "while" y "break"
    // para salir del bucle una vez que se hayan encontrado los 50 números primos.
    // QUÉ PUTO PESADO CON LOS PUTOS PRIMOS DE LOS COJONES



    // Escribe un programa que solicite al usuario ingresar un número y luego calcule su factorial.
    // Utiliza un bucle "while", "continue" para evitar multiplicar por 0, y "break" para salir del bucle una vez que se haya calculado el factorial.

    /* var inicio = 0
    var resultado = 1
    println("Introduce un número entero positivo:")
    while (true) {
        val numero = readln().toIntOrNull()
        inicio = numero!!    // No sé qué pollas falla
        if (inicio > 1){
            resultado *= inicio
            inicio-1
            continue
        } else if (inicio == 1){
            break
        }
        println("El número factorial de $numero es : $resultado")
    }*/



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
        "nombre" to nombre,
        "edad" to edad,
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

fun construir_casa (material: String , habitaciones: Int? = 2 , patio: Boolean? = true) {
    println("La casa está construida en $material, dispone de $habitaciones habitaciones y un patio $patio")
}

fun calcular_interes (capital: Int , tasa: Double? = 0.05 , tiempo: Int? = 1): Double {
    var interes = capital * tasa!! * tiempo!!
    return interes
}

fun filtrar_positivos (lista: List<Int>): List<Int> {    // El documento donde te explica las cosas es muy klk
    return lista.filter { it > 0}
}

fun doble (numeros: List<Int>): List<Int> {    // Por la cara la verda, el chagepeto me cae mal
    return numeros.map { it * 2 }
}

fun invertir_cadena (texto: String): String {  // Pero qué coño dices
    return texto.reversed()
        .map { it }
        .joinToString ("")  // Se me desencajó la mandíbula. Dimito...
}
