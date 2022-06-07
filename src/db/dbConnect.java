package db;

import java.sql.*;
import java.sql.DriverManager;


public class dbConnect {

	private static String host = "localhost";
	private static String user = "root"; 
	private static String pass = "root";
	private static String jdbcUrl = "jdbc:postgresql://";
	private static String port = "5432";
	//private static String driverjdbc = "org.postgresql.Driver";
	private static String dbName = "pmDB";
	private static String connectionString = (jdbcUrl + host + port + "/" + dbName);
	private static Connection conn;
	//private static Statement stat;
	
	
	public static Connection DatabaseConnect(){
        try {
            conn = DriverManager.getConnection(connectionString, user, pass);
            System.out.println("conexão efetuada com sucesso");
        }
        catch (SQLException e){
            throw new RuntimeException("Ocorreu um erro ao conectar ao DB", e);
        }
        return conn;
    }
	
	
	public static void DatabaseDisconnect(){
        try {
            if (conn != null) {
                conn.close();
                System.out.println("DB fechado");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Problema ao encerrar DB ", e);
        }
    }
}
