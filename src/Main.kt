fun main (){
    val nombreProducto: String = "Polera"
    var cantidad: Int = 2
    val precio : Double = 12990.0
    val disponible: Boolean = true
    val categoria: Char = 'R'

    val total = precio * cantidad

    println("==== PRODUCTO ====")
    println("Producto: $nombreProducto")
    println("Precio: $precio")
    println("Cantidad: $cantidad")
    println("Disponible: $disponible")
    println("Categoría: $categoria")
    println("Total: $total")


}