package aula07;

public class Casting {

	public static void main(String[] args) {
		int numero1 = 0;
	    int numero2 = 0;
	    float divisaoFloat = 0;
	    int divisaoInt = 0;
	    float divisaoFloatCasting = 0;
	    int divisaoIntCasting = 0;

	    numero1 = 35;
	    numero2 = 10;

	    divisaoFloat = numero1 / numero2;
	    divisaoInt = numero1 / numero2;
	    divisaoFloatCasting = (float) numero1 / numero2;
	    divisaoIntCasting = (int) numero1 / numero2;

	    System.out.println("divisaoFloat = " + divisaoFloat);
	    System.out.println("divisaoInt = " + divisaoInt);
	    System.out.println("divisaoFloatCasting = " + divisaoFloatCasting);
	    System.out.println("divisaoIntCasting = " + divisaoIntCasting);

	}

}
