import java.util.*;
public class Practice {
    public static void main(String[] args)  {
       Scanner sc=new Scanner(System.in);
       System.out.print("Size: ");
       int s1=sc.nextInt();
       int s2=sc.nextInt();

       int num1[]=new int[s1];
       System.out.println("Array1: ");
       for(int i=0;i<num1.length;i++){
        num1[i]=sc.nextInt();
       }

       int num2[]=new int[s2];
       System.out.println("Array2: ");
       for(int i=0;i<num2.length;i++){
        num2[i]=sc.nextInt();
       }
       Arrays.sort(num1);
       Arrays.sort(num2);
       int a=0,b=0,c=num1.length,d=num2.length;
       ArrayList<Integer> temp=new ArrayList<>();
       while(a<c && b<d){
        if(num1[a]<num2[b]){
          temp.add(num1[a]);
          a++;
        }
        else {temp.add(num2[b]);
        b++;}
       }
       while(a<c){
        temp.add(num1[a]);
        a++;
       }
       while(b<d){
        temp.add(num2[b]);
        b++;
       }
       /// 0-4=5  0-3=4 9
       int len=temp.size();
       
        if(len%2==0){  //odd
         int mid1=(len)/2;
         int mid2=mid1-1;
         double median=(temp.get(mid1)+temp.get(mid2))/2.0;
          System.out.println(median);
        }  
        else{ int mid=(len)/2;
        System.out.println(temp.get(mid));
        }
      }   
}
