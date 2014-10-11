package com.example.domain

class Person {

    String firstName
    String lastName

    static searchable = true

    static constraints = {
        firstName nullable: false, blank: false, maxSize: 128
        lastName nullable: false, blank: false, maxSize: 128
    }
}
