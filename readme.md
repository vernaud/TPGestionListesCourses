#Readme
##context.xml

`<?xml version="1.0" encoding="UTF-8"?>
<Context>
    <Resource
            name="jdbc/bdd"
            driverClassName="com.microsoft.sqlserver.jdbc.SQLServerDriver"
            type="javax.sql.DataSource"
            url="jdbc:sqlserver://*"
            username="*"
            password="*"
            maxTotal="30"
            maxIdle="30"
            maxWaitMillis="10000"
    ></Resource>
</Context>`

##Lib
- jstl-1.2.jar
- mssql-jdbc-9.2.1.jre8.jar
- apache-tomcat-9.0.46.zip