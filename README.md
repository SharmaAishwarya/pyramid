# pyramid
This project is about checking whether a given word is a pyramid word or not.

Problem statement: Accept a string as input and return a response indicating whether a word is a pyramid word. 
A word is a ‘pyramid’ word if you can arrange the letters in increasing frequency, 
starting with 1 and continuing without gaps and without duplicates.

Examples:

banana is a pyramid word because you have 1 'b', 2 'n's, and 3 'a's.

bandana is not a pyramid word because you have 1 'b' and 1 'd'.


How to use:

1. clone it to your system and make sure that you have set up for Spring Boot including maven and java installed.
  i.  mvn clean
  ii. mvn install

2. Run the application in your IDE.

3. Hit the URL:
  https://pyramid-word-01.herokuapp.com/pyramid as a POST request with string as a body.
  
  Example:
 ![Imgur](https://i.imgur.com/HjZBVvA.png)
