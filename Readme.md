
*nix
```bash
$ ./gradlew build && ./gradlew :application:bootRun
```

windows
```bash
$ gradle.bat build && gradle.bat :application:bootRun
```

```bash
$ ./mvnw install && ./mvnw spring-boot:run -pl application
```

windows 
```bash
mvnw.cmd install && mvnw.cmd spring-boot:run -pl application
```

```http 
http://localhost:8080/
```