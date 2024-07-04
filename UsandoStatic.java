 // para ser usado em conjunto com exemplo novaInterface e TesteNovaInterface
 //Lembrando: static pertence a classe ou interface que a declarou - não precisa ser implementada
 interface UsandoStatic {
    public static double calculeVelocidade(double distancia, double tempoMin){
        return distancia/tempoMin;
    }
    default String correr(String quant){
        return "correndo";
    } 
    String correrRapido(String bicho);
}