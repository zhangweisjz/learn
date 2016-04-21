package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class BootdemoApplication {

//    @RequestMapping("/home")
//    @ResponseBody
//    String home(){
//        return "Good morning Sai " + LocalDateTime.now();
//    }


	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
	}
}
