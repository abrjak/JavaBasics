# JavaBasics

This Git Project is aimed at young programmers that want to look into the World of Java.
No previous experience with programming is required to understand this Project.
Be advised that the knowledge being presented was gained at the Regional IT School and contains what might be asked in their Exams about this topic.

## How to use this Project

The Classes and Files in this project were made for young programmers to read and learn but also try out the knowledge they gained. Especially Classes with "Exercise"-Suffix are made to complete the given task by oneself and to test other functionalities.

## Contents
### Installing Java

Go to http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html (if the link is not working, simply google for 'Java jdk8 download' and click the link to the Oracle-Site.
Check the Radio Button 'Accept License Agreement' and Download the Java Version compatible with your OS.
In the Installation-Interface you can keep all Standard Settings and Install Java at the Default Location.
To check the Installation, open a Console (Win+CMD) and type 'java -version'

Example:
java version "1.8.0_111"
Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.111-b14, mixed mode)

Also, check if your JAVA_HOME-Environment-Variable is set.
In the Console, type 'echo %JAVA_HOME%' and you should see the path to your jdk8-Folder as response.

Example:
C:\Program Files\Java\jdk1.8.0_111

If this Path is not correct or returns an error, do these Steps (Win7):
1. In the File Explorer, move to your JDK-Folder (usually C:\Program Files\Java\... depending on your OS) > Copy the Path
2. Windows > Right-Click on 'Computer' > Properties > Advanced System Settings > Environment Variables
3. In the 2nd List, search for the entry 'JAVA_HOME' or create a new one with this name if you can't find it.
4. Paste the copied Path from Step 1. and save the Element


### Installing an IDE - Eclipse

Go to http://www.eclipse.org/downloads/eclipse-packages/ and Download the Eclipse Installer for your OS-Version
OR directly Download the 'Eclipse IDE for Java EE Developers'-Program.
You can install it with the standard Settings at the Standard Place - unless you have your own way of managing installed Programs.

### Pulling this Project

1. Go to https://git-scm.com/downloads and download Git for your OS.
2. Install it with Standard-Settings (Git-GUI is not really necessary, but it's a nice tool. In this Tutorial, only the Git Bash - Console is used and it's commands explained though)
3. Create a folder named 'workspace_javabasics' at a Location of your Choice (e.g. C:\dev\projects\workspace_javabascis)
4. Open Eclipse and search for this folder to use as a Workspace.
[_Hint: Copy-Paste the Eclipse-Shortcut from your Desktop > Rename it to 'JavaBasics' > Right-Click > Properties > Add '-data [your workspace-path]' behind what's written in the Goal-Field > Now you have an Eclipse-Shortcut that always opens this Workspace_]
5. In Eclipse, click the Window-Icon with the Plus in the top right corner, choose Git and Open this Perspective.
6. In the Git-Perspective, Click 'Clone a Git repository' and enter the URL to this Git there. I'd also advise you to fill out the User- and Password-Fields with your GIt-Credentials as well.


### tbd