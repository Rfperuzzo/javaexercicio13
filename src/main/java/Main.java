
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        double salario , prestacao ,prestacaopretendida ;
        
        System.out.println("salario :");
        salario = scanner.nextDouble();
        System.out.println("prestação de ? :");
        prestacao = scanner.nextDouble();
        
        prestacaopretendida = salario / 0.3;
        
        if ( prestacao <= prestacaopretendida ){
            System.out.println("emprestimo concedido!");
        }else{
            System.out.println("não deu!");
        }
        
        
        
        
        
    }
}
