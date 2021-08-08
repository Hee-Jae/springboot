### Garbage Collection은 무엇인가?
프로그램을 개발 하다 보면 유효하지 않은 메모리인 Garbage가 발생한다. C언어를 사용하면 `free()`라는 함수를 통해 직접 메모리를 해제해주어야 한다. 하지만 Java를 이용해 개발을 하다 보면 개발자가 메모리를 직접 해제해주는 일이 없다. 그 이유는 **JVM의 Garbage Collector가 불필요한 메모리를 알아서 정리해주기 때문이다.** 대신 Java에서 명시적으로 불필요한 데이터를 표현하기 위해서 일반적으로 `null`을 선언해준다.  
Java나 Kotlin에서는 이러한 메모리 누수를 방지하기 위해 Grabage Collector가 주기적으로 검사하여 메모리를 청소해준다. 물론 `System.gc()`를 이용해 직접 호출할 수 있지만, 이 메소드를 호출하는 것은 시스템의 성능에 매우 큰 영향을 미치므로 사용을 자제해야 한다.



<details>
 <summary> 출처 </summary>
- https://mangkyu.tistory.com/118 <br>
</details>