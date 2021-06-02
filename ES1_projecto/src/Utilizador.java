public class Utilizador {
    String nome;
    String estado;
    String morada;
    String password;
    String username;

    public Utilizador(String nome, String estado, String morada, String password, String username) {
        this.nome = nome;
        this.estado = estado;
        this.morada = morada;
        this.password = password;
        this.username = username;
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

      public String getPassword() {
        return this.password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
    
      public String getUsername() {
        return this.username;
    }

    public void setEstado(String username) {
        this.username = username;
    }
}
