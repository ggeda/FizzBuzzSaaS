# FizzBuzzSaaS
Fizzbuzz Solution as a web service

Requirement:
> For multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 
> For numbers which are multiples of both three and five print “FizzBuzz”.

> Non integer path parameters should result in an error.

> Please demonstrate use of Java 8

> Please demonstrate use of one or more design patterns and add comments as to why you choose that pattern.

> This service should consume an upper boundry as a path parameter, and determine which numbers would print "Fizz", "Buzz", and "FizzBuzz". 
  It should then be able to respond to the caller with these numbers, grouped by Fizz, Buzz, and FizzBuzz.
  
> Code should be delivered as a standalone deliverable with instructions on how to run.

> Provide your finished results in a git repository

> # I realized that the requirement is a bit contradictory on what to return.
    
    >In the section 'What is Fizz Buzz' ,it discuss that, instead of the number to return Fizz or Buzz or FizzBuzz.
    
    >But, in the example and the instruction section , it explicitly stated, a response like this : {"Fizz": [3, 6, 9, 12],"Buzz": [5, 10],"FizzBuzz": [15]}
    
    >Since the example is explicit, my solution response looks like the example : {"Fizz": [3, 6, 9, 12],"Buzz": [5, 10],"FizzBuzz": [15]}

# Steps to build and run the web app:

There are two ways to run the application:

1. Directly by running the included jar distribution in the distribution directory.
    java -jar distribution/fizzbuzzsaas-1-kz.jar

Or ... build and run

1. mvm clean install
2. java -jar target/fizzbuzzsaas-1-kz.jar
( this by default starts the application on port 8080)
If there is a need to use port other than 8080, use this command, for example for port 9090:
java -jar -Dserver.port=9090 target/fizzbuzzsaas-1-kz.jar

# Test by a GET call :

# GET:  

http://localhost:8080/fizzbuzz/15

# RESULT: 

{
    "FizzBuzz": [
        15
    ],
    "Fizz": [
        3,
        6,
        9,
        12
    ],
    "Buzz": [
        5,
        10
    ]
}