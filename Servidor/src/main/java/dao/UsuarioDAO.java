package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import model.Usuario;
import util.DbUtil;
 
public class UsuarioDAO {
	
    private static Connection connection = DbUtil.getConnection();
 
    public static Usuario addUsuario(String usuario, String email, String datanascimento, String senha) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("insert into usuario(usuario, email, datanascimento, senha) values (?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            pStmt.setString(1, usuario);
            pStmt.setString(2, email);
            pStmt.setString(3, datanascimento);
            pStmt.setString(4, senha);
            pStmt.executeUpdate();
            ResultSet rs = pStmt.getGeneratedKeys();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), rs.getString("usuario"), rs.getString("email"), rs.getString("datanascimento"), rs.getString("senha"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static Usuario updateUsuario(int id, String usuario, String email, String datanascimento, String senha) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("update usuario set usuario=?, email=?, datanascimento=?, senha=?  where id=?",
                    Statement.RETURN_GENERATED_KEYS);
            pStmt.setString(1, usuario);
            pStmt.setString(2, email);
            pStmt.setString(3, datanascimento);
            pStmt.setString(4, senha);
            pStmt.executeUpdate();
            ResultSet rs = pStmt.getGeneratedKeys();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), rs.getString("usuario"), rs.getString("email"), rs.getString("datanascimento"), rs.getString("senha"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static void deleteUsuario(int id) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("delete from usuario where id=?");
            pStmt.setInt(1, id);
            pStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    public static List<Usuario> getAllUsuario() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from usuario order by id");
            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getInt("id"), rs.getString("usuario"), rs.getString("email"), rs.getString("datanascimento"), rs.getString("senha"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return usuarios;
    }
 
    public static Usuario getUsuario(int id) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("select * from usuario where id=?");
            pStmt.setInt(1, id);
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), rs.getString("usuario"), rs.getString("email"), rs.getString("datanascimento"), rs.getString("senha"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
 
    public static Usuario getUsuarioByUsuario(String usuario) {
        try {
            PreparedStatement pStmt = connection.prepareStatement("select * from usuario where usuario=?");
            pStmt.setString(1, usuario);
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), rs.getString("usuario"), rs.getString("email"), rs.getString("datanascimento"), rs.getString("senha"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return null;
    }
	
}