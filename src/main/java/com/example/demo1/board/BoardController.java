package com.example.demo1.board;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Log4j2
@RequestMapping("/board")
public class BoardController {

    private static final Logger logger = LogManager.getLogger(BoardController.class);

    @GetMapping("/")
    public String home() {
        logger.debug("board start page");
        return "board/board";  // src/main/resources/templates/member/member.html 파일을 가리킴
    }
}
