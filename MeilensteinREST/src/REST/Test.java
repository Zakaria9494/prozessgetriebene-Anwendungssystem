package REST;

public class Test {

	public static void main(String[] args) {
		TaxikostenInterface tf = new TaxikostenInterface();
		tf.setJSON(400);
		System.out.println(tf.getJSON());

	}

}
