# Introduction to REST; implementing an RPC integration pattern

intellij -> new project -> maven archetype -> select "jersey-quickstart-webapp" from archetype (if not found, create it using the add button, and use org.glassfish.jersey.archetypes and jersey-quickstart-webapp, version 2.34)

we will use tomcat to host our server; install tomcat with "brew install tomcat" -> add the following dependency to your pom file
```
<dependency>
            <groupId>org.apache.tomcat</groupId>
            <artifactId>tomcat</artifactId>
            <version>11.0.0-M24</version>
            <type>pom</type>
            <scope>provided</scope>
</dependency>
```
download tomcat and place in your project directory; https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.28/bin/apache-tomcat-10.1.28.zip
if tomcat permission denied; traverse to the bin dir on your local tomcat download and run 
```
chmod +x *.sh
```

https://www.jetbrains.com/help/idea/creating-and-running-your-first-restful-web-service.html#run_config