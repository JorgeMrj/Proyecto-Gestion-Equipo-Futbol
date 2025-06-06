package srangeldev.models

import java.time.LocalDate

/**
 * Clase que representa a un jugador.
 */
class Entrenador(
    id: Int,
    nombre: String,
    apellidos: String,
    fechaNacimiento: LocalDate,
    fechaIncorporacion: LocalDate,
    salario: Double,
    paisOrigen: String,
    val especializacion: Especializacion
): Personal(id, nombre, apellidos, fechaNacimiento, fechaIncorporacion, salario, paisOrigen) {
    enum class Especializacion {
        ENTRENADOR_PRINCIPAL, ENTRENADOR_ASISTENTE, ENTRENADOR_PORTEROS
    }
    override fun toString(): String {
        return "Entrenador(id=$id, nombre='$nombre', apellidos='$apellidos', fechaNacimiento=$fechaNacimiento, fechaIncorporacion=$fechaIncorporacion, salario=$salario, paisOrigen='$paisOrigen', especializacion=$especializacion)"
    }
}