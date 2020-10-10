package model;

	public class Livro {
		int id;
		 String titulo;
		 String genero;
		 String autor;
		 String sinopse;
		 String datapublicacao;
		 int numerototalcapitulos;
	
	
		 public Livro(int id, String titulo, String genero, String autor, String sinopse, String datapublicacao,
				int numerototalcapitulos) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.genero = genero;
			this.autor = autor;
			this.sinopse = sinopse;
			this.datapublicacao = datapublicacao;
			this.numerototalcapitulos = numerototalcapitulos;
		}
	 
	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getDatapublicacao() {
		return datapublicacao;
	}
	public void setDatapublicacao(String datapublicacao) {
		this.datapublicacao = datapublicacao;
	}
	public int getNumerototalcapitulos() {
		return numerototalcapitulos;
	}
	public void setNumerototalcapitulos(int numerototalcapitulos) {
		this.numerototalcapitulos = numerototalcapitulos;
	}


	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", autor=" + autor + ", sinopse=" + sinopse
				+ ", datapublicacao=" + datapublicacao + ", numerototalcapitulos=" + numerototalcapitulos + "]";
	}
	 
	 
	 
}
