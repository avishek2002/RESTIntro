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

^^^^
||||
above is old

download tomcat; https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.28/bin/apache-tomcat-10.1.28.zip

https://www.jetbrains.com/help/idea/creating-and-running-your-first-restful-web-service.html#run_config

intlelij -> new project -> jakarta ee -> type in the name for the project, etc but leave application server section -> select Jakarta EE 10 and make sure checkboxes for servlet, eclipse jersey server and weld SE are checked -> once the boilerplate code is created, go to settings (cmd + ,) -> under build, execution, deployment select aplication servers -> add tomcat server install location -> open run/debug configurations and add tomcat local server (it should already be configured from the previous step), then under deployment tab, add artifact (<project_name>:war exploded) and change the Application context if necessary -> if tomcat permission denied; traverse to the bin dir on your local tomcat download and run 
```
chmod +x *.sh
```

//finised setting up the environment; start with the lab work now