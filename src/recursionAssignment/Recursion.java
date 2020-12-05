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
    // Base Case
    if (str.equals("")) {
      return "";
    // Recursive Step if there is an x 
    }else if (str.substring(0,1).equals("x")){
      return endX(str.substring(1)) + "x";
    // Recursive Step if there is no x 
    }else{
      return str.substring(0,1) + endX(str.substring(1));
    }
  }

  public static String stringClean(String str){
    
  }
}

