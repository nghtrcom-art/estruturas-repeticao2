import java.util.Scanner;
public class algoritmo2 {

    public static void main(String[] args){

        //Inicialização do scanner
        Scanner sc = new Scanner(System.in);

        //Inicializando e declarando as variáveis
        int opcao = 0;
        String frase;


        //Laço de repetição que verifica a opção escolhida e realiza as ações desejadas.
        do{

            //Instruções ao usuário e leitura das entradas
            System.out.println("MENU");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.println("Escolha uma das opções:");
            opcao = sc.nextInt();

            //Limpando o buffer
            sc.nextLine();

            //Estrutura que irá verificar as entradas e decidir qual ação deverá se seguir.
            if(opcao ==1){
                System.out.println("Digite uma frase:");
                frase = sc.nextLine();

                System.out.println("A frase digitada foi:" + frase);

            }else if(opcao == 2){

                System.out.println("Obrigado por ter usado o nosso sistema, espero que tenha gostado, até a próxima!");
            }else{
                System.out.println("Opção iválida, tente novamente");

            }

        }while (opcao != 2);


    }
}
