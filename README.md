# Spring-Boot-JPA-Demo
JPA example with h2 database

It uses h2 database for data store. Uses Spring boot JPA support. Demonstrates how to store, retrieve and update data from data layer with out writing any sql statements.

Before starting the project, add JPA and H2 dependencied for the project.

		<dependency>
    		<groupId>com.h2database</groupId>
    		<artifactId>h2</artifactId>
    		<version>2.1.214</version>
    		<scope>test</scope>
		</dependency>

  Modify Scope Test Element --> 
  <dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>    		
			<scope>runtime</scope>
	</dependency>

** for JPA**

 <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>2.7.5</version>
</dependency>

**Application Properties**
spring.h2.console.enabled=true
spring.h2.console.path=/h2
spring.datasource.url=jdbc:h2:mem:stations

@Entity -- Is a Java object the spring boot JPA can Manage.

**Process:-**

1. Setup Student @Entity
2. Each @Entity field maps to a table column.
3. The Primary key column uniquely identifies each record inside the table.

@id annotation for primary key.

Eg:-

@Entity
@Table(name="student")
public class Student{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
}
