# iLABWebsite
This is repository for assessment global kinetic assessment that uses iLAB Website that posts open vacancies

HOW TO RUN THE FRAMEWORK

	- RUN USING JENKINS
	
		Please Note: This doesn't open the UI, but you can only check the logs if the execution is successful or not
		
		1. From Jenkins do the following:
		
			- Create a new Item/Project by clicking on New item
			- Enter the item name
			- Select "Freestyle project"
			- Click OK button at the bottom
			- On the next window go to Source Code Management and select Git
			- Paste this url repository (https://github.com/MBEMPX/iLABWebsite.git)
			- Under Build menu, type pom.xml on the Root POM
			- On Goals and options text field, type mvn clean install.
			
		2. Click Apply and Save button at the bottom
		
		3. Click Build now from your left hand menu
		
	- RUN USING THE COMMAND PROMPT FROM YOUR LOCAL MACHINE
		
		1. Download the project to your local machine using the following steps
			- Open your browser and past this URL: https://github.com/MBEMPX/iLABWebsite.git
			- Click on Clone or download button from git hub
			- Download as Zip folder
			- Extract it from your local machine
		
		2. Execute tests from command line
			- locate run file from this directory(\\iLABWebsite)
			- Double click run file 
			- The test execution should begin
		
	
		
		




