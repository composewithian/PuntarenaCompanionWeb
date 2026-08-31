package com.eeeyan.puntarenacompanionweb

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform