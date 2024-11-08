package com.example.sistema.service

import com.example.sistema.dto.SistemaDto
import com.example.sistema.entity.Sistema
import com.example.sistema.mapper.SistemaMapper
import com.example.sistema.repository.SistemaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SistemaService {
    @Autowired
    lateinit var sistemaRepository: SistemaRepository

    fun getSistemas(): List<Sistema> {
        return sistemaRepository.findAll()
    }

    fun save(sistemaDto: SistemaDto): Sistema {
        val sistema = SistemaMapper.toEntity(sistemaDto)
        return sistemaRepository.save(sistema)
    }
}
