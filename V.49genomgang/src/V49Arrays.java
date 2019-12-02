
public class V49Arrays {

	public static void main(String[] args) {

		// 1, 2, 3
		// index (0, 1, 2)

		int[] arr = { 1, 2, 3 };

		// tom lista, har fem platser i sig lediga
		int[] arr2 = new int[5];

		// index 2 och plats 3, om man vill byta
		arr2[2] = 3;

		// 1.5 funkar inte, då det är en int lista, bara heltal
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;

		// lista 5:ans tabell
		int[] listaTabell = new int[20];

		listaTabell[0] = 5;
		listaTabell[1] = 10;
		listaTabell[2] = 15;
	

	//räknar ut sjuans tabell
	int[] sjuans = new int[14];
	
	for(int sju = 0; sju < 14; sju++) {
		sjuans[sju] = sju * 7;
	}
	for(int i = 0; i < sjuans.length; i++) {
		System.out.println(sjuans[i]);
		
	}
	
	String[] sarr = { "test", "namn", "dawd", "Hugo"};
	//söker igenom listan efter specifika namnet
	for (String name : sarr) {
		if(name =="Hugo") {
			System.out.println("detta är hugo");
		}
		else {
			System.out.println("detta är inte hugo");
		}
	}
	
	
}}
	
//for (int i = 0; i < 20; i++) {
//femans[i] = 1 * 5;
//}

// skriva ut alla värden i listan
//for(int i = 0; i < femans.length; i++) {
//System.out.println(femans[i]);


//gå igenom hela listan, lättare sett än for loopen ovanför
//	for (int fiver : femans) {
//System.out.println(fiver);
//}
//}
