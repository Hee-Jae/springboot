### MockMvc는 무엇인가?

실제 객체와 비슷하지만 테스트에 필요한 기능만 가지는 **가짜 객체**를 만들어서 애플리케이션 서버에 배포하지 않고도 **스프링 MVC 동작을 재현할 수 있는 클래스**를 의미한다.

#### 사용법
의존성에 `spring-boot-starter-test` 를 추가해준다. <br>  
**build.gradle**
```gradle
testComplie("org.springframework.boot:spring-boot-starter-test")
```

#### MockMvc 의 메소드
- `perform()` : 요청을 전송하는 역할을 합니다. 결과로 `ResultActions` 객체를 받으며, `ResultActions` 객체는 리턴 값을 검증하고 확인할 수 있는 `andExpect()` 메소드를 제공해줍니다.

- `get(url)`: url 로 HTTP GET 요청을 보냅니다.
  - 비슷한 메소드로 post, put, delete 가 있습니다.
- `params(info)` : `키=값` 의 파라미터를 전달할 수 있습니다. 여러 개 일 때는 `params()`를, 하나일 때는 `param()`을 사용합니다. (당연히 `info`는 Map 타입이겠죠?)
- `andExpect()` : 응답을 검증하는 역할을 합니다.
  - 상태 코드 `status()`
    - `isOk()` : 200
    - `isNotFound()` : 404
    - `isMethodNotAllowed()` : 405
    - `isInternalServerError()` : 500
    - `is(int status)` : status 상태 코드
  
  - 뷰 `view()`
    - 리턴하는 뷰 이름을 검증합니다.
    - ex) `view().name("blog")` 리턴하는 뷰 이름이 blog 인가?
  - 리다이렉트 `redirect()`
    - 리다이렉트 응답을 검증합니다.
    - ex) `redirectUrl("/blog")`: '/blog'로 리다이렉트 되었는가?
  - 모델 정보 `model()`
    - 컨트롤러에서 저장한 모델들의 정보 검증
  - 응답 정보 검증 `content()`
    - 응답에 대한 정보를 검증해줍니다.
- `andDo(print())` : 요청/응답 전체 메시지를 확인할 수 있습니다.

<details>
 <summary> 출처 </summary>
- https://shinsunyoung.tistory.com/52 <br>
</details>