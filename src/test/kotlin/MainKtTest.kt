import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MainKtTest {
    private val testArray: Array<String> = arrayOf("test1", "test2", "test3")

    @Test
    fun shift() {
        val expected = arrayOf("test2", "test3")

        assertArrayEquals(expected, testArray.shifted())
    }
}