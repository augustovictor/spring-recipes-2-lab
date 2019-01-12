package springrecipes2lab.springrecipes2lab

import org.springframework.stereotype.Component

@Component
class Greeting {
    private val name = "Victor Augusto"

    fun sayHello(): String {
        return name
    }

    private fun sayPrivateHello(aName: String? = null) = aName ?: "Private name"
}