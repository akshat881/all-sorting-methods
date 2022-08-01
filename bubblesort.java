                                                                
 import java.util.*;
class Main{
public static void main(String[] arg){
int a[]={64, 34, 25, 12, 22, 11, 90 };
  for(int i=0;i<a.length;i++){
    for(int j=0;j<a.length-1;j++){
      if(a[j]>a[j+1]){
      
      int temp;
      temp=a[j];
       a[j]=a[j+1];
      a[j+1]=temp;
      }
    }
  }

  for(int num : a){
    System.out.println(num);
  }
}
}
