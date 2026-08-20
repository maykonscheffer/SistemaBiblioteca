public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(1, "Java para Iniciantes");
        Livro livro2 = new Livro(2, "Banco de Dados");
        Livro livro3 = new Livro(3, "Programação Orientada a Objetos");

        Revista revista1 = new Revista(4, "Revista de Tecnologia");
        DVD dvd = new DVD(6, "Curso de Java em DVD");

        Aluno aluno = new Aluno("João");
        Professor professor = new Professor("Carlos");

        biblioteca.cadastrarItem(livro1);
        biblioteca.cadastrarItem(livro2);
        biblioteca.cadastrarItem(livro3);
        biblioteca.cadastrarItem(revista1);
        biblioteca.cadastrarItem(dvd);

        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        biblioteca.emprestar(dvd, professor);

        biblioteca.listarAcervo();

        System.out.println("\n--- TESTE DE EMPRÉSTIMO ---");

        biblioteca.emprestar(livro1, aluno);

        System.out.println(
                "Empréstimos do aluno: "
                        + aluno.getQuantidadeEmprestada()
        );

        biblioteca.devolver(livro1, aluno);

        System.out.println(
                "Empréstimos do aluno após devolução: "
                        + aluno.getQuantidadeEmprestada()
        );

        System.out.println("\n--- TESTE DE LIMITE ---");

        biblioteca.emprestar(livro1, aluno);
        biblioteca.emprestar(livro2, aluno);
        biblioteca.emprestar(livro3, aluno);

        Revista revista2 = new Revista(5, "Revista Java");
        biblioteca.cadastrarItem(revista2);

        biblioteca.emprestar(revista2, aluno);

        biblioteca.listarAcervo();
    }
}