### Optional은 무엇인가?

`java.util.Optional<T>`  
`Optinao<T>` 클래스는 Integer 나 Double 클래스처럼 `T`타입의 객체를 포장해주는 래퍼 클래스(wrapper class)입니다. 따라서 Optional 인스턴스는 모든 타입의 참조 변수를 저장할 수 있습니다.  
이러한 `Optional` 객체를 사용하면 예상치 못한 `NullPointerException` 예외를 간단히 회피할 수 있습니다. 즉, 복잡한 조건문 없이도 널(`null`)값으로 인해 발생하는 예외를 처리할 수 있습니다.

#### Optional 객체의 생성
`of()` 메소드나 `ofNullable()` 메소드를 사용하여 `Optional`  객체를 생성할 수 있다.  
`of()` 메소드는 `null`이 아닌 명시된 값을 가지는 `Optional` 객체를 반환한다. 만약 `of()` 메소드를 통해 `Optional` 객체에 `null`이 저장된다면 `NullPointerException` 예외가 발생한다.

따라서 만약 참조 변수의 값이 만에 하나 `null`이 될 가능성이 있다면, `ofNullable()` 메소드를 이용하여 `Optional` 객체를 생성하는 것이 좋다. `ofNullable()` 메소드는 명시된 값이 `null`이 아니면 명시된 값을 가지는 `Optional` 객체를 반환하며, 명시된 값이 null이면 비어있는 `Optional` 객체를 반환한다.

#### Optional 예시
```java
Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
System.out.println(opt.get());

// 출력 : 자바 Optional 객체
```

`isPresent()` 메소드를 사용하면 `Optional` 객체에 저장된 값이 `null`인지 아닌지 확인할 수 있다.
```java
Optional<String> opt = Optional.ofNullable("자바 Optional 객체");

if(opt.isPresent()) {
    System.out.println(opt.get());
}
```
또한, 다음과 같은 메소드를 이용하여 `null` 대신에 대체할 값을 지정할 수도 있다.
- `orElse()` : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 값이 반환된다.
- `orElseGet()` : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 람다 표현식의 결과값이 반환된다.
- `orElseThrow()` : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 예외를 발생시킨다.


<details>
 <summary> 출처 </summary>
- http://tcpschool.com/java/java_stream_optional <br>
</details>
