import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

class Solution {

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

  public static void main(String[] args) throws IOException {
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


/*public boolean isValid(String s){
Stack<Character> stack=new Stack<Character>();
for(char c:s.toCharArray()){
    if(c=='(')
        stack.push(')');
    else if(c=='{')
       stack.push('}');
       else if(c=='[')
       stack.push(']');
       else if(stack.isEmpty()||stack.pop()!=c)
       r
       eturn false;
}
       return stack.isEmpty();
}

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int t = in.nextInt();
for(int a0 = 0; a0 < t; a0++){
    String s = in.next();
        System.out.println(isValid(s) ? "YES":"NO");
}
}
*/