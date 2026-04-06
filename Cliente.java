public class Cliente {
    private String nomeCompleto;
    private int mesa;

    public Cliente(String nomeCompleto, int mesa) {
        this.nomeCompleto = nomeCompleto;
        this.mesa = mesa;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getMesa() {
        return mesa;
    }

    public String getPrimeiroNome() {
        String[] partes = nomeCompleto.split(" ");
        return partes[0];
    }

    public String nomeMaiusculo() {
        return nomeCompleto.toUpperCase();
    }
}