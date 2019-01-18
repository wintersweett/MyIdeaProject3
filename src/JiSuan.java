import java.util.Stack;

/**
 * 计算：中缀转后缀，并计算结果
 */

public class JiSuan {
    public static void main(String[]args) {
        String a="3+(3-2)*5";
        String b="+-*/()";
        char[] chars=a.toCharArray();
        Stack<String> stack=new Stack<>();
        for (int i=0;i<chars.length;i++) {

            System.out.println(chars[i]);
        }

    }
}
