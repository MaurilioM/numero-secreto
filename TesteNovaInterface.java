import java.util.Locale;

public class TesteNovaInterface {
    public static void main(String[] args) {
        Number c = 25.4;
        System.out.println(UsandoStatic.calculeVelocidade(100, 10));
        NovaInterface nova = new NovaInterface();
        System.out.println(nova.correrRapido("Pessoa"));
        System.out.println(nova.correrRapido("Cavalo"));
        System.out.println(nova.correr("pouco"));
        System.out.println(Locale.getDefault());
        System.out.println(c.getClass());
    }
}
/* A partir do java8 as interfaces podem ter metodos staticos que não são "herdados" e portando 
* tambem não implementados 
 * e tem o default que são "herdados" e metodos tradicionais que podem ser
 * implementados. Os metodos static e default são sempre publicos.
 */