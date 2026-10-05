fun main() {
    println("===== CALCULADORA BÁSICA =====")

    while (true) {
        println("Elige una operación:")
        println("1) Suma")
        println("2) Resta")
        println("3) Multiplicación")
        println("4) División")
        println("5) Resto (%)")
        println("6) Salir")
        print("Has elegido el número: ")

        // readLine devuelve el texto y él .trim devuelve "null"
        when (readLine()?.trim()) {

            //Asignamos el valor
            "1" -> {
                val (a, b) = pedirNumeros()
                println("Resultado: ${a + b}")
            }
            "2" -> {
                val (a, b) = pedirNumeros()
                println("Resultado: ${a - b}")
            }
            "3" -> {
                val (a, b) = pedirNumeros()
                println("Resultado: ${a * b}")
            }
            "4" -> {
                val (a, b) = pedirNumeros()
                if (b == 0.0) {
                    println("Error: división por cero")
                } else {
                    println("Resultado: ${a / b}")
                }
            }
            "5" -> {
                val (a, b) = pedirNumeros()
                println("Resultado: ${a % b}")
            }
            "6" -> {
                println("Saliendo de la calculadora...")
                break
            }
            else -> println("Opción no válida")
        }
    }
}

fun pedirNumeros(): Pair<Double, Double> {
    print("Escribe el primer número: ")

    // Con el !! le decimos que no va a ser null
    val a = readLine()!!.toDouble()

    print("Escribe el segundo número: ")
    val b = readLine()!!.toDouble()

    // Para devolver 2 valores
    return Pair(a, b)
}
