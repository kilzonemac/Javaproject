package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Login_PasswordSQL {
	public void theQuery(String query){

	}
public static void main(String [] args ){

try{

	Class.forName("com.mysql.jdbc.Driver");
	//System.out.println("Connection success");
	String url="jdbc:mysql://serwer1596524.home.pl:3306/17130806_0000005";
	String username="17130806_0000005";
	String password="qwertyu12";
	String query = "Select * From LoginPassword";
	Connection conn = (Connection) DriverManager.getConnection(url,username,password);
	Statement zapytanie = (Statement) conn.createStatement();
    ResultSet wynik = zapytanie.executeQuery(query);
    while (wynik.next()) {
        System.out.println("login: "+wynik.getString("Login"));
        System.out.println("pass: "+wynik.getString("Password"));
    }
    conn.close();
}
catch (SQLException e){
	 System.out.println("Co� posz�o nie tak");
}
catch (ClassNotFoundException e){
	System.out.println("Problem ze sterownikiem.");
}}

}