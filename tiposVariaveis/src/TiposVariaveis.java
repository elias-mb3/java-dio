public class TiposVariaveis {
    double salario;
    int idade;
    float altura;

    public static void main(String[] args) {
        TiposVariaveis tv = new TiposVariaveis();
        tv.salario = 1000.00;
        tv.idade = 25; // int não pode começar com 0
        tv.altura = 1.75f; // f para float

        System.out.println("Salário: " + tv.salario);
        System.out.println("Idade: " + tv.idade);
        System.out.println("Altura: " + tv.altura);
    }
    
    int teste = 1;
    final int TESTE = 2;


}
