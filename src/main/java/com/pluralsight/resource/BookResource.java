package com.pluralsight.resource;

import com.pluralsight.dao.BookDao;
import com.pluralsight.model.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * Created by eric on 16/06/2016.
 */
@Path("books")
public class BookResource {

    private BookDao bookDao = new BookDao();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Book> getBooks() {
        return bookDao.getBooks();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook( @PathParam("id") String id) {
        return bookDao.getBookById(id);
    }
}
