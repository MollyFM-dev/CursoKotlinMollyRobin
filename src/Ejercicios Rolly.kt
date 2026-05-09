fun main() {
    ejerciciosVariables()
}
fun ejerciciosVariables() {
    // Ejercicios 1
    var habitantes = 100002
    val nombre = "Pedro"
    val peso = 23.4

    // Ejercicios 2
    var numero = 5
    numero = 7

    //val cifras = cifras(2,4,6,9) // Asignamos valores a Cifras
    //var (valor1, valor2) = cifras // Sacamos las variables de los valores de cifras

    val (valor1, valor2) = Pair(2,4) // Asignar dos valores a dos variables
    println(valor1)
    println(valor2)

    val (frutas, verduras, hortalizas) = Triple("Tomate","Lechuga","Berengena") // Asignar 3 variables
    println(frutas)
    println(verduras)
    println(hortalizas)

    val expresion = 5+4
    println(expresion)

    // Inicializacion de variables
    /*var x : Int;
    x = 5
    */
    val numeros = intArrayOf()

    val (entero, texto) = Pair(5,"Hola")
    println(entero)
    println(texto)

    val lista = arrayOf(1,2,3)
    lista.forEach { println(it) } // Imprimir los datos de una lista

    // Conversion de tipos de datos en Kotlin

  /*  var bocata: String;
    bocata = "123.45"
    var precio: Double;
    precio = bocata.toDouble();
    println(precio)
*/
    var bocata = "123.45"
    var precio = bocata.toDouble()
    println(precio)

    // Operadores
    var positivo = 1
    var negativo = -positivo
    println(negativo)

    var nega = -5
    var posi = nega*-1
    println(posi)

    var ocho = 8
    var sumaOcho = ocho + -ocho
    println(sumaOcho)

    var menosTres = -3
    var restaTres = menosTres - menosTres*-1
    println(restaTres)

    val x = 15
    val y = 40

    val resultado = x > 10 && y < 20
    println(resultado)

    val q = false
    val w = true

    val e = q == false && w == true
    println(e)

    var r = 5
    val t = r++
    println(r)
    val u = ++r
    println("$t , $u , $r")

    val divisible = 15
    val i = divisible%3 == 0 && divisible%5 == 0
    println(i)

    val o = 20
    val result = if (o>15) true else false
    println(result)

    val age = 25
    val gender = "Female"
    val p = age >= 18 && age <= 30 || gender == "Female"
    println(p)

    // Concatenación
    val nombre1 = "Meow"
    val nombre2 = "Guau"
    var jojo = nombre1 + " " + nombre2
    println(jojo)

    var cadena = listOf<String>("Awawa","elbiberon","chaleco")
    var concatenada = cadena.joinToString(" ")
    println(concatenada)

    var cadena1 = "Caca"
    var cadena2 = "Culo"
    println("$cadena1 - $cadena2")

    val cadena3 = "boca"
    val numero1 = 20
    println("te caben ${numero1.toString()+cadena3} pollas en la $cadena3")

    // Interpolación
    val cara1 = "Cara"
    val cara2 = "Culo"
    val cara3 = "Caca"
    var num1 = 33
    println("$cara1 - $cara2 - $cara3 - ${num1*-1}")

    // Null safety

    var noNul: Any = 2
    println(noNul)

}

//data class cifras(var valor1: Int, var valor2: Int, var valor3: Int,var valor4: Int)