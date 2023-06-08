package aplicacao;

import model.Pizza;

public class App {
    public static void main(String[] args) {
        Pizza pedido = new Pizza ("Frango", 30, 'G') ;
        Pizza nome = new Pizza("Bárbara");
      
        System.out.println("\nPizzaria: FOME DE PIZZA");
        System.out.print("Boa Noite, Aqui é da Pizzaria Fome de Pizza!");
        System.out.println(nome.nomeCliente());
        System.out.println(pedido.pedidoIfood());
        System.out.println("Agradecemos a sua Preferência!!!\n");

        Pizza pedido2 = new Pizza ("Camarão", 50, 'M');
        Pizza nome2 = new Pizza ("Mariana");

        System.out.println("\nPizzaria: FOME DE PIZZA");
        System.out.print("Boa Noite, Aqui é da Pizzaria Fome de Pizza!");
        System.out.println(nome2.nomeCliente());
        System.out.println(pedido2.pedidoIfood());
        System.out.println("Agradecemos a sua Preferência!!!\n");

        Pizza pedido3 = new Pizza ("Carne Seca", 40, 'G');
        Pizza nome3 = new Pizza ("Cláudia");

        System.out.println("\nPizzaria: FOME DE PIZZA");
        System.out.print("Boa Noite, Aqui é da Pizzaria Fome de Pizza!");
        System.out.println(nome3.nomeCliente());
        System.out.println(pedido3.pedidoIfood());
        System.out.println("Agradecemos a sua Preferência!!!\n");
    }
}
