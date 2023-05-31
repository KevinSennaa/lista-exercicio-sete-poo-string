public class Nomes {
    private String nome;
    public String inverterNome(String nomeContrario){
        StringBuilder stringbuilder = new StringBuilder(nomeContrario);
        return stringbuilder.reverse().toString().toUpperCase();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

 
}
