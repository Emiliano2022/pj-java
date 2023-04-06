public class Aluno extends Pessoa {
    private int rgm;

    public Aluno(String nome, int anoNascimento, String email, int rgm) {
        super(nome, anoNascimento, email);
        this.rgm = rgm;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }
    public String toString(){
        return super.toString() + "\n Rgm: " + this.rgm;
    }
    
}
