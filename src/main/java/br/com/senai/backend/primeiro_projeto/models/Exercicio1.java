public class exercicio1{
    private String nome;
    private String sobrenome;

    Scanner sc = new Scanner(System.in); 

    System.out.println("Digite seu nome: "); //método de escrita
    nome = sc.nextInt();

    System.out.println("Digite seu sobrenome: "); //método de escrita
    sobrenome = sc.nextInt();

    System.out.println("Olá" + nome + sobrenome ", tudo bem?");

}