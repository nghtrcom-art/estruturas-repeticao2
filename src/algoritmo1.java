import java.util.Scanner;
public class algoritmo1 {

    public static void main(String[] args){

        //Inicialização do scanner
        Scanner sc = new Scanner(System.in);

        //Inicialização das variáveis
        int num, i = 0, resultado;


        //Instruções ao usuário
        System.out.println("Olá! Digite um número para ver a sua tábuada:");
        num = sc.nextInt();

        //Laço de repetição que irá realizar a contagem
        while(num > 0 && i <= 10){

            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
            i++;

        }
    }
}
