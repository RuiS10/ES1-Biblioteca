public class Ebook {
    Livro livro;
    String formato;
    Integer tamanho;
    String hash;

    public Ebook(Livro livro, String formato, Integer tamanho, String hash) {
        this.livro = livro;
        this.formato = formato;
        this.tamanho = tamanho;
        this.hash = hash;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
