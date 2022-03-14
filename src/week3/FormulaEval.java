package week3;

import java.util.Scanner;

public class FormulaEval {
	
	public static double eval(String formula) {
		Stack<String> ops = new LinkedListStack<String>();
		Stack<Double> vals = new LinkedListStack<Double>();
		
		String[] list = formula.split(" ");
		for (String s : list) {
			if (s.equals("(")) ;
			else if (s.equals("+")) ops.push(s);
			else if (s.equals("-")) ops.push(s);
			else if (s.equals("*")) ops.push(s);
			else if (s.equals("/")) ops.push(s);
			else if (s.equals(")")) {
				String op = ops.pop();
				double v = vals.pop();
				if (op.equals("+")) v = vals.pop() + v;
				else if (op.equals("-")) v = vals.pop() - v;
				else if (op.equals("*")) v = vals.pop() * v;
				else if (op.equals("/")) v = vals.pop() / v;
				vals.push(v);
			} else vals.push(Double.parseDouble(s));
		}
		
		return vals.pop();
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(eval(input));
	}
}
