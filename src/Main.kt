fun main(){
    val intNum: Int = 10
    val doubleNum: Double = 10.0
    val floatNum: Float = 10.0f
    val string: String = "Hola Mundo"
    val boolean: Boolean = true
    val lista = mutableListOf(2, 4, 8)

    println("Entero: $intNum, Double:  $doubleNum, Flotante: $floatNum, String: $string, Boolean: $boolean")
    println("\n----- Lista Mutable -----\n")
    listaMutable()
    println("\n----- Mapa -----\n")
    Mapa()
    println("\n----- Condiciones -----\n")
    Condiciones()
    println("\n----- Bucle For -----\n")
    BucleFor(lista)
    println("\n----- Bucle While -----\n")
    BucleWhile(lista)
    println("\n----- When -----\n")
    When()
    println("\n----- Clases -----\n")
    Clases()
    println("\n----- Null Safety -----\n")
    NullSafety()
}

fun listaMutable() {
    val lista = mutableListOf("Hola", "Adios")
    println("Lista inicial: $lista")
    lista.add("Churros")
    println("Lista modificada: $lista")
}

fun Mapa(){
    val myMap = mutableMapOf("Manuel" to 48, "Javier" to 36)
    println("Mapa original: $myMap")
    myMap["Rodrigo"] = 23
    println("Mapa Modificado: $myMap")
    println("Valor de Rodrigo: ${myMap["Rodrigo"]}")
}

fun Condiciones(){
    var numero = 2

    if (numero == 2) {
        println("Correcto")
    }
}

fun BucleFor(lista: MutableList<Int>) {
    for (numero in lista) {
        println(numero)
    }
}

fun BucleWhile(lista: MutableList<Int>){
    var numero = 0
    while (numero < lista.count()) {
        println(lista[numero])
        numero++
    }
}

fun When(){
    val dia = 5
    val resultado = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Día inválido"
    }
    println(resultado)
}

fun Clases(){
    class MiClase(val nombre: String, val edad: Int)

    val miClase = MiClase("Samu", 19)
    println("Nombre: ${miClase.nombre}")
    println("Edad: ${miClase.edad}")
}

fun NullSafety(){
    var name: String? = null
    name?.let {
        println("Mi nombre es $it")
    }?: run {
        println("No tengo nombre")
    }
}