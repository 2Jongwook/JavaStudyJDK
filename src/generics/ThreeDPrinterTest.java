package generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {


        ThreeDPrinter<Powder> pow = new ThreeDPrinter<Powder>();
        pow.setMaterial(new Powder());
        Powder powder = pow.getMaterial();


        ThreeDPrinter<Plastic> pla = new ThreeDPrinter<Plastic>();
        pla.setMaterial(new Plastic());
        Plastic plastic = pla.getMaterial();

        System.out.println(pow);
        System.out.println(pla);

    }
}
