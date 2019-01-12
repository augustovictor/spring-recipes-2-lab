package springrecipes2lab.springrecipes2lab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import springrecipes2lab.springrecipes2lab.greeting.Greeting
import springrecipes2lab.springrecipes2lab.greeting.GreetingEnglish
import springrecipes2lab.springrecipes2lab.greeting.GreetingPortuguese

@SpringBootApplication
class SpringRecipes2LabApplication

fun main(args: Array<String>) {
	runApplication<SpringRecipes2LabApplication>(*args)

	println(Greeting().sayHello())
}

@Bean
fun Greeting(): Greeting {
	return GreetingPortuguese()
}