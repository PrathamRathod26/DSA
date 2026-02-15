package Arrays.LeetCodeQuestions;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
        } else {
            int i = digits.length-1;
            while(digits[i]==9){
                digits[i] = 0;
                i--;
                if(i==-1){
                    int[] newDigits = new int[digits.length+1];
                    newDigits[0] = 1;
                    return newDigits;
                }
            }
            digits[i]++;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 9};
        int[] result = plusOne(digits);
        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
