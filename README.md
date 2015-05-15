# SawatiKhap
Sabay di mai, khap!

SawatiKhap is a Domain Specific Language that enables you to easily express a window layout template for 
applications to be run and placed on various screen locations. 

We translated our language into bash commands utilizing wmctrl. It may seem simple enough to 
just write the bash scripts yourselves, but we think it is worth using our language to make 
it easy and enjoyable to write layouts for multiple different activities. For example, you may 
want to have a layout for when you are coding, when you are browsing the web, or when you are 
using libre office. This tool makes it quick and easy to get back to your ideal window layout
regardless of what task is at hand.

### How to run
Once compiled, you can run our tool in two easy step:

    1. java runThisThing <filewithourlangauge>
    2. Watch the magic!

### Use Cases
We should add some examples of our language so people can figure out how to use it.

#### Valid args format
The format of the args for an application is a comma separated list (Including an ending comma).


Example: 

    chromium-browser
    {
        args = "--incognito, --no-proxy-server"
        snap = "fullscreen"
    }
#### Valid snap commands
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
    4. java runThisThing <filename> 

#### When you want to push stuff:
    1. ./cleanup.sh (optional)
    2. git add <any files required to be added>
    3. git commit -a
    4. git push origin master

### TODO:

    1. Make default filename if one isn't passed in
    2. Make sleep time configurable in the settings block globally, and in the application block specifically
    3. Make the geometry more accurate if possible
    4. Create a CLI interface with Sawat:
        * --save to store the file within Sawat's system so you could recall the template later from anywhere
        * --load to specify it is a template the Sawat has to find and load itself
