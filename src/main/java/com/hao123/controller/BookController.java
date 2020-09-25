package com.hao123.controller;

import com.hao123.pojo.Books;
import com.hao123.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //    controller层调用service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    //    查询全部书籍，返回书籍展示界面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "/allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "/addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books) {
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBooks", books);
        return "/updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list=new ArrayList<>();
        list.add(books);
        if (books==null){
            list=bookService.queryAllBook();
            model.addAttribute("error","未查到书籍");
        }
        model.addAttribute("list",list);
        return "/allBook";
    }
}
