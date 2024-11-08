package com.example.sistema.controller

import com.example.sistema.dto.SistemaDto
import com.example.sistema.entity.Sistema
import com.example.sistema.service.SistemaService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/sistema")
class SistemaController {
    @Autowired
    lateinit var sistemaService: SistemaService

    @GetMapping
    fun getSistemas() = sistemaService.getSistemas()

    @PostMapping
    fun save(@RequestBody @Valid sistemaDto: SistemaDto): Sistema {
        return sistemaService.save(sistemaDto)
    }
}
