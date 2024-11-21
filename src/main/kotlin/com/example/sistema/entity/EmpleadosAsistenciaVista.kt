package com.example.sistema.entity

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalTime

@Entity
@Table(name = "empleados_asistencia_vista")
class EmpleadosAsistenciaVista {

    @Id
    @Column(updatable = false)
    var id: Long? = null

    var nombre: String? = null

    var departamento: String? = null

    var fecha: LocalDate? = null

    @Column(name = "horaEntrada")
    var horaEntrada: LocalTime? = null

    @Column(name = "horaSalida")
    var horaSalida: LocalTime? = null
}
