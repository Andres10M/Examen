package com.example.sistema.mapper

import com.example.sistema.dto.SistemaDto
import com.example.sistema.entity.Sistema

object SistemaMapper {
    fun toEntity(sistemaDto: SistemaDto): Sistema {
        val sistema = Sistema()
        sistema.nombre = sistemaDto.nombre
        sistema.departamento = sistemaDto.departamento
        sistema.fecha = sistemaDto.fecha
        sistema.horaEntrada = sistemaDto.horaEntrada
        sistema.horaSalida = sistemaDto.horaSalida
        return sistema
    }
}
