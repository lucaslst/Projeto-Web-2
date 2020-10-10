package model;

public class Usuario {
	
	int id;
	String usuario;
	String email;
	String datanascimento;
    String senha;
    
    public Usuario(int id, String usuario, String email, String datanascimento, String senha) {
        super();
        this.id = id;
        this.usuario = usuario;
    	this.email = email;
    	this.datanascimento = datanascimento;
        this.senha = senha;
    }
    
    
    
    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDatanascimento() {
		return datanascimento;
	}



	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	@Override
    public String toString() {
        return "Usuario [id=" + id + "usuario=" + usuario + "email=" + email + ", senha=" + senha + ", datanascimento=" + datanascimento + "]";
    }
	
	
}
