# sawatiKhap
Sabay di mai, khap!

SawatiKhap is a Domain Specific Language that enables you to easily describe a template for 
applications to be run and placed on various screen locations. 

We translate our language into bash commands utilizing wmctrl. It may seem simple enough to 
just write the bash scripts yourselves, but we think it is worth using our language to make 
it almost enjoyable to write layouts for different activities. For example, you may want to 
have a layout for when you are coding, when you are browsing the web, or when you are using
libreoffic. This makes it quick and easy to get back to your ideal window layout.

### How to run
1. java runThisThing < \<filewithourlangauge\>

### Use Cases
We should add some examples of our language so people can figure out how to use it.

### valid Snap Args
* fullscreen
* top
* bottom
* left
* right
* topleft
* topright
* bottomleft
* bottomright

### Dependencies
1. Be using a x window manager
2. Have wmctrl installed
3. Bash

### Workflow:
1. git pull origin master
2. antlr4 ourGrammar.g4
3. javac *.java
4. java runThisThing

##### When you want to push stuff:
1. ./cleanup.sh (optional)
2. git add <any files required to be added>
3. git commit -a
4. git push origin master

### TODO
1. Make a more sophisticated grammar for the values of appoption and option 