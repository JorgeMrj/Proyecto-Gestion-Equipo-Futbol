package srangeldev.models

import java.time.LocalDate

/**
 * Clase abstracta que representa a un miembro del personal.
 */
abstract class Personal(
    val id: Int = 0,
    val nombre: String,
    val apellidos: String,
    val fechaNacimiento: LocalDate,
    val fechaIncorporacion: LocalDate,
    val salario: Double,
    val paisOrigen: String
)