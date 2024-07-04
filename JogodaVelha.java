import java.util.Scanner;

public class JogodaVelha {
    
    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        byte[] r = new byte[2];
        boolean game = true;
        char SimboloAtual = 'O';
        String R;
        
        Scanner scan = new Scanner(System.in);
        
        for(int f=0;f<3;f++){
            for(int i=0;i<3;i++){
                velha[f][i] = new Campo();
            }
        }

        desenha(velha);
        while(game){
           System.out.print("Jogador "+SimboloAtual+" Digite a linha da jogada\n");
           r[0] = scan.nextByte();
           System.out.print("Jogador "+SimboloAtual+" Digite a Coluna da jogada\n");
           r[1]= scan.nextByte();
           if (r[0]>2 || r[1]>2){
             System.out.println("Valores maiores que 2 encerram o jogo\n");
             game = false;
             scan.close();
             break;
           }

           if (VerificaJogada(velha,r,SimboloAtual)){
             if (VerificaFinal(velha,SimboloAtual)){
                  desenha(velha);
                 System.out.println("\nV I T O R I A para o Jogador: "+ SimboloAtual);
                 System.out.println("\nQuer Jogar de novo?(S/N) ");
                 R =scan.next();
                 if (R.equals("S") || R.equals("s")){
                    LimpaJogada(velha);
                   // SimboloAtual= 'X';
                  }else{
                    scan.close();
                    break;
                 }
             }
              if(VerificaEmpate(velha)){
                desenha(velha);
                System.out.print("E M P A T E  - FIM DE JOGO");
                 System.out.println("\nQuer Jogar de novo?(S/N) ");
                 R = scan.next();
                 if (R.equals("S") || R.equals("s")){
                    LimpaJogada(velha);
                    SimboloAtual= 'X';
                 } else{
                    scan.close();
                    break;
                 }
                }
              if (SimboloAtual =='O'){
                SimboloAtual= 'X';
              }else{
                 SimboloAtual = 'O';
            }
            desenha(velha);
        }
       }// while
       if (game){
            System.out.println("O b r i g a d o por Jogar JOGO DA VELHA \n - Volte logo - ");
       }
       
    }//main
    public static void LimpaJogada(Campo[][] Velha){  //usado para reiniciar o jogo
        limpaTela();
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                Velha[l][c].setS(' ');
            }
        }
    }
    public static boolean VerificaEmpate(Campo[][] Velha){
        boolean R = true;
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                if (Velha[l][c].getS()==' '){
                    R = false;
                }
            }
        }
        return R;
    }
   public static void limpaTela(){
        for(int f=0;f<400;f++){
           System.out.println("   ");      
       }  
        System.out.println("  "); 
    }

public static void desenha(Campo[][] Velha){
         limpaTela();
         System.out.println("   0    1    2");
         System.out.printf("0   %c |  %c | %c %n",Velha[0][0].getS(),Velha[0][1].getS(),Velha[0][2].getS());
         System.out.println("  --------------");
         System.out.printf("1   %c |  %c | %c %n",Velha[1][0].getS(),Velha[1][1].getS(),Velha[1][2].getS());
         System.out.println("  --------------");
         System.out.printf("2   %c |  %c | %c %n",Velha[2][0].getS(),Velha[2][1].getS(),Velha[2][2].getS());
    }

public static boolean VerificaJogada(Campo[][] Velha,byte pos[],char Sa){
    char p=' ';
    p = Velha[pos[0]][pos[1]].getS();
    if(p==' '){
         Velha[pos[0]][pos[1]].setS(Sa);
         return true;
    }else{
         System.out.println("\nJogada em local ocupado.\n");
         return false;
   }
}
public static boolean VerificaFinal(Campo[][] velha,char simbolo){  
    boolean R = false;
    char A,B,C;
    // NA HORIZONTAL
    A = velha[0][0].getS();
    B = velha[0][1].getS();
    C = velha[0][2].getS();
    if (A==simbolo && B==simbolo && C==simbolo){
        R = true;
    }
    if (!R){
        A = velha[1][0].getS();
        B = velha[1][1].getS();
        C = velha[1][2].getS();
        if (A==simbolo && B==simbolo && C==simbolo){
            R = true;
        } 
    }   
    if(!R){
        A = velha[2][0].getS();
        B = velha[2][1].getS();
        C = velha[2][2].getS();
        if (A==simbolo && B==simbolo && C==simbolo){
            R = true;
        }    
    }
    
    //NA VERTICAL
    if(!R){
       A = velha[0][0].getS();
       B = velha[1][0].getS();
       C = velha[2][0].getS();
       if (A==simbolo && B==simbolo && C==simbolo){
           R = true;
        }
    }    
    if(!R){
        A = velha[0][1].getS();
        B = velha[1][1].getS();
        C = velha[2][1].getS();
        if (A==simbolo && B==simbolo && C==simbolo){
            R = true;
        }
    }
    if(!R){
        A = velha[0][2].getS();
        B = velha[1][2].getS();
        C = velha[2][2].getS();
        if (A==simbolo && B==simbolo && C==simbolo){
            R = true;
        }
    } 
    if (!R){   // esta  na diagonal
        A = velha[0][0].getS();
        B = velha[1][1].getS();
        C = velha[2][2].getS();
        if (A==simbolo && B==simbolo && C==simbolo){
            R = true;
        }
    }
    if (!R){   // esta  na diagonal
        A = velha[0][2].getS();
        B = velha[1][1].getS();
        C = velha[2][0].getS();
        if (A==simbolo && B==simbolo && C==simbolo){
            R = true;
        }
    }
    return R;
}

    
}
 