import java.util.*;

void main(){
    Scanner tc = new Scanner(System.in);

    System.out.println("=== VERIFICADOR DE PAR E IMPAR ===");

    System.out.print("Digite um numero para verificaçao:  ");

    int numero = tc.nextInt();

    if( numero % 2 == 0){
        System.out.printf("o numero digitado (%d) é PAR",numero);
    }else{
        System.out.printf("o numero digitado (%d) é IMPAR",numero);
    }
}
