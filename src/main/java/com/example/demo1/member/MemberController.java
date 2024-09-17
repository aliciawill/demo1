package com.example.demo1.member;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/member")
public class MemberController {

    private static final Logger logger = LogManager.getLogger(MemberController.class);

    @GetMapping("/")
    public String home() {
        logger.debug("member start page");
        return "member/member";  // src/main/resources/templates/member/member.html 파일을 가리킴
    }
}
