package com.ohgiraffers.section01.common.subsection01.field;


import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField")
public class BookService {

    // 인터페이스면 구현체가 있으면 되어있는 곳에 자동으로 넣음.
    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBook() {
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq) {
        return bookDAO.selectOneBook(seq);
    }

}
