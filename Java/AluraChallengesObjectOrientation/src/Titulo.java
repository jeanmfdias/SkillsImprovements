public class Titulo {
    private String nome;
    private String autor;
    private int anoLancamento;
    private double avaliacao;

    public Titulo(String nome, String autor, int anoLancamento, double avaliacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }

    public double getAvaliacao() { return avaliacao; }
    public void setAvaliacao(double avaliacao) { this.avaliacao = avaliacao; }
}
