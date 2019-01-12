package springrecipes2lab.springrecipes2lab

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class HelloWorld {
    @Value("\${app.author}")
    private lateinit var appAuthor: String

    @PostConstruct
    fun sayHello() = println("Hello from spring boot 2!")
    @PostConstruct
    fun printAuthor() = println(appAuthor)
}