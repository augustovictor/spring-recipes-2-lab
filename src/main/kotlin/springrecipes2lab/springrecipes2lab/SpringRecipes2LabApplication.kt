package springrecipes2lab.springrecipes2lab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource

@PropertySource("classpath:custom.properties")
@SpringBootApplication
class SpringRecipes2LabApplication

fun main(args: Array<String>) {
	runApplication<SpringRecipes2LabApplication>(*args)
}

