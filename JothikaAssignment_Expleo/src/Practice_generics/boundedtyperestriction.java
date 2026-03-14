package Practice_generics;

public class boundedtyperestriction {
static <T extends Number>T genericDisplay(T x,T y){
	return (T)(Integer)(x.intValue()+y.intValue());
}
	public static void main(String[] args) {
		System.out.println(genericDisplay(23,28));
		//System.out.println(genericDisplay("Generics,Demo"));//bound type: number

	}

}
