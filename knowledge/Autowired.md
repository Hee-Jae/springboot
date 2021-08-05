### Autowired는 무엇인가?

필요한 의존 객체의 **타입**에 해당하는 [빈](./BeanContainer.md)을 찾아 주입한다.
다음과 같은 3가지의 경우에 Autowired를 사용할 수 있다.
- 생성자
- setter
- field

#### 생성자 예시
```java
@Component
public class MadExample {

    private final HelloService helloService;

    @Autowired
    public MadExample(HelloService helloService) {
        this.helloService = helloService;
    }
}
```

#### setter 예시
```java
@Component
public class MadExample {

    private HelloService helloService;

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
```

#### field 예시
```java
@Component
public class MadExample {

    @Autowired
    private HelloService helloService;
}
```
<details>
 <summary> 출처 </summary>
- https://devlog-wjdrbs96.tistory.com/166 <br>
- https://madplay.github.io/post/why-constructor-injection-is-better-than-field-injection <br>
</details>