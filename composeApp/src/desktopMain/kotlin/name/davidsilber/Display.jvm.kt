package name.davidsilber

class JVMDisplay: Display {
    companion object {
        val list: MutableList<String> = mutableListOf()

        fun add(note: String) = list.add(0, note)
    }
}

actual fun messages(): List<String> {
    return JVMDisplay.Companion.list
}