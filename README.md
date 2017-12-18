# FizzBuzzSaaS
Fizzbuzz Solution as a web service

Requirement:
For multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
For numbers which are multiples of both three and five print “FizzBuzz”.

Non integer path parameters should result in an error.
Please demonstrate use of Java 8
Please demonstrate use of one or more design patterns and add comments as to why you choose that pattern.
Code should be delivered as a standalone deliverable with instructions on how to run.
Provide your finished results in a git repository

# Steps to build and run the web app:

There are two ways to run the application:

1. Directly by running the included jar distrivution in the distribution directory.
    java -jar distribution/fizzbizzsaas-1-kz.jar

Or ... build and run

1. mvm clean install
2. java -jar target/fizzbizzsaas-1-kz.jar
( this by default starts the application on port 8080)
If there is a need to use port other than 8080, use this command, for example for port 9090:
java -jar -Dserver.port=9090 target/fizzbizzsaas-1-kz.jar

# Test :

GET:  http://localhost:8080/fizzbuzz/15

RESULT: {"Fizz":[3,6,9,12],"Bizz":[5,10],"FizzBizz":[15]}