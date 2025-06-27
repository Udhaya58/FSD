package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exceptions.ISBNNOTFound;
import com.example.demo.Model.Book;
import com.example.demo.Repo.BookRepo;

@Service
public class BookServ {
	@Autowired
	private BookRepo repo;
	
	
	public List<Book> getAllBook(){
		return repo.findAll();
		}
	
	public Book getbyisbn(int isbn){
		return repo.findById(isbn).orElseThrow(()-> new ISBNNOTFound("Book not found"));
	}
	
	public Book addBook(Book book) {
        if (repo.existsById(book.getIsbn()))
            throw new RuntimeException("Book already exists");
        return repo.save(book);
    }

    public Book updateBook(int isbn, Book updated) {
        Book book = getbyisbn(isbn);
        book.setTitle(updated.getTitle());
        book.setAuthor(updated.getAuthor());
        book.setPublicationyear(updated.getPublicationyear());
        return repo.save(book);
    }

    public String deleteBook(int isbn) {
        if (repo.existsById(isbn)) {
        repo.deleteById(isbn);
        return "Book deleted successfully";
        }
        else {
        	return"Book not Found";
        }
    }
	
	

}
