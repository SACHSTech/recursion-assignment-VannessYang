package recursionAssignment;

public class Recursion{
  public static int countHi(String str){
    // Base Case
    if(str.equals("")){
      return 0; 
    // Recursive Step 
    }else if(str.substring(0,1).equals("h") && str.substring(1,2).equals("i")){
      return 1 + countHi(str.substring(2));
    }else{
      return 0 + countHi(str.substring(1));
    }
  }
}

