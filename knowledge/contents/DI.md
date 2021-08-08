### DI는 무엇인가?

Dependency Injection, 의존 관계 주입.  
Inversion of Control(IoC) 라고도 불린다.  
어떤 객체가 사용하는 의존 객체를 직접 만들어 사용하는게 아니라, 주입 받아 사용하는 방법이다. 

#### 의존성 주입 예시
```java
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
```

#### 의존성 주입이 아닌 경우 예시
```java
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository = new BookRepository();
}
```

<details>
 <summary> 출처 </summary>
- https://devlog-wjdrbs96.tistory.com/165?category=882236 <br>
</details>