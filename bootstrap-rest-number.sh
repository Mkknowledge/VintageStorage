mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=org.mayur.quarkus.microservices \
        -DprojectArtifactId=rest-number \
        -DclassName="org.mayur.quarkus.microservices.number.NumberResource" \
        -Dpath="/api/numbers" \
        -Dextensions="resteasy-jsonb, smallrye-openapi"