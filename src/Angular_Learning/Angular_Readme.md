# ANGULAR LEARNING
* ANGULAR ROADMAP : https://roadmap.sh/angular?utm_source=chatgpt.com



## LEARNING
* https://www.youtube.com/watch?v=6n0vYBcM9Lg&list=PLsjpRo2EZP1LTrYY6_FMpx6cqmjuPdoo2
    * Learning this one only.

* https://www.youtube.com/watch?v=XVCAaV-hSe4&list=PL8p2I9GklV45--5t7_N4lveUI6Y31vQ6C


## CONCEPTS WRITING AND OTHER INFO FROM LEARNING BELOW YOUTUBE PLAYLIST
* LEARNING
* https://www.youtube.com/watch?v=6n0vYBcM9Lg&list=PLsjpRo2EZP1LTrYY6_FMpx6cqmjuPdoo2
    * Learning this one only.
### LECTURE VIDEO 1,2  
#### INSTALL NODE
* ANGULAR AND NODE VERSION COMPATIBILITY. SO GET THAT NODE VERSION ACCORDINGLY.
* https://angular.dev/reference/versions
* download node from here : https://nodejs.org/en/download
    * Here install only LTS version.
    * PS C:\Users\HP> node -v
    *     v24.19.0
    *    PS C:\Users\HP>
* Check in this way once installed.
    * PS C:\Users\HP> npm -v
    * 11.17.0
    * PS C:\Users\HP>
* It also install npm in node.
#### INSTALL ANGULAR CLI
* COMMAND TO INSTALL ANGULAR CLI IN YOUR PROJECT FOLDER. CREATE A FOLDER WHERE YOU WANT TO INSTALL
* Open folder in visual studio, in terminal
* Use this below command : npm install -g @angular/cli@latest
    * Here -g represents it will install globally
    * @latest means it will download latest version of angular.
    * wait for sometime, it will take some time to install.
* reopen visual studio if npm or node is not found in your visual studio terminal.
* Once installed, check by command: ng version
    * Angular CLI       : 22.1.4
    * Node.js           : 24.19.0
    * Package Manager   : npm 12.0.2
    * Operating System  : win32 x64
#### CREATE ANGULAR APP
* Command to create angular project app : ng new your_angular_project_name
    * use CSS for now, SSR also no for now.
    * use none in agent ai selection for now.
    * After this commandit will start creating project for you.
#### START THE PROJECT
* Use command: ng serve
* You will get link for localhost, open it in browser : http://localhost:4200/
