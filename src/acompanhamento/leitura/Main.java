package acompanhamento.leitura;

public class Main {
	
	public static void main(String[] args) {
		Livro livro1 = new Livro("Harry Potter", 352);
		Leitor leitor1 = new Leitor("Gustavo", livro1);
		
		Livro livro2 = new Livro("Percy Jackson: O ladrão de raios", 286);
		Leitor leitor2 = new Leitor("Gabriella", livro2);
		
		Livro livro3 = new Livro("O senhor dos aneis", 657);
		Leitor leitor3 = new Leitor("Fred", livro3);
		
		
		
		leitor1.adicionarLivro(livro2);
		leitor2.adicionarLivro(livro1);
		leitor3.adicionarLivro(livro1);
		
		System.out.println("Leitor 1: " + leitor1.getEstanteLivros().toString());
		System.out.println("Leitor 2: " + leitor2.getEstanteLivros().toString());
		System.out.println("Leitor 3: " + leitor3.getEstanteLivros().toString());
		
		leitor3.adicionarLivro(livro2);
		
		System.out.println("Leitor 3 após adicionar livro: " + leitor3.getEstanteLivros().toString());
		
		leitor3.removerLivro(livro2);
		
		System.out.println("Leitor 3 após remover livro: "  + leitor3.getEstanteLivros().toString());
		
		leitor2.getLivroFavorito().adicionarPaginasLidas(75);
		System.out.println("Porcentagem lida: " + leitor2.getLivroFavorito().verificarProgresso());
		
		leitor1.removerLivro(livro2);
		System.out.println("Livro após remoção: " + leitor1.getEstanteLivros().toString());
	}

}
