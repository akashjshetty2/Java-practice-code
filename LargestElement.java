public class LargestElement{
  public static void main(String [] args){
    int[] number={10,20,54,23,76,92,67,98};
    int max=number[0];
    for(int i=1;i<number.length;i++){
    if(number[i]>max){
      max=number[i];
    }
  }
    System.out.println("The highets number in the given array is: "+max);
  }
}
