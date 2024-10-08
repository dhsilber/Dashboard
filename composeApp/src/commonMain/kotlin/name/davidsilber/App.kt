package name.davidsilber

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dashboard.composeapp.generated.resources.Res
import dashboard.composeapp.generated.resources.compose_multiplatform
import dev.bluefalcon.ApplicationContext
import dev.bluefalcon.BlueFalcon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
//
//    val context = ApplicationContext
//    try {
//        val blueFalcon = BlueFalcon(context, )
//        blueFalcon.scan()
//    } catch (exception: Exception) {
//        println("Exception: $exception")
//        //request the ACCESS_COARSE_LOCATION permission
//    }

    MaterialTheme {
//        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me!")
//            }
//            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                val messages = remember { messages() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                    messages.map {
                        Text( it )
                    }
                }
//            }
        }
    }
}