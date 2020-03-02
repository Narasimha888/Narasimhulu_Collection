package Custom_Collection;

import java.util.ArrayList;


import java.util.Arrays;
 class DataList<E> 
{
  //Size of list
  private int size = 0;
   
  //Default capacity of list is 10
  private static final int DEFAULT_CAPACITY = 10;
   
  //This array will store all elements added to list
  private Object elements[];

  //Default constructor
  public DataList() {
      elements = new Object[DEFAULT_CAPACITY];
  }

  //Add method
  public void add(E e) {
      if (size == elements.length) {
          ensureCapacity();
      }
      elements[size++] = e;
  }
   
  //Get method
  
  public E get(int i) {
      if (i >= size || i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
      }
      return (E) elements[i];
  }
   
  //Remove method
  
  public E remove(int i) {
      if (i >= size || i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
      }
      Object item = elements[i];
      int num = elements.length - ( i + 1 ) ;
      System.arraycopy( elements, i + 1, elements, i, num ) ;
      size--;
      return (E) item;
  }
   
  //Get Size of list
  public int size() {
      return size;
  }
   
  //Print method
  
  public String toString() 
  {
       StringBuilder sb = new StringBuilder();
       sb.append('[');
       for(int i = 0; i < size ;i++) {
           sb.append(elements[i].toString());
           if(i<size-1){
               sb.append(",");
           }
       }
       sb.append(']');
       return sb.toString();
  }
   
  private void ensureCapacity() {
      int newSize = elements.length * 2;
      elements = Arrays.copyOf(elements, newSize);
  }
}
public class Custom_List
{
  public static void main(String[] args) 
  {
	 
      DataList<Integer> list = new DataList<Integer>();
DataList<String> sList=new DataList<String>();
      //Add elements
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(1);
      list.add(2);
      list.add(3);

      list.add(1);
      list.add(2);
      list.add(3);

      list.add(1);
      list.add(2);
      list.add(3);
      sList.add("Hello");
      sList.add("This");
      sList.add("Is");
      sList.add("Epam");
      sList.add("Task");
      System.out.println("STRING LIST ELEMENTS : "+sList);
      System.out.println("INTEGER LIST ELEMENTS: "+list);
       
      //Remove elements from index
     
      
      list.remove(2);
      
      System.out.println("LIST AFTER REMOVING: "+list);
     
      //Get element with index
      
      System.out.println( "ELEMENT AT 0TH INDEX : "+list.get(0) );
      System.out.println("ELEMENT AT 1ST INDEX : "+ list.get(1) );
      System.out.println("ELEMENT AT 5TH INDEX : "+ list.get(5) );
      //List Size
      System.out.println("SIZE OF THE STRING LIST : "+sList.size());
      System.out.println("SIZE OF THE INTEGER LIST : "+list.size());
  }
}
