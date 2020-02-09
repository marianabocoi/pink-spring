# pink-spring

## Checklist
- sit by operating system 
- [java](docs/java.md)    
```java --version```  
- [maven](docs/maven.md)   
```mvn -v```
- [IntelliJ](https://www.jetbrains.com/idea/download) 

## What is SpringBoot?
Spring Boot is a mature, open-source, feature-rich framework.

## Generate this project
[Generate this initial project with start.spring.io](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.2.4.RELEASE&packaging=jar&jvmVersion=1.8&groupId=com.pink&artifactId=crypto&name=crypto&description=Demo%20project%20for%20Spring%20Boot&packageName=com.pink.crypto&dependencies=web)

## Basic 
After follow:
https://spring.io/guides/gs/rest-service/#scratch

## Reference code
https://github.com/spring-guides/gs-rest-service/tree/master/complete

## Links
http://localhost:8080/greeting
http://localhost:8080/greeting?name=Kate
http://localhost:8080/cesar?offset=3&text=this%20is%20a%20test

## Commands used
#### Package your jar  
```mvn package```

#### Run the app
```java -jar target/crypto-0.0.1-SNAPSHOT.jar```

#### curl commands for post varsion

- encode  
```
curl -i \
-H "Accept: application/json" \
-H "Content-Type:application/json" \
-X POST --data '{"text": "this is a test", "offset": 3}' "http://localhost:8080/cesar/encode"
```
- decode   
```
curl -i \
-H "Accept: application/json" \
-H "Content-Type:application/json" \
-X POST --data '{"text": "wklv lv d whvw", "offset": 3}' "http://localhost:8080/cesar/decode"
```

## Encrypt or decrypt messages API
Let's make this more exciting! Implement one of the algorithms below!

### Simple - Caesar cipher
https://en.wikipedia.org/wiki/Caesar_cipher

### Medium - Simple Substitution cipher
https://en.wikipedia.org/wiki/Substitution_cipher


## More on classical ciphers
https://en.wikipedia.org/wiki/Classical_cipher