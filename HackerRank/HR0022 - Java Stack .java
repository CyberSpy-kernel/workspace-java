import java.util.*;
class Solution{
	
	public static void main(String []argh) {
		Scanner sc = new Scanner(System.in);
    Stack<String>Symbol=new Stack<String>();
		
		while (sc.hasNext()) {
			String input=sc.next();
      //Complete the code
      boolean ans=true;
      for (String x:input.split("")){
        try{
          if ((x.equals(")"))||(x.equals("}"))||(x.equals("]"))){
            Symbol.pop();
          } else{
            Symbol.add(input);
          }
        } catch (EmptyStackException e){
          ans=false;
          break;
        }
      }
      if ((ans==true)&&(Symbol.size()==0)){
        System.out.println("true");
        Symbol.clear();
      }else{
        System.out.println("false");
        Symbol.clear();
      }
		}
	}
}
