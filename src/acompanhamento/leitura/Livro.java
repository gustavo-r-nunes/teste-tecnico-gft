package acompanhamento.leitura;

public class Livro {
	
	private String titulo;
	
	private int qtdPaginas;
	
	private int paginasLidas = 0;

	public Livro(String titulo, int qtdPaginas) {
		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	
	public double verificarProgresso() {
		int porcentagem = (this.getPaginasLidas() * 100) / this.getQtdPaginas();
		return Math.round(porcentagem);
	}
	
	public int adicionarPaginasLidas(int paginasLidas) {
	    this.setPaginasLidas(paginasLidas);
		return this.paginasLidas;
	}
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", qtdPaginas=" + qtdPaginas + ", paginasLidas=" + paginasLidas + "]";
	}
	

}
