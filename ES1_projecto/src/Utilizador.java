public class Utilizador {
    String nome;
    String estado;
    String morada;

    public Utilizador(String nome, String estado, String morada) {
        this.nome = nome;
        this.estado = estado;
        this.morada = morada;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
