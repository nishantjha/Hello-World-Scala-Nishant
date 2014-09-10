package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import HelloWebApplication._

object HelloWebApplication {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloConfigNishant])
    }
}
@Controller
@EnableAutoConfiguration
class HelloConfigNishant {
  @RequestMapping(Array("/"))
  @ResponseBody
  def home(): String = "Hello World-This is created by Nishant Jha!"
 
}
