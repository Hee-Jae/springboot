### testRestTemplate은 무엇일까?

실제로 웹 서버를 열어서 테스트를 진행한다.
- `restTemplate.getForObject()` : 기본 Http Header를 사용하며 결과를 객체로 반환 받는다.
- `restTemplate.getForEntity()` : 기본 Http Header를 사용하며 결과를 Http ResponseEntity로 반환 받는다.
- `restTemplate.exchange()` : Http Header를 수정할 수 있고 결과를 Http ResponseEntity로 반환 받는다.
- `restTemplate.execute()` : Request/Response 콜백을 수정할 수 있다.


<details>
 <summary> 출처 </summary>
- https://enterkey.tistory.com/275 <br>
</details>