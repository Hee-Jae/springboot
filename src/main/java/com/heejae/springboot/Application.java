package com.heejae.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
// 스프링 부트 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정한다.
// 이 위치로부터 설정을 읽어 나가기 때문에 이 클래스는 항상 프로젝트의 최상단에 있어야한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args); // 내장 WAS 실행
    }
}
