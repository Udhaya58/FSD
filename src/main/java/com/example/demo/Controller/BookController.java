package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Services.BookServ;

import jakarta.validation.Valid;

@RestController
public class BookController {
	@Autowired
	private BookServ serv;
	
	@GetMapping("/getallbook")
	public List<Book> getallbook(){
	return serv.getAllBook();
		
	}
	@PostMapping("/addbook")
	public Book addbook(@Valid @RequestBody Book book){
		return serv.addBook(book);
	}
	@GetMapping("/getbookbyisbn/{id}")
	public Book getbooById(@PathVariable int id) {
		return serv.getbyisbn(id);
	}
	@PutMapping("/updateBookbyisbn/{id}")
	public Book updateBookbyisbn(@PathVariable int id,@RequestBody Book body ) {
		return serv.updateBook(id, body);
	}
	
	@DeleteMapping("/deletebyisbn/{id}")
	public String deleteBook(@PathVariable int id) {
		return serv.deleteBook(id);
	}
	
	

}
