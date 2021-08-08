### Builder란 무엇일까?

**Builder** 패턴을 사용하면 객체를 좀 더 안전하고, 보기 좋게 생성할 수 있다. 어떻게 하는 것인지 바로 예시를 들어 알아보자. 아래 코드는 `getter`, `setter`를 사용하는 일반적인 클래스 구조다.  

```java
public class Pet {
    
    private String petName;
    private String ownerName;
    private LocalDate dateOfBirth; //optional

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
```
이러한 구조의 단점은 필수 변수와 선택적인 변수를 구분하여 인스턴스를 생성해야 한다는 것이다. 이렇게 하다보니 런타임 시에 다음과 같은 오류가 생길 수 있다.
- 해당 데이터베이스에서 컬럼은 `null`을 허용하지 않는다.
- 변수에 값이 `set` 되지 않은 상태에서 `get`을 하면 에러가 발생한다.

**Builder** 패턴을 사용하면 위와 같은 오류를 줄일 수 있다.

```java
public class Pet2 {
    
    private String petName;
    private String ownerName;
    private LocalDate dateOfBirth; //optional

    public Pet2(String petName, String ownerName, LocalDate dateOfBirth) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.dateOfBirth = dateOfBirth;
    }

    static class Builder {
        private String petName;
        private String ownerName;
        private LocalDate dateOfBirth; //optional

        public Builder withPetName(String petName) {
            this.petName = petName;
            return this;
        }

        public Builder withOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder withDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Pet2 build() {
            //필수 멤버변수에 값이 할당되지 않으면 예외처리
            if(petName == null || ownerName == null) {
                throw new IllegalStateException("Cannot create Pet2");
            }

            return new Pet2(petName, ownerName, dateOfBirth);
        }
    }
}
```
클래스 내부를 살펴보면 `Builder` 클래스를 생성하고 각각 멤버변수별 메서드를 작성한다. 이는 변수에 값을 `set`하고 `Builder` 객체를 리턴한다. (이러한 이유로 메서드를 연결하여 호출할 수 있다)  
`build()` 메소드는 필수 멤버 변수의 `null`을 체크하고, 지금까지 `set`된 `builder`를 바탕으로 `Pet2`의 생성자를 호출하고 인스턴스를 리턴한다.


<details>
 <summary> 출처 </summary>
- https://deepweller.tistory.com/18  <br>

</details>