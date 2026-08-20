public abstract class ItemBiblioteca {

    private int codigo;
    private String titulo;
    private boolean disponivel;

    public ItemBiblioteca(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    protected void marcarIndisponivel() {
        disponivel = false;
    }

    protected void marcarDisponivel() {
        disponivel = true;
    }

    public abstract int getPrazoDias();

    public abstract double getMultaPorDia();
}