package zhi.yest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Producer

fun main(args: Array<String>) {
    runApplication<Producer>(*args)
}
