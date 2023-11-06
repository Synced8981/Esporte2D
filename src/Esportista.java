public class Esportista extends Pessoa{
    private int idFederacao;
    // Getter e Setter

    public int getIdFederacao() {
        return idFederacao;
    }

    public void setIdFederacao(int idFederacao) {
        this.idFederacao = idFederacao;
    }


    // Construtor

    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }

    //Método
    public String sacar(){
        return "Sacando...";
    }


}

