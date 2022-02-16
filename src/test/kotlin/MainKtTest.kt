import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MainKtTest {
    private val testArrayOfThree: Array<String> = arrayOf("test1", "test2", "test3")
    private val testArrayOfOne: Array<String> = arrayOf("test1")

    @Test
    fun shifted() = assertArrayEquals(arrayOf("test2", "test3"), testArrayOfThree.shifted())
    
    @Test
    fun shiftedWithSingleValue() = assertArrayEquals(emptyArray<String>(), testArrayOfOne.shifted())
}