import java.util.*;

public class Sorts{
  public void bubbleSort(int[] list){
    for(int outer=0;outer<list.length-1;outer++){
      for(int inner=0;inner<list.length-outer-1;inner++){
        if(list[inner]>list[inner+1]){
          int temp = list[inner+1];
          list[inner+1]=list[inner];
          list[inner]=temp;
        }
      }
    }
  }
  public void selectionSort(int[] list){
    int flag=0; 
    for(int outer=0;outer<list.length-1;outer++){
      flag=outer;
      int temp=0; 
      for(int inner=outer+1;inner<list.length;inner++){
        if(list[flag]>list[inner]){
          flag=inner;
        }
        temp=list[outer];
        list[outer]=list[flag];
        list[flag]=temp;
      }
    }
  }
  public void insertionSort(int[] list){
    for(int outer=1;outer<list.length;outer++){
      int pos=outer;
      int key=list[pos];
      while((pos>0)&&(list[pos-1]>key)){
        list[pos]=list[pos-1];
        --pos;
      } list[pos]=key;
    }
  }
  private void merge(int[] a, int first, int mid, int last){
    //your code here
  }
  public void mergeSort(int[] a, int first, int last){
    //your code here
  }
}

