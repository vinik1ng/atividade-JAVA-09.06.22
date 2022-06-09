import java.util.Scanner;



//1



public class Revisao{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva seu primeiro numero: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Escreva seu segundo numero: ");
        double numero2 = entrada.nextDouble();
        System.out.println("==============================================");

        double total = numero1+numero2;
        System.out.println("Seu resultado foi "+ total);

    }
}



//2




public class Revisao{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva seu valor em metros: ");
        double numero1 = entrada.nextDouble();
        double total = numero1*100;
        System.out.println("Seu valor e igual a "+ total+" centimetros");

    }
}



//3




public class Revisao{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        double numero1 = entrada.nextDouble();
        if(numero1 %2==0){
        System.out.println("Seu numero e par");
        }else{
         System.out.println("Seu numero e impar");
        }


    }
}



//4


public class Revisao{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva a velocidade do carro: ");
        double numero1 = entrada.nextDouble();
        if (numero1 > 80){
            Double acima = numero1 - 80;
            double multa = acima * 5;
            System.out.println("Voce ultrapassou a velocidade permitida, sua multa e de "+multa+" reais");
        }else{
            System.out.println("Voce esta dentro do limite permitido");
        }
       

    }
}