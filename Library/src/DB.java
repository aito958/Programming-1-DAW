import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//TODO cambiar datos de acceso a la BD: dirección, nombre BD, user/pass
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librero","librero","1234");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
