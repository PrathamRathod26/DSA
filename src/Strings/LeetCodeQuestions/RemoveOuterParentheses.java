package Strings.LeetCodeQuestions;

public class RemoveOuterParentheses {
    public static String removeOuterParentheses(String s) {
        int level = 0;
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(level>0){
                    ans.append(ch);
                }
                level++;
            } else {
                level--;
                if(level>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "((()()))(())";
        System.out.println(removeOuterParentheses(s));
    }
}
