package com.osoleksandr.controller;

import com.osoleksandr.model.Book;
import com.osoleksandr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ModelAndView books() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("bookAtt", new Book());
        mv.addObject("listBooksAtt", bookService.getListOfBooks());
        mv.setViewName("books");
        return mv;
    }

    @RequestMapping(value = "/books/add", method = RequestMethod.POST)
    public ModelAndView addBook(@ModelAttribute("bookAtt") Book book) {
        ModelAndView mv = new ModelAndView();
        //todo validate if book exist
        mv.addObject(book);
        bookService.add(book);
        mv.setViewName("books");
        return mv;
    }

    @RequestMapping("/books/remove{id}")
    public String removeBook(@PathVariable("id") long id) {
        return "redirect:/books";
    }

    @RequestMapping("/books/edit{id}")
    public ModelAndView editBook(@PathVariable("id") long id) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("bookAtt", bookService.getBookById(id));
        mv.addObject("bookListAtt", bookService.getListOfBooks());
        mv.setViewName("books");
        return mv;
    }

    @RequestMapping("/book?{id}")
    public String bookPage(@PathVariable("id") long id, Model model) {
        model.addAttribute("bookAtt", bookService.getBookById(id));
        return "book";
    }
}
