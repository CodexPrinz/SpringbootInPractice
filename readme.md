# Book
Spring Boot in Practice
SOMNATH MUSIB
Foreword by JOSH LONG


## Executing code on Spring Boot application startup
The **CommandLineRunner** and **ApplicationRunner** are two Spring Boot interfaces
that provide a single run(..) method and are invoked just before a Spring Boot application
finishes its initialization.

You can have multiple classes with CommandLineRunner, and annotate them as components


### Order
@Order -> determines which CommandLineRunner will be executed first