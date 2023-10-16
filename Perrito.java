public class Perrito {

	private String nombre; 
	private String raza;
	private String color;
	private boolean chip;
	private int numChip;

    // Getters & Setters
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isChip() {
		return chip;
	}
	public void setChip(boolean chip) {
		// validates if the chip exist or sets the num chip to 0
		if(isChip()) {
			this.chip = chip;
		} else {
			this.chip = chip;
			setNumChip(0);
		}
	}

	public int getNumChip() {
		return numChip;
	}
	public void setNumChip(int numChip) {
		this.numChip = numChip;   
    }

    // Methods

    public void ladrar() {
        System.out.println("woof woof");
    }

    public void dormir() {
        System.out.println("Me voy a dormir");
    }

    public void pedirDeComer(){
        System.out.println("woof ".repeat(10));
    }

    // Overrides

    @Override

    public String toString(){
        return ("Nombre: " + nombre + " Raza: " + raza + " Color: " + color + " Chip: " + chip + " Número de chip: " + numChip );
    }
}