public class MinhaClasse {
    public static void main(String[] args) {
       // System.out.print("Heya Devs!!!");
       String primeiroNome = "Alex";
       String segundoNome = "Paes";
       String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        // return primeiroNome + " " + segundoNome;
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}