package br.com.moviecmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform