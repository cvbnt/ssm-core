package com.hao123.dao;

import com.hao123.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
//    增加
    int addBook(Books books);
//    删除
    int deleteBookById(@Param("bookId") int id);
//    更新
    int updateBook(Books books);
//    查询
    Books queryBookById(int id);

    List<Books> queryAllBook();

    Books queryBookByName(String bookName);
}
