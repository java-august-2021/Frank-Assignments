import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;

// import org.graalvm.compiler.nodes.calc.AddNode;
public class BasicJava {
    ArrayList<Integer> oddNum=new ArrayList<Integer>();
    public void num(){
        for(int i=1;i<=255;i++){
            System.out.println(i);
        }
    }
    public void odd(){
        for(int i=1;i<=255;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public int sumOf(){
        int sum=0;
        for(int i=1;i<=255;i++){
            sum+=i;
        }
        return sum;
    }

    public void array(){
        int [] ar={1,3,5,7,9,13};
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }

    public void max(int []array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
                if(array[i]>max){
                    max=array[i];
                }
        }
        System.out.print(max);
    }
        public void arList(){
            for(int i=1;i<=255;i++){
                if(i%2!=0){
                    oddNum.add(i);
                }
            }
            for(int j=0;j<oddNum.size();j++){
                System.out.println(oddNum.get(j));
            }
        }

    public void avgarray(int [] arr){
        int sum=0;
        int avg; // average
        // iterate through an array
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; // add every number in array
        }
        avg=sum/arr.length;
        System.out.println(avg);
    }
        public int greaterThan(int [] arr,int y){
            int counter=0;
            for (int i=0;i<arr.length;i++){
                if(arr[i]>y){
                    counter+=1;
                }
            }
            return counter;
        }

        public void multiply(int [] x){
            for(int i=0;i<x.length;i++){
                x[i]=x[i]*x[i];
            }
            for(int j=0;j<x.length;j++){
                System.out.println(x[j]);
            }
        }
        public void elimate(int [] array){
            for(int x :array){
                if(x<0){
                    x=0;
                }
                System.out.println(x);
            }
        }
        // public String max(int []array){
        //     int max=array[0];
        //     int min=array[0];
        //     int avg;
        //     int sum=array[0];;
        //     for(int i=1;i<array.length;i++){
        //             if(array[i]>max){
        //                 max=array[i];
        //             }
        //             else if (array[i]<min){
        //                 min=array[i];
        //             }
        //             sum+=array[i];
        //     }
        //     avg=sum/array.length;
        //     int[] newarr={max,min,avg};
        //     return Arrays.toString(newarr);
        // }
    }