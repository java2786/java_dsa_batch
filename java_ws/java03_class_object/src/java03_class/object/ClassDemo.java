package java03_class.object;

public class ClassDemo {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int hindiMarks = 79;
		int mathMarks = 83;
		calc.add(hindiMarks, mathMarks);
	}
}
