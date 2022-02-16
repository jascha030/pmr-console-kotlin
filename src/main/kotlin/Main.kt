fun main(args: Array<String>) {
}

fun <T> Array<T>.shifted(): Array<T> = copyOfRange(indexOf(first()) + 1, size)

private val availableCommands = listOf(::init, ::open, ::help).associateBy { it.name }

private fun dispatchCommandFromArgument(command: String, args: Array<String>?) =
    availableCommands[command]?.invoke(args) ?: error("Invalid command: $command")

fun init(args: Array<String>?) {}

fun open(args: Array<String>?) {}

fun help(args: Array<String>?) {}
