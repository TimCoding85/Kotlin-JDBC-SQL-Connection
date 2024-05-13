<br> <h1> Kotlin Sql Connection </h1> </br>

This is a simple Kotlin class for establishing a connection to a Microsoft SQL Server database using the JTDS driver. The class utilizes Kotlin coroutines for asynchronous execution.

<h2> Prerequisites </h2>

Before using this class, ensure you have the following dependencies installed:

JTDS Driver (version 1.3.1)
<br>[Kotlin Coroutines](https://github.com/Kotlin/kotlinx.coroutines) </br>


<h2> Usage </h2>
<h3>Add the  dependencies to your project:</h3>

```kotlin
implementation ("net.sourceforge.jtds:jtds:1.3.1")
implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
```


<h3>Import the necessary packages:</h3>

```kotlin
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.sql.Connection
import java.sql.DriverManager
```

<h3>Instantiate the SqlConnection class and call the connectionToServer() function to establish a connection to the SQL Server:</h3>

```kotlin
val sqlConnection = SqlConnection()
sqlConnection.connectionToServer()
```

Ensure to replace "SERVER-IP", "PORT", "DB", "user", and "password" with your actual server IP, port, database name, username, and password respectively.

<h3>Use the connection property to interact with the database connection.</h3>

<h2>Example</h2>

```kotlin
val sqlConnection = SqlConnection()
sqlConnection.connectionToServer()

// Check connection status
println(sqlConnection)
```  	  	
