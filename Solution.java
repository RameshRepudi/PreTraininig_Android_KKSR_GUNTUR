import java.io.*;

import java.util.*;

import java.text.*;
import java.math.*;

import java.util.regex.*;




public class Solution
 {

  
  public static void main(String[] args)
 {
            
      String s=new String();
      System.out.println("\n enter a String");
      Scanner cin=new Scanner(System.in);
      s=cin.nextLine();
      int l=s.length();
      String s1=" ",s2=" ",sol=" ";



      for(int i=0,j=l-1;i<l/2;i++,j--)
      {
       s1=s.substring(0,i+1);
       s2=s.substring(j,l);

       if(s1.equals(s2))
       sol=s1;
	
       
       }
  System.out.println("Longest Substring is :"+sol);
                   
       
 }
  
  

}