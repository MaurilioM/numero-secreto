import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
           final int r = 5;
      int x = 0;
      int res = 0;
      int ponto = 0;
      Scanner scan = new Scanner(System.in);
   String resp[][] = new String[r][r];
   int gaba[] = new int[r];
   gaba[0] = 1;
   gaba[1] = 4;
   gaba[2] = 2;
   gaba[3] = 3;
   gaba[4] = 1;

    resp[0][0] = "Qual a maior Estrela do Nosso Sistema Solar";
    resp[0][1] = "1 - SOL ";
    resp[0][2] = "2 - JUPITER";
    resp[0][3] = "3 - LUA";
    resp[0][4] = "4 - MARTE";
    resp[1][0] = "Qual a quinta letra de nosso alfabeto?";
    resp[1][1] = "1 - A";
    resp[1][2] = "2 - C";
    resp[1][3] = "3 - B";
    resp[1][4] = "4 - E";
    resp[2][0] = "Qual a raiz quadrada de 144?";
    resp[2][1] = "1 - 11";
    resp[2][2] = "2 - 12";
    resp[2][3] = "3 - 13";
    resp[2][4] = "4 - 14";
    resp[3][0] = "Du, Dudu e ...?(desenho dos anos 80)";
    resp[3][1] = "1 - HEY HAROLD";
    resp[3][2] = "2 - MARY ";
    resp[3][3] = "3 - EDU";
    resp[3][4] = "4 - LULU";
    resp[4][0] = "Qual o valor mais aproximado de PI?";
    resp[4][1] = "1 - 3,1415";
    resp[4][2] = "2 - 1,1413";
    resp[4][3] = "3 - 9,50";
    resp[4][4] = "4 - 220";
 //Scanner scan = new Scanner(System.in); 
 for(int i = 0;i<r; i++){
    for(int n =0;n<r;n++){
      System.out.println(resp[i][n]);  
    }
     x = gaba[i];
     res = scan.nextInt();
     if (res == x){
      ponto++;
     }
      System.out.println("--------------------------------\n");
     }
   
 switch (ponto) {
      case 0:
         System.out.println("Infelizmente voce errou todas as questões: \n");
         break;
     case 1:
         System.out.println("Você acertou apenas uma questão \n");
         break;
     case 2:
         System.out.println("Você acertou apenas duas questões \n");
         break;
     case 3:
         System.out.println("Você acertou tres questões \n");
         break;
     case 4:
         System.out.println("Você acertou 4 questões - NOTA 8,0 - MUITO BEM \n");
         break;
     case 5:
         System.out.println("PARABÉNS - VOCÊ ACERTOU TODAS - NOTA 10! \n"); 
         break;               
      default:
          //System.out.println("Resposta invalida - somente de 1 a 4 \n");
         break;
 
}   

}
}