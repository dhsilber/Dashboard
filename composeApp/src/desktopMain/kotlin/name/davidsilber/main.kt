package name.davidsilber

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dev.bluefalcon.ApplicationContext
import dev.bluefalcon.BlueFalcon
import dev.bluefalcon.Logger
import dev.bluefalcon.PrintLnLogger

fun main() {
    Socket()

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Dashboard",
        ) {
            App()
        }
    }
}