package br.com.linkage.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class Boot
{

   public static void main(String[] args)
   {
      SpringApplication.run(Boot.class, args);
   }

   @RequestMapping("/")
   @ResponseBody
   public String home()
   {
      return "home";
   }
}
