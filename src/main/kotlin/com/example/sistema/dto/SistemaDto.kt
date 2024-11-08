package com.example.sistema.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDate
import java.time.LocalTime

class SistemaDto {

    @NotNull(message = "Nombre es requerido")
    @NotBlank(message = "Nombre no puede estar en blanco")
    var nombre: String? = null

    @NotNull(message = "Departamento es requerido")
    @NotBlank(message = "Departamento no puede estar en blanco")
    var departamento: String? = null

    @NotNull(message = "Fecha es requerida")
    var fecha: LocalDate? = null

    @NotNull(message = "Hora de entrada es requerida")
    var horaEntrada: LocalTime? = null

    var horaSalida: LocalTime? = null
}
