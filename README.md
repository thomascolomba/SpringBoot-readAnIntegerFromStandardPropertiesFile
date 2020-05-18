How to read an Integer from the standard application.properties with Spring Boot.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readAnIntegerFromStandardPropertiesFile-0.0.1-SNAPSHOT.jar<br/>
<br/>
<br/>
---application.properties<br/>
myInteger=12345<br/>
---MyConfigurationBean.java<br/>
private String myInteger;<br/>
+getter and setter<br/>
---The class who displays the value of the 'myString' configuration<br/>
@Autowired<br/>
MyConfigurationBean myConf;<br/>
...<br/>
System.out.println(myConf.getMyInteger());<br/>
<br/>
<br/>
The application will read the value '12345' of the property myInteger in the standard application.properties configuration file then display it in the terminal.<br/>


