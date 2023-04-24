# STG Spring Boot REST Certification

## About this Certification:

REST is not a technology by a particular organization.  It is an Architectural Style for defining constraints in building web services.  According to Roy Fielding’s dissertation, it is “The Architectural Style” of the modern web.

This means we cannot simply give you a link to “The Documentation” on REST as a single authoritative standard.

In this certification, we will provide instructions to setup a project that can be reviewed by a reviewer.  We provide references to tutorials and documentation to gain a basic understanding of REST and then a practical understanding of developing REST services within Spring Boot.

## Preliminaries

1. Fork the repository (https://bitbucket.org/stgconsulting/javaspringrestcertification).
1. Contact through email or Slack the reviewer that that your project has been setup on your local machine and are ready to start the project.
1. Review the project problem: [Business Problem](https://bitbucket.org/stgconsulting/javaspringrestcertification/src/master/BusinessProblem.md)
1. Follow the steps in the [README.md](./README.md) to complete the certification.
1. If you decide not to complete the project, or will need to step away from working on your project due to other time constraints, please inform the reviewer.

## Prerequisites
1. Core Java
1. Build Tool Configuration. (Maven or Gradle)
1. Spring

## Key Points to Understand:

### REST Basics
* What is stateless web architecture?
* What makes a ***good*** (generally accepted) REST application?
* What is HTTP?
* What is a URL?
* What makes up an HTTP request?
* What makes up an HTTP response?
* Name all HTTP verbs and conventions on when they are used.
* Why do you want to use the proper HTTP response code with your response?
* What are the traits of a well named REST endpoint?
* What is marshalling?
* What is serialization?
* What is deserialization?

### Project Directory Structure
* Why is a good project directory structure helpful in developing code?  Why is it helpful for those who will review your code?
* We recommend the following [Directory Structure](
https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)
* Why should you use tools such as "Spring Initializr"?

### Spring Basics
* What is Dependency Injection?
* What is a layered Architecture?
* What is a Spring Managed Component?
* How do you configure Spring Boot?
* What type of files do we put in the resources directory?
* What is a property file?
* How do you set the server port?
* What does management.security.enabled=false do?
* How do you set the log level?
* How do you setup a datasource?
* How do you include required libraries into your project?


### Spring Actuator
* How to tell if your Service is running and healthy?
* How do you tell what services you have?
* What are the benefits of monitoring your application?

### Spring @RESTController
* How do you setup a GET endpoint using @RequestMapping?
* How do you pass in arguments using @PathVariable?
* How do you setup a POST, PUT OR DELETE endpoint using @RequestMapping?
* How does Spring make serialization and deserialization with a POJO simple?
* What does @RequestBody and @ResponseBody do?
* Why should we use @JsonProperty?
* Why should we use @JsonIgnore?
* How do we set HTTP Status Code?
* How should we handle errors?


## Free Resources

[Roy Fieldings Dissertation](https://www.ics.uci.edu/~fielding/pubs/dissertation/top.htm) - Origination of "REST".

[Richardson Maturity Model](https://restfulapi.net/richardson-maturity-model/) - Defines "maturity" of a REST model/architecture.

[REST Api Tutorial](https://restfulapi.net/) - Good starting point.

[Baeldung](https://www.baeldung.com/) - Great for top the point and summary explanations.

[Code Geek](http://codegeek.net) - Great for explanations.

[Mkyong](http://mkyong.com) - Great for to the point examples.

[Protect REST APIs with Spring Security and JWT](https://medium.com/@hantsy/protect-rest-apis-with-spring-security-and-jwt-5fbc90305cc5) - Tutorial on securing a REST API with JWTs.

[stackoverflow](https://stackoverflow.com/) - To the point answers - Post Questions

## Spring Documentation
[Spring.io](http://spring.io)

[Core Spring Framework](https://spring.io/projects/spring-framework) - [Reference Docs](https://docs.spring.io/spring/docs/5.1.4.RELEASE/spring-framework-reference/)

[Spring Boot](https://spring.io/projects/spring-boot) - [Referrence Docs](https://docs.spring.io/spring-boot/docs/2.1.1.RELEASE/reference/htmlsingle/)

[Spring MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html)



## Paid Resources

***Note:*** Some paid resources may be reimbursable. See the [STG Training Policy](https://docs.google.com/document/d/1rKuMBH8plra7Uv_MSsL_5BQrn4-EBlM78vpnk0ATp2I/edit).

[REST Fundamentals (Pluralsight - Howard Dierking)](https://app.pluralsight.com/library/courses/rest-fundamentals) - Good for theory and concepts i.e. naming resources.

[Starting with REST API's (Udemy - Stone River eLearning )](https://www.udemy.com/starting-with-rest-apis/)

[Spring REST: Getting Started (Pluralsight - Peter Van Rijn)](https://app.pluralsight.com/library/courses/spring-rest)

[Create REST APIs using Spring Data REST (Udemy - Bharath Thippireddy)](https://www.udemy.com/microservices-rest-apis-using-spring-data-rest/)

[Creating Your First Spring Boot Application](https://app.pluralsight.com/library/courses/spring-boot-first-application/table-of-contents) - Good starting place for those new to Spring or Rest - Concise answers - working project fast

[Udemy](http://udemy.com)
