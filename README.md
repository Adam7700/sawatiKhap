# sawatiKhap
sabay di mai. khap!

### How to run
1. java runThisThing < grammarExample
2. ./sawat.sh


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
you have to be using a x window manager
wmctrl
bash


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
1. use template name for the bash script file name
2. make a more sophisticated args grammar
3.