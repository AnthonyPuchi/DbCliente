package com.example.prueba.model

import jakarta.persistence.*

@Entity
@Table(name="client")

class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var fullname: String? = null
    var lastname: String? = null
    var age: Int? = null
    var occupation: String? = null
}