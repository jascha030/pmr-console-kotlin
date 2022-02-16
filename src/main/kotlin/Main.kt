fun main(args: Array<String>) = dispatchCommand(args)

private val availableCommands = listOf(::init, ::open, ::help).associateBy { it.name }

fun <T> Array<T>.shifted(): Array<T> = copyOfRange(indexOf(first()) + 1, size)

private fun dispatchCommand(args: Array<String>) {
    val command = args.first()

    availableCommands[command]
        ?.invoke(args.shifted())
        ?: error("Invalid command: $command")
}

fun init(args: Array<String>?) {}

fun open(args: Array<String>?) {}

fun help(args: Array<String>?) {}
