package com.czx.service;

import com.czx.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findBookNoCriteria(Integer pageNo,Integer pageSize);

}
