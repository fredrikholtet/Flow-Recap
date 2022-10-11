package testController com.example.flowrecap.testController

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/")
    fun hei() = "Halla"

}