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

}

fun listaMutable() {
    val lista = mutableListOf("Hola", "Adios")
    println("Lista inicial: $lista")
    lista.add("Churros")
    println("Lista modificada: $lista")
}

