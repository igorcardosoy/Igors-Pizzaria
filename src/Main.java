import model.CrustType;
import model.Pizza;
import model.SizeType;

public class Main {
    public static void main(String[] args) {
        Pizza marguerita = new Pizza.Builder()
                .size(SizeType. LARGE)
                .crust(CrustType. THIN)
                .addTopping( "Tomate" )
                .addTopping( "Manjericão" )
                .build();

        Pizza peperoni = new Pizza.Builder()
                .addTopping ( "Pepperoni" )
                .build();

        Pizza.Builder builder = new Pizza.Builder();

        Pizza vegetariana = builder.size(SizeType.SMALL)
                .crust(CrustType.WHOLE_WHEAT)
                .cheese ("Mussarela")
                .addTopping("Pimentão")
                .addTopping("Cebola")
                .addTopping("Azeitona")
                .build();


        builder = new Pizza.Builder();

        builder.crust(CrustType.GLUTEN_FREE);
        builder.cheese("Queijo Vegano");
        builder.addTopping ("Tomate");
        builder.addTopping ("Rúcula");
        builder.addTopping ("Cogumelos");

        Pizza vegana = builder.build();

        System.out.println(marguerita);
        System.out.println(peperoni);
        System.out.println(vegetariana);
        System.out.println(vegana);
    }
}