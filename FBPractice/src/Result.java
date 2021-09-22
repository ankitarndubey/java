import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Result {

	


    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static boolean isBalanced(String s) {
    // Write your code here
    LinkedList<Character> stack=new LinkedList<Character>();
    for(char c:s.toCharArray()) {
    	if(c=='(')
    		stack.push(')');
    	else if(c=='{')
    		stack.push('}');
    	else if(c==']')
    		stack.push(']');
    	else if(stack.isEmpty()||stack.pop()!=c)
    		return false;
    	}
    return stack.isEmpty();
    }


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = sc.nextLine();

                System.out.println(isBalanced(s) ? "YES":"NO");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

    }

}
