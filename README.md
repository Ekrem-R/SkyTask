"# SkyTask" 
SKY – SPORTS HOUSE – TECH TEST
We have 2 API endpoints located here: 
https://5f99522350d84900163b8737.mockapi.io/tech-test/articles - returns a list of articles 
https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2 - returns a single article 
Both endpoints return data in JSON format and only support HTTP GET methods. Attempting a POST, PUT or DELETE request on these endpoints will return a HTTP 404. 
Tasks: 
Using a framework of your choice, write a suite of automated tests to test these endpoints. 
Please note, the coding language must either be Python, Java, or JavaScript. 
Include a ReadMe within the project with instructions on how to run the tests. 
Upload your project to GitHub and share the link.

SOLUTION:

1- All test has done as a manuel test with Postman and has been taken screenshots and keep them in ScreenShots folder
2- Creates a framework in Intellij Idea with TestNG using java language.

Installation guide: This is a maven project. so It's assumed that the host running this code have Java and maven installed and already set. Here is the guide for maven installation just in case : https://maven.apache.org/install.html Project get all dependencies from maven repository. So no additional installation needed. *Below are the dependencies are being used for this project Junit, TestNG,Rest-assured, Json, Jackson-databind . 

Create all methods (Get, Put, Post, Delete ) and execute them with TestNG annotations ( Before , Test )
