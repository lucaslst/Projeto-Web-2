package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import model.Livro;
import util.DbUtil;
 
public class LivroDAO {
	
    private static Connection connection = DbUtil.getConnection();
 
    public static Livro addLivro(String titulo, String genero, String autor, String sinopse, String datapublicacao, int numerototalcapitulos) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("insert into livro(titulo, genero, autor, sinopse, datapublicacao, numerototalcapitulos) values (?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            pStmt.setString(1, titulo);
            pStmt.setString(2, genero);
            pStmt.setString(3, autor);
            pStmt.setString(4, datapublicacao);
            pStmt.setInt(5, numerototalcapitulos);
            
            pStmt.executeUpdate();
            ResultSet rs = pStmt.getGeneratedKeys();
            if (rs.next()) {
                return new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("genero"), rs.getString("autor"), rs.getString("sinopse"), rs.getString("datapublicacao"), rs.getInt("numerototalcapitulos"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static Livro updateLivro(int id, String titulo, String genero, String autor, String sinopse, String datapublicacao, int numerototalcapitulos) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("update livro set titulo=?, genero=?, autor=?, sinopse=?, datapublicacao=?, numerototalcapitulos=?  where id=?",
                    Statement.RETURN_GENERATED_KEYS);
            pStmt.setString(1, titulo);
            pStmt.setString(2, genero);
            pStmt.setString(3, autor);
            pStmt.setString(4, datapublicacao);
            pStmt.setInt(5, numerototalcapitulos);
            pStmt.executeUpdate();
            ResultSet rs = pStmt.getGeneratedKeys();
            if (rs.next()) {
            	 return new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("genero"), rs.getString("autor"), rs.getString("sinopse"), rs.getString("datapublicacao"), rs.getInt("numerototalcapitulos"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static void deleteLivro(int id) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("delete from livro where id=?");
            pStmt.setInt(1, id);
            pStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    public static List<Livro> getAllLivro() {
        List<Livro> livros = new ArrayList<Livro>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from livro order by id");
            while (rs.next()) {
                Livro livro = new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("genero"), rs.getString("autor"), rs.getString("sinopse"), rs.getString("datapublicacao"), rs.getInt("numerototalcapitulos"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return livros;
    }
 
    public static Livro getLivro(int id) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("select * from livro where id=?");
            pStmt.setInt(1, id);
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
            	return new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("genero"), rs.getString("autor"), rs.getString("sinopse"), rs.getString("datapublicacao"), rs.getInt("numerototalcapitulos"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static Livro getLivroByTitulo(String titulo) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("select * from livro where titulo=?");
            pStmt.setString(1, titulo);
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                return new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("genero"), rs.getString("autor"), rs.getString("sinopse"), rs.getString("datapublicacao"), rs.getInt("numerototalcapitulos"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
	
}