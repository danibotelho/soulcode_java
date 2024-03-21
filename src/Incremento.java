import static java.lang.System.*;

public class Incremento {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        ++a;
        out.println("Incremento teste 1: " + a);
        --b;
        out.println("Incremento teste 2: " + b);


        int x = 8;

        out.println("Incremento teste 3: " + x++);
        out.println("Incremento teste 4: " + ++x);
        out.println("Teste :" + x);

        //quando se tem o ++ antes do valor (++x), quando for mostrado ela será já incrementado.
        //quando se tem o ++ depois do valor (x++), ele só será calculado depois, ou seja o valor não será
        //mostrado imediatamente.
    }

}