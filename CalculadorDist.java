import java.util.*;

void main(){
     Scanner tc = new Scanner(System.in);

    System.out.println("=== CALCULADOR DE DISTRIBUIÇÃO DE INVESTIMENTOS ===");
    System.out.print("Digite o valor a ser investido R$: ");
    float vl = tc.nextFloat();

    System.out.println("--- VAMOS AS PORCENTAGENS (%) ---");
    System.out.println(" 1° parte 30% -> R$" + vl*0.3);
    System.out.println(" 2° parte 30% -> R$" + vl*0.3);
    System.out.println(" 3° parte 15% -> R$" + vl*0.15);
    System.out.println(" 4° parte 15% -> R$" + vl*0.15);
    System.out.println(" 5° parte 10% -> R$" + vl*0.1);
    System.out.println("---------------------------------");
}