public class DVD extends ItemBiblioteca {

    public DVD(int codigo, String titulo) {
        super(codigo, titulo);
    }

    @Override
    public int getPrazoDias() {
        return 5;
    }

    @Override
    public double getMultaPorDia() {
        return 2.00;
    }
}