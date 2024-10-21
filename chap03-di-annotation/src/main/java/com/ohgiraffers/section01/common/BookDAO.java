package com.ohgiraffers.section01.common;

import java.util.List;

public interface BookDAO {

    // 도서 목록 전체 조회
    List<BookDTO> selectBookList();

    // 도서 번호로 조회
    BookDTO selectOneBook(int seq);



}
