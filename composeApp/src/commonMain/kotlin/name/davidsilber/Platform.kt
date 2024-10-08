package name.davidsilber

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform