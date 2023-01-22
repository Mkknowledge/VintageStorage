package org.mayur.quarkus.microservices.book;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.Instant;

@Path("/api/books")
@Tag(name = "Book REST endpoints")
public class BookResource {

    @Inject
    Logger logger;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Operation(
            summary = "Creates a Book",
            description = "Creates a Book with an ISBN number"
    )
    public Response createABook(@FormParam("isbn13")String isbn13,
                                @FormParam("title") String title,
                                @FormParam("author") String author,
                                @FormParam("yearOfPublication") int yearOfPublication,
                                @FormParam("genre") String genre) {

        Book book = new Book();
        book.isbn13=isbn13;
        book.title=title;
        book.author=author;
        book.yearOfPublication=yearOfPublication;
        book.genre=genre;
        book.creationDate= Instant.now();
        logger.info("Book created : " + book);
        return Response.status(201).entity(book).build();
    }
}