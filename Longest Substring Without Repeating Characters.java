class Main {
  public static void main(String[] args) {
    lengthOfLongestSubstring("ABAA");
  }

  public static void lengthOfLongestSubstring(String str) {
    char[] ary = str.toCharArray(); 
    if(ary[0] == ary[1]){
        System.out.println(1);
    }else{
      /* get all the chars from the 2 char till the last index of first char*/ 
      System.out.println( ary[1,2] );
    }
  }
}


/**
Loop in the string and check if all the characters equals the first character. 
**/
