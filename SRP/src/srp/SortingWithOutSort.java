package srp;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithOutSort {

	public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	    al.add("ashok");
	    al.add("arun");
	    al.add("krishna");
	    al.add("Ravi");
	    al.add("sonu");
	    al.add("naveen");
	    al.add("jeevan");
	    al.add("thiru");
	    System.out.println("with sort method:");
	   // Collections.sort(al);
	    System.out.println("Unsorted Arraylist:");
	    System.out.println(al);
	    int count = al.size();
	  //  String temp;
	    Object[] name = al.toArray();
	    
	    for (int i = 0; i <name.length; i++) {
		      for (int j = i + 1; j < name.length; j++) {
		       Object  temp=0;
		       if (((String) name[i]).compareTo((String) name[j]) > 0) {
			          temp = (String) name[i];
		          name[i] = name[j];
			          name[j] = temp;
			        }
		      }
		    }
	    
	    
	    
	    
//	    for (int i = 0; i < count; i++) {
//	      for (int j = i + 1; j < count; j++) {
//	        if (((String) name[i]).compareTo((String) name[j]) > 0) {
//	          temp = (String) name[i];
//	          name[i] = name[j];
//	          name[j] = temp;
//	        }
//	      }
//	    }
	    System.out.println("Sorted Arraylist:");
	    for (int a = 0; a < name.length; a++) {
	      System.out.println(name[a]);
	    }
	  }
	}