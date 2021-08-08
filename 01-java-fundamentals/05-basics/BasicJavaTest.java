public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava a=new BasicJava();
        int sum;
        a.num();

        a.odd();

        sum=a.sumOf();
        System.out.println(sum);

        a.array();
        int [] ar={1,-2,7,-8,94};
        a.max(ar);

        a.arList();

        //find the average of array item

        int [] array={2,10,3};
        a.avgarray(array);
        

        //find the number of greater than in array
        
        int [] array={2,10,3,5};
        System.out.println(a.greaterThan(array, 3));


    
        int [] array={2,10,3,5};
        a.multiply(array);
        


        //eliminate negative number
        int [] array={2,-10,3,-5};
        a.elimate(array);

        // int [] array={2,10,3,5};
        // System.out.println(a.max(array));

    }
}
