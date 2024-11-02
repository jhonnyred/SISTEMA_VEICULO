enum FREIOS{
    TAMBOR, DISCO, ABS;
}

public class Main {
    public static void main(String[] args){
        // INSTÂNCIANDO
        Veiculo v1 = new Veiculo("Vectra", "24/10/2024");
        Automotor a1 = new Automotor("Ultra", "24/10/2024", "Fiat", "rosa", 10000);
        Bicicleta b1 = new Bicicleta("modelo", "14/10/2024", "marca", "amarelo", "material", 5, true);
        Caminhao c1 = new Caminhao("modelo", "14/10/2024", "montadora", "verde", 5000.21, 4, 10);
        Domestico d1 = new Domestico("modelo", "14/10/2024", "montadora", "cor", 10000, 5, FREIOS.ABS, true);
        Motocicleta m1 = new Motocicleta("modelo", "14/10/2024", "montadora", "amarelo", 5000, 6000, 75.98);
        Skate s1 = new Skate("modelo", "14/10/2024", "marca", "vermelho", 74, 5);

        // SAÍDA
        System.out.println(v1.insert());
        System.out.println("\n"+a1.insert()+"\n");
        System.out.println(b1.printaTudo());
        System.out.println("\n"+b1.insert()+"\n");
        System.out.println(c1.printaTudo());
        System.out.println("\n"+c1.insert()+"\n");
        System.out.println(d1.printaTudo());
        System.out.println("\n"+d1.insert()+"\n");
        System.out.println(m1.printaTudo());
        System.out.println("\n"+m1.insert()+"\n");
        System.out.println(s1.printaTudo());
        System.out.println("\n"+s1.insert()+"\n");
    }
}
