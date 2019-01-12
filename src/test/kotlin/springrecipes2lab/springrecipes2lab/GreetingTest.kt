package springrecipes2lab.springrecipes2lab

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.util.ReflectionTestUtils

@RunWith(SpringRunner::class)
@SpringBootTest
class GreetingTest {

    private val greeting = Greeting()

    @Test
    fun testPrivateAttribute() {
        val greetingName = ReflectionTestUtils.getField(greeting, "name")
        assertEquals("Victor Augusto", greetingName)
    }
}