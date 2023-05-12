package com.example.SpringBoot_CrudOperations.repository;
	import org.springframework.data.repository.CrudRepository;

import com.example.SpringBoot_CrudOperations.model.Books;
	//repository that extends CrudRepository
	
	public interface BooksRepository extends CrudRepository<Books, Integer>
	{
}
