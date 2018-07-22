# Readme
* Test have possibility to launch on Windows and Linux environments, it depends on parameter isWindows in src/test/resources/testing.properties. 
But for now I have issues with different gradle versions for Windows and Linux, so tests now works only on Windows environment.
* Test could be launched from IDE and CLI. There should be installed Java and Gradle v4.9. Launch from CLI: navigate to the root of project and execute "gradle cucumber".
Launch from IDE: need to install additional plugins - Gherkin, Cucumber, Gradle and setup Run/Debug configuration.
* Test feateres stored in src/test/resources/cucumber
