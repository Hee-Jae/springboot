### RequiredArgsConstructor는 무엇인가?

`final`로 선언된 field를 파라미터로 갖는 생성자를 만들어준다.

```java
@RequiredArgsConstructor

public class User {
  private final Long id;
  private final String name;
  private int score;
}
```
위의 코드는 아래와 같은 코드가 된다.
```java
public class User {
  private final Long id;
  private final String name;
  private int score;
  
  public User(Long id, String name){
    // 대충 생성자 코드    
  }
}
```
<details>
 <summary> 출처 </summary>
- hhttps://www.daleseo.com/lombok-popular-annotations/ <br>
</details>