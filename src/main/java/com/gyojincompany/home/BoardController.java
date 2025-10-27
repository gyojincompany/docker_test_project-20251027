package com.gyojincompany.home;

import com.gyojincompany.home.entity.Board;
import com.gyojincompany.home.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/board")
    public Board getBoard() {
        Board board = new Board();
        board.setTitle("안녕하세요!");
        board.setContent("안녕 내용입니다!");

        return boardRepository.save(board);
    }
}
