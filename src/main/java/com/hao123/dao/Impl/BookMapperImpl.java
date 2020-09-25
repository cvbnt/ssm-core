package com.hao123.dao.Impl;

import com.hao123.dao.BookMapper;
import com.hao123.pojo.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookMapperImpl implements BookMapper {



    public int addBook(Books books) {
        return 0;
    }

    public int deleteBookById(int id) {
        return 0;
    }

    public int updateBook(Books books) {
        return 0;
    }

    public Books queryBookById(int id) {
        return null;
    }

    public List<Books> queryAllBook() {
        return null;
    }

    public Books queryBookByName(String bookName) {
        return null;
    }
}
