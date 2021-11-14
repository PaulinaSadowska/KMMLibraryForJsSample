import org.jetbrains.base64.HelloWorld
import kotlin.test.Test
import kotlin.test.assertEquals

class GreeterTest {

    @Test
    fun testMe() {
        assertEquals("Hello from the KMM side!", HelloWorld.sayHelloFromKMM())
    }
}