package com.example.sistema.entity

import jakarta.persistence.*

@Entity
@Table(name = "empleados_asistencia")
class Sistema {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var nombre: String? = null

    var departamento: String? = null

    var fecha: java.time.LocalDate? = null

    var horaEntrada: java.time.LocalTime? = null

    var horaSalida: java.time.LocalTime? = null
}
