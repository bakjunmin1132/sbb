package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 컨트롤러는 서버로 온 클라이언트의 요청을 처리하는 클래스
public class HelloController {
    @GetMapping("/hello") // Mapping이란 특정 URL 경로를 서버의 특정 메서드와 연결하는것을 의미
    @ResponseBody

    public String hello() {
        return "Hello SBB";
    }
}
