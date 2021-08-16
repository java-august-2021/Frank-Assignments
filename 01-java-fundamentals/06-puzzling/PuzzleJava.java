import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJava {
    Random rn = new Random();
    ArrayList <Character> alpha=new ArrayList<Character>();
    ArrayList <Character> outPut=new ArrayList<Character>();

    public String array(){
        int [] arr;
        arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=rn.nextInt(20 - 1 + 1) + 1;
        }
        return Arrays.toString(arr);
    }

    public char letter(){
        for(char alphabet = 'a'; alphabet <='z'; alphabet++){
            alpha.add(alphabet);
        }
        int index = rn.nextInt(25);
        return alpha.get(index);
    }

    public String passWord(){
        String password="";
        for(int i=0;i<8;i++){
            password+=letter();
        }
        return password;
    }
    
    public String GetpassWord(int length){
        String [] outPut=new String[length];
        for(int i=0;i<outPut.length;i++){
            outPut[i]=passWord();
        }
        return Arrays.toString(outPut);
    }

    public void shiftarray(){
        int [] array={1,5,10,-2};
        int temp=array[0];
        for(int i=1;i<array.length;i++){
            array[i-1]=array[i];
        }
        array[array.length-1]=temp;
        System.out.println(Arrays.toString(array));
    }
}
