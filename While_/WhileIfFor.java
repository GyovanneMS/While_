import java.util.Scanner;

class WhileIfFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while(true){
            while (true){
                System.out.println("Escolha um número.");
                int n = ler.nextInt();
                long fat = n;
                if( n >= 0 ){
                    if(n == 0){
                        System.out.println("0! = 1.");
                        break;
                    }
                    else{
                        for(int i=n-1; i>=1; i--){
                        fat = fat * i;
                        }
                        System.out.println(n + "! = " + fat + ".");
                        break;
                    }
                    //break; --> quebra do while
                    //System.exit(0)
                }
                System.out.println("Número negativo, por favor repita.");  
            }
            System.out.print("Quer continuar?(Y/N): "); // next() --> retorna palavra
            String ns =ler.next();
            char sn = ler.next().charAt(0);
            if(sn != 'y' && sn != 'Y' && !ns.equals("Yes") && !ns.equals("yes") && sn != 'S' && sn != 's' && !ns.equals("Sim") && !ns.equals("sim")){
                System.exit(0);
            }
        }
    } //String ente haspas/haspas duplas "l"
} // variavel char --> char letra = 's'[lembre dos os apóstrofos/haspas simples !!!!]