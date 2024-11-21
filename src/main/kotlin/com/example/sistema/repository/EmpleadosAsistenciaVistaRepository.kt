package com.example.sistema.repository

import com.example.sistema.entity.EmpleadosAsistenciaVista
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
interface EmpleadosAsistenciaVistaRepository : JpaRepository<EmpleadosAsistenciaVista, Long> {
    fun findByFecha(fecha: LocalDate): List<EmpleadosAsistenciaVista>
}