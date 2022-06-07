package aula9;

public class livro implements Publicacao { //para ser funcional com a interface
    
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private pessoa leitor;

    @Override
    public String toString() {
        return "titulo do livro = " + titulo + "\n, autor = " + autor + "\n, totPagina = " + totPagina 
                + "\n, pagAtual = " + pagAtual + "\n, aberto = " + aberto + "\n, leitor = " + leitor.getNome() +
                "\n, idade = " + leitor.getIdade() + "\n, sexo = " + leitor.getSexo();
    }
    
    
    public livro(String titulo, String autor, int totPagina, pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(pessoa leitor) {
        this.leitor = leitor;
    }

    //Metodos abristratos
    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPagina) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
