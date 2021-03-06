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


<details>
 <summary> 출처 </summary>
- https://coding-factory.tistory.com/ <br>
</details>