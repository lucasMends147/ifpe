package L7;

public class Livro {
	private String autor;
	private String editora;
	private int isbn;
	private String titulo;
	private double anoEdicao;
	
	public Livro(String autor,String editora,int isbn,String titulo,double anoEdicao){
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
		this.titulo = titulo;
		this.anoEdicao = anoEdicao;
	}
	public String getAutor(){
		return this.autor;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getEditora(){
		return this.editora;
	}
	public void setEditora(String editora){
		this.editora = editora;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getAnoEdicao() {
		return anoEdicao;
	}
	public void setAnoEdicao(double anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	
	public String buscaTitulo(String nome){
		if(nome.equals(this.titulo)){
			return this.titulo;
		}
		return "Não encontrado!";
	}
	
	
}