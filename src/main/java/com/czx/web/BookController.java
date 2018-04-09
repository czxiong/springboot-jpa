package com.czx.web;

import com.czx.entity.Book;
import com.czx.repository.BookRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/list")
    @ApiOperation(value = "查询所有图书列表")
    private List<Book> selectBookList(){
        return bookRepository.findAll();
    }

}
