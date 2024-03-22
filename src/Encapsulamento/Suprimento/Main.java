package Encapsulamento.Suprimento;

public class Main {
    public static void main(String[] args) {

        Suprimentos suprimentos = new Suprimentos( "Memoria Ram",2565845 ,3, 100.0);

        Suprimentos suprimentos2 = new Suprimentos( "SSD M2",8965988 ,2, 90);

        System.out.println("Descrição: "  + suprimentos.getDescrItem());
        System.out.println("Preço do " + suprimentos.getDescrItem() + ": " + suprimentos.getPrecoItem());
        System.out.println("Quantidades compradas : " + suprimentos.getQuantidadeItemComprada());
        System.out.println("Valor total : " + suprimentos.getInvoiceAmount(suprimentos.getQuantidadeItemComprada(), suprimentos.getPrecoItem()));

        System.out.println("\n");
        System.out.println("Descrição: "  + suprimentos2.getDescrItem());
        System.out.println("Preço do " + suprimentos2.getDescrItem() + ": " + suprimentos2.getPrecoItem());
        System.out.println("Quantidades compradas : " + suprimentos2.getQuantidadeItemComprada());
        System.out.println("Valor total : " + suprimentos2.getInvoiceAmount(suprimentos2.getQuantidadeItemComprada(), suprimentos2.getPrecoItem()));
    }

}