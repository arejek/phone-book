# phone-book 

A simple phone book REST API using Spring Boot.

## Used technologies and tools

- Spring Boot
- Spring Web, Spring Data JPA, PostgreSQL Driver, Lombok
- Maven
- IntelliJ
- tested with Postman

## REST Methods

### GET

| Url                                                                                         | Description                    |
|---------------------------------------------------------------------------------------------|--------------------------------|
| http://localhost:8080/api                                                                   | See all contacts               |
| [http://localhost:8080/api/**id/{contactId}**](http://localhost:8080/api/id/{contactId})    | See a contact of given id      |
| [http://localhost:8080/api/**surname/{surname}**](http://localhost:8080/api/id/{contactId}) | See a contact by given surname |


### POST

Add a contact by supplying JSON with new contact

| Url                                         | Content-Type     | JSON                                                                                                               |
|---------------------------------------------|------------------|--------------------------------------------------------------------------------------------------------------------|
| http://localhost:8080/api                   | application/json | {<br/>"name": "<new_contact_name>",<br/> "surname": "<new_contact_surname>",<br/>"number": "<phone_number>"<br/> } |



### PUT

Update contact (or create new if it doesn't exist)

| Url                                         | Content-Type     | JSON                                                                                                       |
|---------------------------------------------|------------------|------------------------------------------------------------------------------------------------------------|
| http://localhost:8080/api                   | application/json | {<br/>"name": "<contact_name>",<br/> "surname": "<contact_surname>",<br/>"number": "<phone_number>"<br/> } |



### DELETE

| Url                                                                                      | Description                    |
|------------------------------------------------------------------------------------------|--------------------------------|
| [http://localhost:8080/api/**id/{contactId}**](http://localhost:8080/api/id/{contactId}) | Delete contact of given id           |

