                                                                
 import java.util.*;
class Main{
public static void main(String[] arg){
int a[]={64, 34, 25, 12, 22, 11, 90 };
  for(int i=0;i<a.length-1;i++){
    int min=i;
    for(int j=i+1;j<a.length;j++){
      if(a[j]<a[min]){
        min=j;
      
      int temp;
      temp=a[i];
       a[i]=a[min];
      a[min]=temp;
      }
    }
  }

  for(int num : a){
    System.out.println(num);
  }
}
}