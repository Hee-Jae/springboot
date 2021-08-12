package com.heejae.springboot.web;
import com.heejae.springboot.config.auth.SecurityConfig;
import com.heejae.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

// SpringRunner.class 라는 스프링 실행자를 실행한다. 스프링 부트 테스트와 Junit 사이에 연결자 역할을 한다.
@RunWith(SpringRunner.class)
// 테스트 어노테이션, Web 에 집중할 수 있는 어노테이션이다.
@WebMvcTest(controllers = HelloController.class,
        excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = SecurityConfig.class)
        })
public class HelloControllerTest {

    // 스프링이 관리하는 빈(Bean)을 주입 받는다.
    @Autowired
    // 웹 API 를 테스트할 때 사용된다. 스프링 MVC 테스트의 시작점이다. GET, POST Method 등에 대한 API 를 테스트할 수 있다.
    private MockMvc mvc;

    @WithMockUser(roles = "USER")
    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        // MockMvc 를 통해 /hello 주소로 HTTP GET 요청을 한다.
        // 체이닝이 지원되어 여러 검증 기능을 이어서 선언할 수 있다.
        mvc.perform(get("/hello"))
                .andExpect(status().isOk()) // mvc.perform 의 결과를 검증한다. Header 의 Status 가 200인지 검증한다.
                .andExpect(content().string(hello)); // 응답 본문의 내용을 검증한다.
    }

    @WithMockUser(roles = "USER")
    @Test
    public void helloDto가_리턴된다() throws Exception{
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name) // API 테스트할 때 사용될 요청 파라미터를 설정한다.
                        .param("amount", String.valueOf(amount))) // 값은 String 만 허용된다.
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name))) // JSON 응답값을 필드별로 검증할 수 있는 메소드
                .andExpect(jsonPath("$.amount", is(amount))); // $를 기준으로 필드명을 명시한다.
    }
}
