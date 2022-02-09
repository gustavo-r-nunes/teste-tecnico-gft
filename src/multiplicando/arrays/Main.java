package multiplicando.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> a1 = Arrays.asList(10, 5, 98, 452);
		List<Integer> a2 = Arrays.asList(10, 5, 98, 452);
		
		List<Integer> b1 = Arrays.asList(548, 213, 10);
		List<Integer> b2 = Arrays.asList(5, 21, 12);
		
		List<Integer> c1 = Arrays.asList(50, 60, 70);
		List<Integer> c2 = Arrays.asList(5, 21, 12);
		
		List<Integer> d1 = Arrays.asList(60, 70);
		List<Integer> d2 = Arrays.asList(1, 2, 3);
		
		multiplicar(a1, a2);
		multiplicar(b1, b2);
		multiplicar(c1, c2);
		multiplicar(d1, d2);
	}
	
	public static void multiplicar(List<Integer> array1, List<Integer> array2) {
		
		if (array1.size() != array2.size()) {
			throw new TamanhoDiferenteArrayException("Arrays devem ter mesmo tamanho");
		}
		
		List<Integer> resultado = new ArrayList<>();
		
		for (int i = 0; i < array1.size(); i++) {
			resultado.add(array1.get(i) * array2.get(i));
		}
		
		System.out.println(resultado.toString());
	}
}
