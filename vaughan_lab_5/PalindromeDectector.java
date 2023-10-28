public class PalindromeDectector {
    public static String newString="";

    public static void main(String[] args) {
        String str = "Desserts I stressed";
        System.out.println("Testing: "+str);
        stringReverser(str);
        System.out.println("reverse is: "+newString);
        if(isPalindrome(str)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }

    public static boolean isPalindrome(String str){
        if (str.toUpperCase().equals(newString.toUpperCase())){
            return true;
        } else {
            return false;
        }
    }

    public static void stringReverser(String str){
        if (str.length() == 0)	// Reached the end of the string
		{
			return;
		}
		else
		{
			newString += (str.charAt(str.length()-1));
			stringReverser(str.substring(0, str.length()-1));
		}
    }
}