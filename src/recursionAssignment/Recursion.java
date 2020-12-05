package recursionAssignment;

public class Recursion{
  public static int countHi(String str){
    // Base Case
    if (str.equals("")) {
      return 0; 
    // Recursive Step if hi 
    }else if (str.substring(0,1).equals("h") && str.substring(1,2).equals("i")) {
      return 1 + countHi(str.substring(2));
    // Recursive Step if no hi 
    }else{
      return countHi(str.substring(1));
    }
  }

  public static String endX(String str){
    return "";
  }
}

