// Made By Damian Sclafani
package CSCE145AND146;

public class ReversePolishCalculator {
    //initializing the stack
	private StackI<Integer> stack;
	public int calculate(String input)
	{
		stack = new LLStack<>();
		//initializing variables
		int value1;
		int value2;
		
		for(int i = 0; i < input.length(); i++)//looks at the whole string
		{
			switch(""+input.charAt(i))
			{
			case "+":
				if(stack.size() >= 2)//checks that there are enough numbers
				{
					stack.push(stack.pop() + stack.pop());
				}
				else
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers.");
					return 0;
				}
				break;
			case "-":
				if(stack.size() >= 2)//checks that there are enough numbers
				{
					value1 = stack.pop();
					value2 = stack.pop();
					stack.push(value2-value1);
				}
				else
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers.");
					return 0;
				}
				break;
			case "*":
				if(stack.size() >= 2)//checks that there are enough numbers
				{
					stack.push(stack.pop()*stack.pop());
				}
				else
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers.");
					return 0;
				}
				break;
			case "/":
				if(stack.size() >= 2)//checks that there are enough numbers
				{
					value1 = stack.pop();
					value2 = stack.pop();
					if(value1 != 0)//makes sure the denominator isn't 0
					{
						stack.push(value2/value1);
					}
					else
					{
						System.out.println("Cannot divide by 0");
						return 0;
					}
				}
				else
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers.");
					return 0;
				}
				break;
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				stack.push(Integer.parseInt(""+input.charAt(i)));//adds the value if the charAt is a number
				break;
			case " ":
			case "\t":
			break;
			default:
				System.out.println("Not a valid operator");
				return 0;
			}
		}
		if(stack.size() != 1)//checks to make sure there is only one value left in the stack
		{
			System.out.println("This was not properly formatted. There were too many numbers and not enough operators.");
			return 0;
		}
		return stack.pop();//also clears the stack
	}
}
