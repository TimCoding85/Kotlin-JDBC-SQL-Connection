import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.sql.Connection
import java.sql.DriverManager

class SqlConnection {
    var connection: Connection? = null
    var j: String = ""
    var e: String = ""
  suspend fun connectionToServer() = withContext(Dispatchers.IO) {
    try {
        Class.forName("net.sourceforge.jtds.jdbc.Driver") // Load driver

        val url = "jdbc:jtds:sqlserver://SERVER-IP:PORT;databaseName=DB;encrypt=false;trustServerCertificate=true"   // Replace SERVER-IP, PORT and DB
        val username = "user"  // Examples
        val password = "password" // Examples

        connection = DriverManager.getConnection(url, username, password)

        j = "Connection successful "
    } catch (exception: Exception) {
        e = exception.toString()
    }
}

    override fun toString(): String {
        return "%s\n%s".format(j, e)
    }

}
