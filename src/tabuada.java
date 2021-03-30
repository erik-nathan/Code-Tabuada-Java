import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        // chamando o menu
        menu();
    }

    public static void menu() {
        // declarando variáveis
        Scanner ler = new Scanner(System.in);
        int opcao;
        float numero;

        // realizando o menu da aplicação
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("------  T A B U A D A  ------");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("- Escolha uma opção abaixo: -");
        System.out.println("-----------------------------");
        System.out.println("-      1 | Soma             -");
        System.out.println("-      2 | Subtração        -");
        System.out.println("-      3 | Multiplicação    -");
        System.out.println("-      4 | Divisão          -");
        System.out.println("-----------------------------");
        System.out.print("- Informe uma opção: ");
        opcao = ler.nextInt();

        // realizando escolhas das opção do menu
        switch (opcao){
            // realizando o primeiro caso
            case 1:
                System.out.println("------------------------");
                System.out.print("- Informe um número: ");
                numero = ler.nextFloat();
                System.out.println("------------------------");
                System.out.println("- TABUADA DE SOMA DO " + numero + " -");
                System.out.println("------------------------");
                for (int i = 1; i <= 10; i++ ) {
                    System.out.println("    | " + numero + " + " + i + " = " + (numero+ i ) + " |");
                }
                System.out.println("------------------------");
                aux();
                break;
            // realizando o segundo caso
            case 2:
                System.out.println("------------------------");
                System.out.print("- Informe um número: ");
                numero = ler.nextFloat();
                System.out.println("-----------------------------");
                System.out.println("- TABUADA DE SUBTRAÇÃO DO " + numero + " -");
                System.out.println("-----------------------------");
                for (int i = 1; i <= 10; i++ ) {
                    System.out.println("     | " + numero + " - " + i + " = " + (numero - i) + " |");
                }
                System.out.println("-----------------------------");
                aux();
                break;
            // realizando o terceiro caso
            case 3:
                System.out.println("------------------------");
                System.out.print("- Informe um número: ");
                numero = ler.nextFloat();
                System.out.println("------------------------");
                System.out.println("-    TABUADA DO " + numero + "    -");
                System.out.println("------------------------");
                for (int i = 1; i <= 10; i++ ) {
                    System.out.println("    | " + numero + " x " + i + " = " + (numero * i) + " |");
                }
                System.out.println("------------------------");
                aux();
                break;
            // realizando o quarto caso
            case 4:
                System.out.println("------------------------");
                System.out.print("- Informe um número: ");
                numero = ler.nextFloat();
                System.out.println("---------------------------");
                System.out.println("- TABUADA DE DIVISÃO DO " + numero + " -");
                System.out.println("---------------------------");
                for (int i = 1; i <= 10; i++ ) {
                    System.out.println("    | " + numero + " / " + i + " = " + (numero / i) + " |");
                }
                System.out.println("--------------------------");
                aux();
                break;
            // realiando o default, caso o valor não seja entre 1..4
            default :
                System.err.println("------- ERRO ------");
                System.err.println("- Opção Inválida  -");
                System.err.println("-------------------");
                System.out.println("");
                menu();
        }
    }

    public static void aux() {
        // parte final da aplicação, caso o usuário queria refazer ou sair da tabuada
        int opcao2;
        Scanner ler = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("- Deseja realizar outra operação ? -");
        System.out.println("------------------------------------");
        System.out.println("-              1 | Sim             -");
        System.out.println("-              2 | Não             -");
        System.out.println("------------------------------------");
        System.out.print("- Informe uma opção: ");
        opcao2 = ler.nextInt();

        // realizando escolhas das opção do rodapé
        switch (opcao2){
            // realizando o primeiro caso
            case 1:
                menu();
                break;
            // realizando o segundo caso
            case 2:
                System.out.println("-----------------------------");
                System.out.println("- Obrigado e volte sempre ! -");
                System.out.println("-----------------------------");
                System.exit(0);
                break;
            // realiando o default, caso o valor não seja entre 1..2
            default:
                System.err.println("------- ERRO ------");
                System.err.println("- Opção Inválida  -");
                System.err.println("-------------------");
                System.out.println("");
                aux();
                break;
        }
    }
}