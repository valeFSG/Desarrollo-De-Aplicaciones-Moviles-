fun main() {
    // SISTEMA SIMPLE DE NOTAS

    val notas = listOf(5.5, 3.8, 6.2, 4.0, 2.9)
    println("==== NOTAS ====")

    for (nota in notas) {
        println("Nota: $nota")
    }

    // NOTAS APROBADAS

    val notasAprobadas = notas.filter { it >= 4.0 }
    println("==== NOTAS APROBADAS ====")

    for (nota in notasAprobadas) {
        println("Nota aprobada: $nota")
    }

    // PROMEDIO

    val promedio = notas.average()

    println("Promedio: $promedio")

    // FUNCIÓN ESTA APROBADO

    println("==== EVALUACIÓN ====")

    println("¿La nota 5.5 está aprobada?: ${estaAprobado(5.5)}")
}

fun estaAprobado(nota: Double): Boolean {
    return nota >= 4.0

}