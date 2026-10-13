# 01-java-dual-valid-app
Valid project with BOTH `pom.xml` and `build.gradle` in the root, standard public dependencies
(commons-lang3, gson, junit-jupiter), a single `Main` class, and an executable-jar manifest.

Maven:  mvn test | mvn package | mvn compile exec:java | java -jar target/dual-valid-app-1.0.0.jar
Gradle: ./gradlew test | ./gradlew run | ./gradlew jar && java -jar build/libs/dual-valid-app-1.0.0.jar

Expected: detection + dependency resolution + build all succeed. Output: JSON greeting.
