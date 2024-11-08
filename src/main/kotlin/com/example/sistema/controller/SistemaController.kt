package com.example.sistema.controller

import com.example.sistema.dto.SistemaDto
import com.example.sistema.entity.Sistema
import com.example.sistema.response.JSendResponse
import com.example.sistema.service.SistemaService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
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
    fun getSistemas(): ResponseEntity<*> {
        return try {
            ResponseEntity.ok(JSendResponse.success(data = sistemaService.getSistemas()))
        } catch (e: Exception) {
            ResponseEntity(
                JSendResponse.error(
                    message = "Error al obtener los sistemas",

                ),
                HttpStatus.INTERNAL_SERVER_ERROR
            )
        }
    }

    @PostMapping
    fun save(@RequestBody @Valid sistemaDto: SistemaDto): ResponseEntity<*> {
        return try {
            val savedData = sistemaService.save(sistemaDto)
            ResponseEntity(
                JSendResponse.success(
                    data = savedData,
                    message = "Operación exitosa"
                ),
                HttpStatus.CREATED
            )
        } catch (e: IllegalArgumentException) {
            ResponseEntity(
                JSendResponse.fail(
                    data = null,
                    message = "Datos inválidos proporcionados: ${e.message}"
                ),
                HttpStatus.BAD_REQUEST
            )
        } catch (e: Exception) {
            ResponseEntity(
                JSendResponse.error(
                    message = "Error al guardar el sistema",

                ),
                HttpStatus.INTERNAL_SERVER_ERROR
            )
        }
    }
}
