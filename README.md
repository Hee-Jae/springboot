# springboot
스프링부트를 배워보자

### DAO는 무엇일까?
- Data Access Object
- 데이터베이스 관련 작업을 전담하는 클래스
- 데이터베이스에 연결하여 입력, 수정, 삭제, 조회 등의 작업을 하는 클래스


### DTO는 무엇일까?
- Data Transfer Object
- 데이터 전달 단위, 객체를 표현하는 단위
- 보통 테이블의 컬럼들을 멤버변수로 처리한다
- 캡슐화된 객체여야 한다(멤버변수는 `private`이고, getter와 setter가 필수다)
- 로직을 가지지 않는 순수한 데이터 객체이고, getter, setter 메소드만 가진 클래스를 의미한다

### Java Beans이란 무엇일까?
Java로 작성된 소프트웨어 컴포넌트를 일컫는 말로 데이터 표현을 목적으로 하는 Java 클래스다. Java Beans 클래스는 **Java Beans Convention**을 지켜야하며, **Java Beans Convention**은 다음과 같다.
- 클래스는 인자가 없는 기본 생성자를 갖는다.
- 클래스의 멤버 변수는 Properties라고 하며 `private` 접근 제한자를 가져야 한다.
  - 클래스의 Properties들은 Getter, Setter를 통해 접근할 수 있어야 한다.
  - Getter의 이름은 `getProperty`, Setter의 이름은 `setProperty` 이다.
  - Property Type이 Boolean인 경우 is로 시작할 수 있다.
  - Getter의 경우 파라미터가 존재하지 않아야하며, Setter의 경우 하나 이상의 파라미터가 존재한다.
  - Read Only인 경우 Setter는 없을 수 있다.
- Serializable 인터페이스를 구현한다.
- Java Bean 클래스는 패키징 되어야 한다.
대충 JSP에서 데이터를 담기 위한 표준 규약이라고 볼 수 있다.

### final은 무엇일까?
final의 의미는 최종적이라는 뜻을 가지고 있다. `final` 필드는 초기값이 저장되면 최종적인 값이 되어 프로그램 실행 도중에 수정할 수 없다.  
`final` 필드의 초기값을 설정하는 방법은 두 가지가 있다.
1. 필드 선언시 주는 방법
2. 생성자를 통해서 주는 방법

`final`은 언제 사용할까?  
- **객체 변수를 final로 선언하는 경우**  
  생성된 final 객체는 재생성이 불가능하다. 다만 객체 내부 변수는 변경이 가능하다.
- **클래스를 final로 선언하는 경우**  
  클래스가 최종 상태가 되어 더이상 다른 클래스에 상속이 불가능하다
- **메서드를 final로 선언하는 경우**  
  메서드를 상속받은 클래스에서 메서드를 재정의할 수 없다.


### static은 무엇일까?
정적(static)은 고정된이란 의미를 가지고 있다. `Static`이라는 키워드를 사용하여 Static변수와 Static메소드를 만들 수 있다. 정적 필드와 정적 메소드는 객체에 소속된 멤버가 아니라 클래스에 고정된 멤버다. 그렇기에 클래스 로더가 클래스를 로딩해서 메소드 메모리 영역에 적재할때 클래스별로 관리한다. 따라서 클래스의 로딩이 끝나는 즉시 바로 사용할 수 있다.
- `Static` 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당된다.
- 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
- Garbage Collector의 관리 영역 밖에 존재하기 때문에 Static 영역에 있는 멤버들은 프로그램의 종료 시까지 메모리가 할당된 채로 존재한다.
- Static을 너무 남발하면 만들고자 하는 시스템 성능에 악영향을 줄 수 있다.

### Garbage Collection은 무엇인가?
프로그램을 개발 하다 보면 유효하지 않은 메모리인 Garbage가 발생한다. C언어를 사용하면 `free()`라는 함수를 통해 직접 메모리를 해제해주어야 한다. 하지만 Java를 이용해 개발을 하다 보면 개발자가 메모리를 직접 해제해주는 일이 없다. 그 이유는 **JVM의 Garbage Collector가 불필요한 메모리를 알아서 정리해주기 때문이다.** 대신 Java에서 명시적으로 불필요한 데이터를 표현하기 위해서 일반적으로 `null`을 선언해준다.  
Java나 Kotlin에서는 이러한 메모리 누수를 방지하기 위해 Grabage Collector가 주기적으로 검사하여 메모리를 청소해준다. 물론 `System.gc()`를 이용해 직접 호출할 수 있지만, 이 메소드를 호출하는 것은 시스템의 성능에 매우 큰 영향을 미치므로 사용을 자제해야 한다.

### jsonPath는 무엇인가?
Json 객체를 탐색하기 위한 표준화된 방법이다. $는 ROOT를 표시하며 하위 element에 접근하려면 .ELEMENT_NAME 형식을 사용하면 된다.  
예시) `$.string` -> ROOT 아래에 있는 string필드의 값을 리턴한다  
.ELEMENT_NAME은 계층적으로 사용할 수 있다.  
예시) `$.object.property` -> object attribute인 property필드의 값을 리턴한다  

<details>
 <summary> 출처 </summary>
- https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=khm900402&logNo=220303769941  <br>
- https://lemontia.tistory.com/591 <br>
- https://soft.plusblog.co.kr/58 <br>
- https://coding-factory.tistory.com/ <br>
- https://mangkyu.tistory.com/118 <br>
- https://www.lesstif.com/dbms/jsonpath-54952418.html <br>
</details>
