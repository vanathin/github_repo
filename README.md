
//Procedure to Check out the code

STEP 1: Open Git shell terminal and select your project location using cd command
STEP 2: Check out the code from remote repository using following command
		    git clone https://github.com/vanathin/github_repo.git
STEP 3: Open Eclipse -> File -> Import -> select Existing maven project -> Click Next then select Root directory -> Finish 
STEP 4: Check maven dependency is present in Deployment Assembly. If doesn't present
		    Right click on your project -> properties -> click Deployment Assembly -> click ADD button -> select java build path entries -> click next -> 
        select Maven dependency -> click Finish 
STEP 5: Check installed Java version by using
	     Right click on your project -> properties -> click Java Compiler -> Select installed java version -> Apply and ok.
STEP 6: Right click on your project -> Run As -> Maven clean (clean the project)
STEP 7: Right click on your project -> Run As -> Maven install (create war file of project inside target folder)		
STEP 8: Right click on your project -> Run As -> Run on Server 


// Procedure for Checkin the code
STEP 1: Open Git Shell terminal- make sure your project location and type
        git init
        This command will initialize a local repository as Git repository
STEP 2: Next check if a file README.rdoc exists in our project location using 
        dir README.rdoc
        If a file doesn't exists,create by using
        touch README.rdoc
STEP 3: If we want to list down all the files from our working directory by using,
        git status
STEP 4: Add the files into our local repository by using,
        git add .
STEP 5: Commit the files from local repository into remote repository by using,
        commit -m "First commit"
        It will commit all of our files, adding the message "first commit"
STEP 6: Specify remote repository location by using,
          git remote add repo https://github.com/vanathin/github_repo.git
          This creates a connection, named "repo" pointing at the GitHub repository.
STEP 7: Commits our local repository(master branch) to Github using,
          git push repo master
 
 

//Instruction for GitHub SetUP

STEP 1: Download GitHub for windows 7 from https://windows.github.com/ and install.
STEP 2: Check if GitHub is installed
        In terminal type git --version
STEP 3: Create a free GitHub account and login.
STEP 4: Create a repository on GitHub.

        
//Project Description

Step 1: Eclipse File -> New -> Project -> Mavenproject -> 
        select maven archetype as maven-archetype-webapp -> give GroupId and ArtifactId -> click Finish
Step 2: Rigth click on project -> properties -> click Project Facets and select Dynamic Web Module as 2.5 version.
Step 3: Check Maven dependency is added to Deployment Assembly. If not, Rigth click on project -> properties -> 
        click Deployment Assembly -> click ADD button -> select java build path entries -> click next -> 
        select Maven dependency -> click Finish
Step 4: Add the following Dependencies in pom.xml file
        spring-core
        spring-context
        spring-web
        spring-webmvc
		    Two ways we can add dependencies:
		    1.Directly copy the dependencies from maven repository site
		    (OR)
	 	    2.Click pom.xml file. Then select dependencies option. Click Add button to select dependencies.
Step 5: Create a Controller class in src/main/java directory
Step 6: Add Dispatcher Servlet class in Deployment Descriptor file. Which will act as front end controller in spring MVC.
Step 7: Create bean configuration file with servletname-servlet.xml. Which contains the information to create bean.
        Here, to specify base package using <context:component-scan base-package=""/>
        InternalResourceViewResolver for view the jsp page.



