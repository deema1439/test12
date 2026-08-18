import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

//     Q1 Write a Java program that accept three numbers from the user and print the largest number .


//        System.out.println("enter a number 1 :");
//        int n1=s.nextInt();
//        int largest=n1;
//        System.out.println("enter a number 2 :");
//        int n2=s.nextInt();
//        System.out.println("enter a number 3 : ");
//        int n3=s.nextInt();
//        if(n2>largest){
//          largest=n2;
//        }
//        if(n3>largest){
//            largest=n3;
//        }
//        System.out.println("the largest number is:"+largest);

        //Q2 Write a Java program that accept a String and a number from the user, then print the character at the given index( the number)
//        s.nextLine();
//        System.out.println("enter a word please :");
//        String word=s.nextLine();
//        System.out.println("enter a number :");
//        int number=s.nextInt();
//        char wanted=word.charAt(number);
//        System.out.println("the character is: "+ wanted );

        //Q3 Write a Java program that allows the user to enter numbers repeatedly until they choose to stop, then displays the total sum of all entered numbers.
//        int sum=0;
//        char stop='y';
//        do{
//            System.out.println("enter y to stop:");
//            stop=s.next().charAt(0);
//            if(stop=='y'){
//                break;
//            }
//            System.out.println("enter the numbers : ");
//            int num=s.nextInt();
//            sum+=num;
//
//        }while (stop!='y');
//
//        System.out.println("the sum is : "+sum);


        //Q4 Write a Java program to determine whether each number in a given array is positive or negative.
//        ArrayList <Integer> list=new ArrayList<>();
//        System.out.println("enter the size of an array:");
//        int size=s.nextInt();
//        System.out.println("enter the elements : ");
//        for(int i=0;i<size;i++){
//            System.out.println("element "+(i+1)+":");
//            int elements=s.nextInt();
//            list.add(elements);
//        }
//
//        for(int i=0;i<size;i++){
//
//            if(list.get(i)>0){
//                System.out.println(list.get(i)+" is a positive");
//            } else if (list.get(i)<0) {
//                System.out.println(list.get(i)+" is negative ");
//            }else {
//                System.out.println(list.get(i)+" is zero ");
//            }
//
//        }


//   Q4:for fixed array :

//        ArrayList <Integer> fixed =new ArrayList<>();
//        fixed.add(10);
//        fixed.add(-21);
//        fixed.add(30);
//        fixed.add(31);
//        fixed.add(-25);
//
//        for (int i=0;i< fixed.size();i++){
//            if(fixed.get(i)>0){
//                System.out.println(fixed.get(i)+" is a positive");
//            }else if (fixed.get(i)<0) {
//                System.out.println(fixed.get(i)+" is negative ");
//            }else {
//                System.out.println(fixed.get(i)+" is zero ");
//            }
//        }

        //Q5 Write a Java program to find the shortest word in a given array of strings

//        ArrayList <String>array=new ArrayList<>();
//        array.add("Tuwaiq");
//        array.add("Bootcamp");
//        array.add("student");
//        array.add("java");
//        System.out.println(array);
//        int shortest= array.get(0).length();
//        for(int i=0;i< array.size();i++){
//            if (array.get(i).length()<shortest){
//                shortest=array.get(i).length();
//            }
//        }
//        System.out.println("the shortest is: "+array.get(shortest-1));



    }
}
