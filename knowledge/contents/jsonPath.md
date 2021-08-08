### jsonPath는 무엇인가?
Json 객체를 탐색하기 위한 표준화된 방법이다. $는 ROOT를 표시하며 하위 element에 접근하려면 .ELEMENT_NAME 형식을 사용하면 된다.  
예시) `$.string` -> ROOT 아래에 있는 string필드의 값을 리턴한다  
.ELEMENT_NAME은 계층적으로 사용할 수 있다.  
예시) `$.object.property` -> object attribute인 property필드의 값을 리턴한다

<details>
 <summary> 출처 </summary>
- https://www.lesstif.com/dbms/jsonpath-54952418.html <br>
</details>