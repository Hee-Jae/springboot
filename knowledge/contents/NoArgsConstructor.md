### NoArgsConstructor는 무엇인가?

파라미터가 없는 기본 생성자를 만들어준다.

```java
@NoArgsConstructor

public class User {
  private Long id;
  private String name;
}
```
위의 코드는 아래와 같은 코드가 된다.
```java
public class User {
  private Long id;
  private String name;
  
  public User(){
    // 대충 생성자 코드    
  }
}
```
<details>
 <summary> 출처 </summary>
- hhttps://www.daleseo.com/lombok-popular-annotations/ <br>
</details>