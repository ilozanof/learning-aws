# learning-aws

This is just a *POC* Project that implements a basic Web APP and a REST interface that is packaged and deployed in AWS.


The App now implements the following:
1. A welcome page: *http://localhost:8080/welcome*
2. A REST interface with simple methods to retrieve and save *Books*

    a. To get a list of ALl Books: 

    `curl http://localhost:8080/v1/books`:
    
    b. To add a new Book:

    `curl -X POST http://localhost:8080/v1/books -H 'Content-Type: application/json' -d '{"id":"01","title": "Alice in woderlan", "author": "Unknown"}'`

The App has 2 Profiles:

  1. **dev**: using an in-memory embedded DB
  2. **prod**: using a mySQL DB

