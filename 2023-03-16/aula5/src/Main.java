public class Main {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("ana", 1990, "ana@example.com");
        System.out.println(ana.getNome());
        
        Aluno caio = new Aluno("caio", 1985, "caio@example.com", 12334);
        System.out.println(caio.getNome());
        
        Professor andrea = new Professor("andrea", 1987, "andrea@example.com", "Asd385181");
        System.out.println(andrea.getNome());
        System.out.println(ana.toString());
        System.out.println (caio.toString());
        System.out.println(andrea.toString());
    }   
}
