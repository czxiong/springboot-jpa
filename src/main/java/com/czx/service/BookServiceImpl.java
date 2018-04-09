package com.czx.service;

import com.czx.entity.Book;
import com.czx.repository.BookRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.annotation.Resource;
import java.util.List;

public class BookServiceImpl implements BookService {

    @Resource
    private BookRepository bookRepository;

    @Override
    public List<Book> findBookNoCriteria(Integer pageNo, Integer pageSize) {



        return null;
    }
}