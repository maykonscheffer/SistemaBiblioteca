public class Biblioteca {

    private ItemBiblioteca[] acervo;
    private Usuario[] usuarios;

    public Biblioteca() {
        acervo = new ItemBiblioteca[10];
        usuarios = new Usuario[10];
    }

    public void cadastrarItem(ItemBiblioteca item) {
        for (int i = 0; i < acervo.length; i++) {
            if (acervo[i] == null) {
                acervo[i] = item;
                return;
            }
        }

        System.out.println("Acervo cheio.");
    }

    public void cadastrarUsuario(Usuario usuario) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                return;
            }
        }

        System.out.println("Limite de usuários atingido.");
    }

    public void emprestar(ItemBiblioteca item, Usuario usuario) {

        if (!item.isDisponivel()) {
            System.out.println("O item não está disponível.");
            return;
        }

        if (usuario.getQuantidadeEmprestada() >= usuario.getLimiteItens()) {
            System.out.println("Empréstimo recusado. Limite de itens atingido.");
            return;
        }

        item.marcarIndisponivel();
        usuario.adicionarEmprestimo();

        System.out.println("Empréstimo realizado com sucesso.");
    }

    public void devolver(ItemBiblioteca item, Usuario usuario) {

        if (item.isDisponivel()) {
            System.out.println("O item já está disponível.");
            return;
        }

        item.marcarDisponivel();
        usuario.removerEmprestimo();

        System.out.println("Item devolvido com sucesso.");
    }

    public void listarAcervo() {

        System.out.println("\n--- ACERVO DA BIBLIOTECA ---");

        for (ItemBiblioteca item : acervo) {
            if (item != null) {
                System.out.println(
                        "Código: " + item.getCodigo()
                                + " | Título: " + item.getTitulo()
                                + " | Disponível: " + item.isDisponivel()
                );
            }
        }
    }
}