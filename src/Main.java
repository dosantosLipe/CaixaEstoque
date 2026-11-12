import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        carrinho car = new carrinho();
        Produto p = new Produto();
        Scanner ler = new Scanner(System.in);

        int opcao[] = new int[3];
        do {
            System.out.println("Utilizar Estoque[1]");
            System.out.println("Utilizar Caixa[2]");
            System.out.println("Sair[3]");
            opcao[0] = ler.nextint();
            ler.nexline();
            switch (opcao[0]) {
                case 1:
                    do {
                        int i=0;
                        System.out.println("Adicionar produto[1]");
                        System.out.println("Remover produto[2]");
                        System.out.println("Ver estoque[3]");
                        System.out.println("Sair[4]");
                        opcao[1] = ler.nextInt();
                        ler.nextLine();
                        switch (opcao[1]) {
                            case 1:

                                break;
                            case 2:
                                break;
                            case 3:
                                for(i=0;i<=3;i++){
                                System.out.println("produto "+i);
                                    System.out.println();


                                }
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Digite uma das opções!!!");

                        }
                    } while (opcao[1] != 4);

                case 2:
                default:
                    System.out.println("Digite uma das opções!!!");
            }

        } while (opcao[0] != 3);

    }
}