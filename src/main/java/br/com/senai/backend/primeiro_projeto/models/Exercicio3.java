piblic class Exercicio3{
private int num1;
private int num2;
private int num3;
private int soma;
private int sub;
private int mult;
private double div;

Scanner sc = new Scanner(System.in); //método de leitura

public void soma() {
    System.out.println("Digite o primeiro número: "); //método de escrita
    num1 = sc.nextInt();
    System.out.println("Digite o segundo número: "); //método de escrita
    num2 = sc.nextInt();
    soma = num1 + num2;
}

public void sub() {
    System.out.println("Digite o primeiro número: "); //método de escrita
    num1 = sc.nextInt();
    System.out.println("Digite o segundo número: "); //método de escrita
    num2 = sc.nextInt();
    sub = num1 - num2;
}

public void mult() {
    System.out.println("Digite o primeiro número: "); //método de escrita
    num1 = sc.nextInt();
    System.out.println("Digite o segundo número: "); //método de escrita
    num2 = sc.nextInt();
    mult = num1 * num2;
}

public void div() {
    System.out.println("Digite o primeiro número: "); //método de escrita
    num1 = sc.nextInt();
    System.out.println("Digite o segundo número: "); //método de escrita
    num2 = sc.nextInt();
    div = num1 / num2;
}

}