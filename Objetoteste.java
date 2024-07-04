
public class Objetoteste {
    public static void main(String[] args) {

      Integer x=45;
      int y = 0;
      Number c = 3.14;
      System.out.println(c.getClass());
      
      String mens;

      System.out.println("Ola "+x+" "+y);
      
      
      
      Pessoa gente = new Pessoa("Maurilio", 66);
      
      System.out.println("Nome: "+gente.getNome()+" Idade: "+gente.getIdade());
      
      gente.aniversario();
      
      System.out.println("Nome: "+gente.getNome()+" Idade: "+gente.getIdade());

      UsandoStatic.meucodigo = " Esse é a minha variável que não preciso instanciar";
    
      mens = UsandoStatic.class.getName();

      System.out.println(UsandoStatic.meucodigo);
      System.out.println("Nome da classe: "+mens);
    }
}
