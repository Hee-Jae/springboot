### springframework.ui.Model은 무엇일까?

```java
@GetMapping("/posts/update/{id}")
public String postsUpdate(@PathVariable Long id, Model model){
    PostsResponseDto dto = postsService.findById(id);
    model.addAttribute("post", dto);

    return "posts-update";
}
```

`/posts/update/{id}`라는 url에 매핑되도록 하였고 특이한 점은 `Model`을 매개변수로 전달받고 있다. 매개변수로 전달받은 `model.addAttribute("post", dto);` 메소드를 이용하여 view에 전달할 데이터를 (key, value) 쌍으로 전달할 수 있다.
<details>
 <summary> 출처 </summary>
- https://galid1.tistory.com/504  <br>
</details>