## Synopsis

Simple preprocessor for CSV. Support only strong rfc4180 specification.

## Code Example

    ```java
    //Read
    ParsCsv pc = new ParsCsv("path/1", AUTOSAVE);
    
    //Read from internet
    ParsCsv pc = new ParsCsv("test.com/1");
    
    //To array
    pc.toAr(Ar);
    
    //To Collection
    pc.toCo(Ar);
    
    //Concatenation csv
    pc3 = pc + pc2;
    
    
    //Get value by associative
    while(pc.end()) {
        a = pc["name"];
        b = pc["price"];
    }
    
    //Get value by index
    while(pc.end()) {
        a = pc[1];
        b = pc[2];
    }
    
    //Update value
    while(pc.end()) {
        pc["name"] = 3;
        pc["price"] = 4;
    }
    
    //Add value
    pc.Add(Colection);
    pc.Add(array);
    pc.Add("London", 71);
    ```
    
## Motivation

Java programmers do not have to suffer parse or creating a CSV file.
The rest of the library should be a long time to learn.
Review other library(https://en.wikipedia.org/wiki/CSV_application_support).

## Installation

Coming soon...

## API Reference

Coming soon...

## Tests

Coming soon...

## Contributors

Coming soon...

## License

OpenSource




