package org.mayur.quarkus.microservices.number;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Number Microservice",
                     description = "This microservice generates book numbers",
                     version = "1.0",
                     contact = @Contact(name = "@mayur", email = "mayurkandalkar.it@gmail.com")),
        externalDocs = @ExternalDocumentation(url = "https://github.com/Mkknowledge/VintageStorage",
                                              description = "All code for Microservice"),
        tags = {
                @Tag(name = "api", description = "Public API that can be used by anybody"),
                @Tag(name = "numbers", description = "Anybody interested in numbers")
        }

)
public class NumberMicroservice extends Application {
}
