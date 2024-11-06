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