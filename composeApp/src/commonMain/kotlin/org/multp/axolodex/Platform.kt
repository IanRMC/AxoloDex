package org.multp.axolodex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform