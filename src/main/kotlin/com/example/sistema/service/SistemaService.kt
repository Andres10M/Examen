package com.example.sistema.service

import com.example.sistema.dto.SistemaDto
import com.example.sistema.entity.EmpleadosAsistenciaVista
import com.example.sistema.entity.Sistema
import com.example.sistema.mapper.SistemaMapper
import com.example.sistema.repository.EmpleadosAsistenciaVistaRepository
import com.example.sistema.repository.SistemaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SistemaService {

    @Autowired
    lateinit var sistemaRepository: SistemaRepository

    @Autowired
    lateinit var empleadosAsistenciaVistaRepository: EmpleadosAsistenciaVistaRepository

    // Método para obtener todos los sistemas
    fun getSistemas(): List<Sistema> {
        return sistemaRepository.findAll()
    }

    // Método para obtener los registros de la vista 'empleados_asistencia_vista'
    fun getAsistenciaVista(): List<EmpleadosAsistenciaVista> {
        return empleadosAsistenciaVistaRepository.findAll()
    }

    // Método para guardar un nuevo sistema
    fun save(sistemaDto: SistemaDto): Sistema {
        val sistema = SistemaMapper.toEntity(sistemaDto)
        return sistemaRepository.save(sistema)
    }
}
