mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=org.mayur.quarkus.microservices \
        -DprojectArtifactId=rest-book \
        -DclassName="org.mayur.quarkus.microservices.book.BookResource" \
        -Dpath="/api/books" \
        -Dextensions="resteasy-jsonb, smallrye-openapi"