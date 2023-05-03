package com.example.prueba.repository

import com.example.prueba.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface ClientRepository: JpaRepository<Client, Long> {
    fun findById(id: Long?):Client?
}