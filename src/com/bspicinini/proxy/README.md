## Build steps

### Compile files
    javac com/bspicinini/proxy*.java

### Create jar based on MANIFEST.mf
    jar cvmf com/bspicinini/proxy/META-INF/MANIFEST.mf myProxy.jar com/bspicinini/proxy/*.class


## Run steps

### Registry rmi
    rmiregistry -J-Djava.class.path=./com/bspicinini/proxy/
### Run Server 
    java -jar myProxy.jar
### Run Client
    java -cp . com/bspicinini/proxy/MyRemoteClient
