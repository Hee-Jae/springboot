package com.heejae.springboot.web;

import com.heejae.springboot.config.auth.LoginUser;
import com.heejae.springboot.config.auth.dto.SessionUser;
import com.heejae.springboot.service.posts.PostsService;
import com.heejae.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user){
        model.addAttribute("posts", postsService.findAllDesc());

        // CustomOAuth2UserService 에서 로그인 성공 시 세션에 SessionUser 를 저장하도록 구성했다.
        // 즉, 로그인 성공시 httpSession.getAttribute("user"); 에서 값을 가져올 수 있다.

        if(user != null){
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
