package com.hao123.service;

import com.hao123.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BookService {
    //    增加
    int addBook(Books books);
    //    删除
    int deleteBookById(int id);
    //    更新
    int updateBook(Books books);
    //    查询
    Books queryBookById(int id);

    List<Books> queryAllBook();

    Books queryBookByName(String bookName);
}
