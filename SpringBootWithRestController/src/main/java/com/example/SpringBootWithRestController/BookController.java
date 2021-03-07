package com.example.SpringBootWithRestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/books")
	public static List<Book> getAllBook() {

		return Arrays.asList(new Book(1, "Java", "Jems Goslin"), new Book(2, "Spring", "Rod Jhonson"));
	}

}
