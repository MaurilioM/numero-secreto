/*  apesar do nome é uma classe que implementa uma interface
//note que implementa e melhora a classe correrRapido e "herda" a default correr()
mas calculeVelocidade continua so da UsandoStatic
*/
public class NovaInterface implements UsandoStatic {// não é uma interface mas implementa uma.
    @Override
    
    public String correrRapido(String tipo){
        String resp= "tipo não cadastrado";
        if (tipo == "Pessoa"){
            resp= "Correndo rápido";
        }
        if (tipo == "Cavalo"){
            resp= "Galopando";
        }
        return resp;
    }
    public String correr(String quant){
       String recebe = "parado";
       if(quant == "pouco"){
        recebe = "Correndo pouco";
       }
       if(quant == "muito"){
        recebe = "Correndo muito";
       }
       return recebe;
    }
       
    
}
