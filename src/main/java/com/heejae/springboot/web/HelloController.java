package com.heejae.springboot.web;
import com.heejae.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// JSON 을 반환하는 컨트롤러로 만들어준다.
@RestController
public class HelloController {
    // HTTP 의 GET Method 요청을 받을 수 있는 API 를 만들어준다.
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
