package com.example.sistema.repository

import com.example.sistema.entity.Sistema
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SistemaRepository : JpaRepository<Sistema, Long> {
}
