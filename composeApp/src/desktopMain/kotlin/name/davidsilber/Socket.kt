package name.davidsilber

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.SocketException

@DelicateCoroutinesApi
class Socket {
    init {
        GlobalScope.launch {
            val buffer = ByteArray(256)
//            val counter = 0
            while (true) {
                try {
                    val socket = DatagramSocket(4322)
                    val socketPort = socket.localPort
                    JVMDisplay.add("Listening at port $socketPort...")

                    while (true) {
                        JVMDisplay.add("constructing...")
                        val packet = DatagramPacket(buffer, buffer.size)
                        JVMDisplay.add("waiting...")
                        socket.receive(packet)
                        JVMDisplay.add("got packet.")
                        val address = packet.address
                        val port = packet.port
                        JVMDisplay.add("$address:$port")
                        delay(100L)
                    }
                } catch (exception: SocketException) {
                    JVMDisplay.add("Exception!")
                    continue
                }
            }
        }
    }
}