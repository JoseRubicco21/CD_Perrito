public class Test_Perrito {

	public static void main(String[] args) {
		
        Perrito perrito1 = new Perrito();
        Perrito perrito2 = new Perrito();
        Perrito perrito3 = new Perrito();

        perrito1.setNombre("Fido");
        perrito1.setColor("Blanco");
        perrito1.setRaza("Galgo");
        perrito1.setChip(true);
        perrito1.setNumChip(1);

        perrito2.setNombre("Firulais");
        perrito2.setColor("Blanco y negro");
        perrito2.setRaza("Husky");
        perrito2.setChip(true);
        perrito2.setNumChip(2);

        perrito3.setNombre("Mastif");
        perrito3.setColor("Negro");
        perrito3.setRaza("Mastif tibetano");
        perrito3.setChip(true);
        perrito3.setNumChip(3);

        perrito1.ladrar();
        perrito2.ladrar();
        perrito3.ladrar();

        perrito1.dormir();
        perrito1.pedirDeComer();

        System.out.println(perrito1.toString());
        System.out.println(perrito2.toString());
        System.out.println(perrito3.toString());


	}

}
