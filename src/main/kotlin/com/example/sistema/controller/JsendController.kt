package com.example.sistema.controller

import com.example.sistema.dto.SistemaDto
import com.example.sistema.response.JSendResponse
import org.springframework.web.bind.annotation.*
import jakarta.validation.Valid

@RestController
@RequestMapping("/api/sis")
class JsendController {

    @PostMapping("/success")
    fun success(@RequestBody @Valid sistemaDto: SistemaDto): JSendResponse {
        return JSendResponse.success(
            data = sistemaDto,
            message = "Operación exitosa"
        )
    }

    @PostMapping("/fail")
    fun fail(@RequestBody @Valid sistemaDto: SistemaDto): JSendResponse {
        // Este endpoint se usaría si decides manejar algún otro tipo de error
        return JSendResponse.fail(
            data = sistemaDto,
            message = "Hubo un problema con la solicitud"
        )
    }

    @PostMapping("/error")
    fun error(@RequestBody @Valid sistemaDto: SistemaDto): JSendResponse {
        return JSendResponse.error(
            message = "Error en el servidor",
            code = 500
        )
    }
}
