package com.pluralsight;

import com.pluralsight.model.Book;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by eric on 16/06/2016.
 */
public class BookResourceTest extends JerseyTest {
    @Override
    protected Application configure() {
        return new ResourceConfig().packages("com.pluralsight");
    }

    @Test
    public void testGetSingleBook() {
        Book response = target("books").path("1").request().get(Book.class);
        assertNotNull(response);
    }

    @Test
    public void testGetBooks() {
        Collection books = target("books").request().get(new GenericType<Collection<Book>>(){});
        assertEquals(2, books.size());
    }
}
