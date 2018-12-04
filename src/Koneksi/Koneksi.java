package Koneksi;
import java.sql.DriverManager;
import java.sql.Connection;
public class Koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("You've been connected to the database");
        }catch(ClassNotFoundException ex){
            System.out.println("Tidak semudah itu Ferguso"+ex);
        }
        String url = "jdbc:mysql://localhost/Daftar";
        try{
            koneksi = (Connection)DriverManager.getConnection(url,"root","");
        }catch(Exception ex){
            System.out.println("Maafkan aku Ferguso, kau gagal konek ke db njing "+ex);
        }
        return koneksi;
    }
}