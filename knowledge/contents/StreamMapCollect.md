### Stream, Map, Collect는 무엇일까?


Java8 부터 `Stream`을 사용 할 수 있습니다.
기존에 자바 컬렉션이나 배열의 원소를 가공할 때 `for`, `forEach` 등으로 원소를 하나씩 골라내어 가공하였다면, `Stream`을 이용하여 람다함수형식으로 간결하고 깔끔하게 요소들의 처리가 가능합니다.

배열의 원소를 가공하는데 있어 `map`, `filter`, `sorted` 등이 있습니다.  
- `map` : 요소들을 특정조건에 해당하는 값으로 변환해 줍니다.
- `filter` : 요소들을 조건에 따라 걸러내는 작업을 해줍니다.
- `sorted` : 요소들을 정렬해주는 작업을 해줍니다.

요소들의 가공이 끝났다면 리턴해줄 결과를 `collect`를 통해 만들어줍니다.
- `Collectors.joining` : 리스트를 조인의 기준으로 배치해 String으로 리턴합니다.
- `Collectors.toList` : 리스트로 리턴 받을 수 있습니다.

사용 예시
```java
ArrayList<string> list = new ArrayList<>(Arrays.asList("Apple","Banana","Melon","Grape","Strawberry"));

System.out.println(list.stream().map(s->s.toUpperCase()).collect(Collectors.joining(" ")));
//APPLE BANANA MELON GRAPE STRAWBERRY
        
System.out.println(list.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));
//[APPLE, BANANA, MELON, GRAPE, STRAWBERRY]
        
System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
//[APPLE, BANANA, MELON, GRAPE, STRAWBERRY]
```

<details>
 <summary> 출처 </summary>
- https://dpdpwl.tistory.com/814  <br>
</details>