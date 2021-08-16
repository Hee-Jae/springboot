### Serialization(직렬화)는 무엇인가?

개발을 하다 보면 아래와 같은 경우가 존재한다.
- 생성한 객체를 파일로 저장할 일이 있을 수도 있다.
- 저장한 객체를 읽을 일이 생길 수도 있다.
- 다른 서버에서 생성한 객체를 받을 일도 생길 수 있다.

이럴 때 꼭 필요한 것이 **Serializable** 이다. 우리가 만든 클래스가 파일에 읽거나 쓸 수 있도록 하거나, 다른 서버로 보내거나 받을 수 있도록 하려면 반드시 이 인터페이스를 구현해야 한다.

#### 그래서 직렬화가 무엇인가 ?!
자바 직렬화란 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도 사용할 수 있도록 바이트(byte)형태로 변환하는 기술과 바이트로 변환된 데이터를 다시 객체로 변환하는 기술(역직렬화)을 아울러서 이야기한다.  
시스템적으로 이야기하자면 JVM의 메모리에 상주(힙 또는 스택)되어 있는 객체 데이터를 바이트 형태로 변환하는 기술과 직렬화된 바이트 형태의 데이터를 객체로 변환해서 JVM으로 상주시키는 형태를 같이 이야기한다.

#### 언제 사용하느냐?
웹 서버의 세션에 `User`의 정보를 저장하기 위해 `User` 객체를 바이트화 시켜야할 때 사용한다. 보통 이럴 때는 `User` 클래스에 직접 직렬화를 구현하지 않고, 직렬화 기능을 가진 `세션 Dto`를 하나 추가로 만들어서 사용한다. 왜냐하면 **상위 클래스에 직렬화를 구현하면 그 자식 클래스까지도 같이 직렬화**가 되기 때문에 성능 이슈, 부수 효과가 발생할 확률이 높다. 


<details>
 <summary> 출처 </summary>
- https://devlog-wjdrbs96.tistory.com/268 <br>
- 여기 레포지토리의 리드미에 나와있는 책 <br>
</details>