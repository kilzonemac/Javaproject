package database;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectionMySQL {
public static void main(String [] args ){

try{
	Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/testt","root","");
	//System.out.println("Connection success");
	String query = "Select * From Filmy";
	Statement stmt = (Statement) conn.createStatement();
	ResultSet rs = stmt.executeQuery(query);
	while(rs.next())
	{
		System.out.println("Name: "+rs.getString("Nazwa"));
		System.out.println("Typ: "+rs.getString("Typ"));
		System.out.println("Opis: "+rs.getString("Opis"));
		System.out.println("Premiera: "+rs.getString("Premiera"));
		System.out.println("Recenzje: "+rs.getString("Recenzje"));
		System.out.println("D�ugo��: "+rs.getString("D�ugo��"));
		System.out.println("Ocena: "+rs.getString("Ocena"));
	}
}

catch(Exception e)
{
	System.err.println(e);
}
}
}
