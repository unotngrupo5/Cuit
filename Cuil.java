package ejercicioCuil;

public class Cuil {

	public static void main(String[] args) {
		Cuil pablo = new Cuil("20","36159484",4);
		Cuil walter = new Cuil("20","32244531",9);
		//aString palabra;
//		System.out.println(pablo.calcAux());
//		System.out.println(pablo.calcAux2());
//		System.out.println(pablo.calcCodVer());
//		System.out.println(walter.calcAux());
//		System.out.println(walter.calcAux2());
//		System.out.println(walter.calcCodVer());
		//System.out.println(c1.getPrefijo().concat(c1.getDni()));
		//palabra = c1.getPrefijo().concat(c1.getDni());
		//System.out.println((palabra.charAt(0)) * (SERIE.charAt(0)));
		//a = Character.getNumericValue(palabra.charAt(0));
		//b = Character.getNumericValue(SERIE.charAt(0));
		//System.out.println(palabra.charAt(0));
		//System.out.println(SERIE.charAt(0));
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(a*b);
//		System.out.println(c1.concatData());
//		c1.isCuil("20361594845");
//		System.out.println(c1.equals("20361594844"));
		pablo.isCuil();
		walter.isCuil();
	}

	private String prefijo;	
	private String dni;
	static final String SERIE = "5432765432";
	private int cod_ver;

	public Cuil(String prefijo, String dni, int cod_ver) {
		this.setPrefijo(prefijo);
		this.setDni(dni);
		this.setCod_ver(cod_ver);
	}
	public int calcAux() {
		String palabra;
		int aux = 0;
		palabra = this.getPrefijo().concat(this.getDni());
		for (int i = 0; i < palabra.length() ; i ++) {
			aux = aux + Character.getNumericValue(palabra.charAt(i)) * Character.getNumericValue(SERIE.charAt(i));
		}
		return aux;
	}
	public int calcAux2() {
		int aux2;
		aux2 = this.calcAux() % 11;
		return aux2;
	}
	public int calcCodVer() {
		int aux3;
		aux3 = 11 - this.calcAux2();
		return aux3;
	}
	public String isCuil() {
		if (this.calcCodVer() == cod_ver) {
			return "Your Cuil is OK";
		} else {
			return "Your Cuil is Wrong";
		}
	}
//	public void isCuil(String cuil) {
//		if (this.equals(cuil)) {
//			System.out.println("Your Cuil is OK");
//		} else {
//			System.out.println("Your Cuil is Wrong");
//		}
//
//	}
//	public String concatData() {
//		return this.getPrefijo().concat(this.getDni()) + (this.getCod_ver());
//	}
//	public boolean equals(String cuil) {
//		if (this.concatData().contentEquals(cuil)) return true;
//		return false;
//	}
	public String toString() {
		return "Tu Cuil es: " + prefijo + "-" + dni + "-" + cod_ver;
	}
	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCod_ver() {
		return cod_ver;
	}

	public void setCod_ver(int cod_ver) {
		this.cod_ver = cod_ver;
	}

}
