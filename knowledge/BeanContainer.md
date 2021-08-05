### Bean Container는 무엇인가?

#### Container
Spring 에서는 `Spring Container`, `IoC Container` 라는 개념을 사용한다.  
Container는 인스턴스의 생명주기를 관리하며, 생성된 인스턴스들에게 추가적인 기능을 제공하도록 하는 것이다. 즉 Container는 적절한 설정만 되어 있다면 누구의 도움 없이도 작성한 코드를 스스로 참조한 뒤 알아서 객체의 생성과 소멸을 컨트롤 해준다.  
`Spring Container`는 Spring Framework의 핵심부에 위치하며, 종속 객체 주입을 이용하여 Application을 구성하는 Component 들을 관리한다.

#### Bean
`Bean`은 `Spring IoC Container`가 관리하는 자바 객체, `Spring Bean Container`에 존재하는 객체를 말한다.  
- `Spring IoC Container`에 의해 인스턴스화, 관리, 생성된다.
- `Bean Container`는 [의존성 주입](./DI.md)을 통해 Bean 객체를 사용할 수 있도록 해준다.
- Spring에서 Bean은 보통 Singletone으로 존재한다.



<details>
 <summary> 출처 </summary>
- https://velog.io/@gillog/Spring-Bean-%EC%A0%95%EB%A6%AC
</details>