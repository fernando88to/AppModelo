# AppModelo

Project in grails 5.1.1 

Clean directory of the build, execute static analysis of the code, execute tests and generate final build.  
```
./gradlew clean check test assemble
```

### SDK versions

* grails 5.1.1
* jdk 11.0.11

### Static Analysis for groovy (Codenarc)

Project analysis with the following rules specified in the 'gradle/codenarca' file 
```
$ ./gradlew codenarcMain codenarcTest 
```


### Test automation

In  jenkins job, the test are executed with the following parameters:
```
./grailsw test-app  -Dgeb.env=remote
```

Local execution:
```
./grailsw test-app
```

### Code coverage

In jenkins job, the code coverage is generated with the following parameters:
```
./gradlew cloverGenerateReport -Dgeb.env=remote
``` 
Local execution:
```
./gradlew cloverGenerateReport
```
