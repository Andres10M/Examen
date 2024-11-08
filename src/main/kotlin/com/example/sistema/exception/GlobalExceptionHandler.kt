package com.example.sistema.exception

import com.example.sistema.response.JSendResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.validation.FieldError

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationException(ex: MethodArgumentNotValidException): ResponseEntity<JSendResponse> {
        val errors = ex.bindingResult.allErrors.map {
            (it as FieldError).field to it.defaultMessage
        }

        val errorMessage = errors.joinToString(", ") { "${it.first}: ${it.second}" }


        val response = JSendResponse.fail(
            data = errorMessage,
            message = "Datos no válidos"
        )

        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }
}
