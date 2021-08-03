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
final의 의미는 최종적이라는 뜻을 가지고 있다. final 필드는 초기값이 저장되면 최종적인 값이 되어 프로그램 실행 도중에 수정할 수 없다.  
final 필드의 초기값을 설정하는 방법은 두 가지가 있다.
1. 필드 선언시 주는 방법
2. 생성자를 통해서 주는 방법

final은 언제 사용할까?  
- **객체 변수를 final로 선언하는 경우**  
  생성된 final 객체는 재생성이 불가능하다. 다만 객체 내부 변수는 변경이 가능하다.
- **클래스를 final로 선언하는 경우**  
  클래스가 최종 상태가 되어 더이상 다른 클래스에 상속이 불가능하다
- **메서드를 final로 선언하는 경우**  
  메서드를 상속받은 클래스에서 메서드를 재정의할 수 없다.


### static은 무엇일까?

출처  
- https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=khm900402&logNo=220303769941  
- https://lemontia.tistory.com/591
- https://soft.plusblog.co.kr/58
- https://coding-factory.tistory.com/
