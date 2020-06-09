In order to generate the Jooq classes:
Run java -cp jooq-3.13.2.jar;jooq-meta-3.13.2.jar;jooq-codegen-3.13.2.jar;reactive-streams-1.0.2.jar;mysql-connector-java-8.0.20.jar org.jooq.codegen.GenerationTool gen.xml
```
Edit  the gen.xml line 
   <generator>
        <database>
            <name>org.jooq.util.mysql.MySQLDatabase</name> change to <name>org.jooq.meta.mysql.MySQLDatabase</name>
            <includes>stripe_.*</includes>
            <inputSchema>killbill</inputSchema>
        </database> 
```
