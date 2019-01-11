package springrecipes2lab.springrecipes2lab

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class HelloWorld {
    @PostConstruct
    fun sayHello() = println("Hello from spring boot 2!")
}