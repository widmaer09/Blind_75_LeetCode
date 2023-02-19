public class Valid_Palindrome {
    public  static boolean isPalindrome(String s) {
       String sa = s.toLowerCase();
       StringBuffer string1= new StringBuffer();

      for (int i =0; i<s.length();i++){
          if(Character.isLetter(sa.charAt(i)) || Character.isDigit(sa.charAt(i))){
              string1.append(s.charAt(i));
          }
      }

          String string3 = string1.toString();
          string1.reverse();
          String string4= string1.toString();

          System.out.println(string3);
        System.out.println(string4);

        return string3.equalsIgnoreCase(string4);
        
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("0p"));



    }

}
