package mock;

import java.util.HashSet;

public class nonrepchar {
    public static void main(String[] args) {
        //String string="newtone";
      String a = "geeksforgeeks";
      for(int i=0;i<a.length();i++)
      {
//          if(a.indexOf(a.charAt(i),a.indexOf(a.charAt(i))+1) ==-1)
//          {
//              System.out.println(a.charAt(i));
//              break;
//          }
          for (int j = 0; j < a.length(); j++) {


              if (a.charAt(i) != a.charAt(j)) {
                  System.out.println(a.charAt(i));
                  break;
              }
          }
      }
    }
}
