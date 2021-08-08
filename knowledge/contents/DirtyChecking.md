### 더티체킹(Dirty Checking)은 무엇일까?

다음은 데이터베이스의 `entity`를 수정하는 코드다.
```java
@RequiredArgsConstructor
@Service
public class PayService {

    private final PayRepository payRepository;

    @Transactional
    public void update(Long id, String tradeNo) {
        Pay pay = payRepository.getOne(id);
        pay.changeTradeNo(tradeNo);
    }
}
```
`save` 메소드로 변경 사항을 저장하지 않아도 `update` 쿼리가 실행되어 변경사항이 적용된다.

#### 어떻게?
JPA에서는 `entity`를 조회하면 해당 `entity`의 조회 상태 그대로 **스냅샷**을 만들어 놓는다. 그리고 트랜잭션이 끝나는 시점에서 이 **스냅샷과 비교해서 다른 점**이 있다면 `Update Query`를 데이터베이스로 전달한다.

<details>
 <summary> 출처 </summary>
- https://jojoldu.tistory.com/415  <br>
</details>