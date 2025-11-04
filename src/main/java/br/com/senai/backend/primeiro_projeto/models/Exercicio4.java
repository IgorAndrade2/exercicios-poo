public class atena{
    private double temperaturac;

    Scanner sc = new Scanner(System.in); //método de leitura
    public void converter(){
        System.out.println("Digite uma temperatuda em ° Celsius: ");
        temperaturac = sc.nextDouble();
        System.out.println("A temperatura equivalente em °F é: " temperaturac*1,8+32);
    }
    
}