package com.problema1;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
        //A method that checks if a number is Odd or Even
        static void checkOddEven (){
                System.out.println("A method that checks if a number is Odd or Even");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int number=input.nextInt();
                if (number % 2 == 0) System.out.println("Even Number");
                else System.out.println("Odd Number");
                System.out.println("Bye!");
        }


        //A method that produce the average sum of a 100 consecutive numbers
        static void sumAverageInt() {
                System.out.println("A method that produce the average sum of a 100 consecutive numbers");
                int n=100;
                System.out.println("The sum is: "+n*(n+1)/2);
                System.out.println("The average is: "+(float)(n+1)/2);
        }


        //A method who checks if a number is a perfect square
        static void perfectSquare()
        {
                System.out.println("A method who checks if a number is a perfect square");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int num=input.nextInt();
                if(sqrt(num)==(int)sqrt(num)) System.out.println(num+" Is a Perfect Square");
                else System.out.println(num+ " Is NOT a Perfect Square.");
        }


        //A method that calculates the sum, product, minimum and maximum of 3 numbers
        static void sumProductMinMax()
        {
                System.out.println("A method that calculates the sum, product, minimum and maximum of 3 numbers");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the first, the second and the third number: ");
                int first = input.nextInt();
                int second = input.nextInt();
                int third = input.nextInt();
                int sum=first+second+third; System.out.println("Sum is: "+sum);
                int product=first*second*third; System.out.println("Product is "+product);

                if(first+second>second+third)
                        if(first>second) System.out.println("Maximum is "+first);
                        else System.out.println("Maximum is " +second);
                else
                if(third>second) System.out.println("Maximum is "+third);
                else System.out.println("Maximum is " +second);

                if(first+second<second+third)
                        if(first<second) System.out.println("Minimum is "+first);
                        else System.out.println("Minimum is " +second);
                else
                if(third<second) System.out.println("Minimum is "+third);
                else System.out.println("Minimum is " +second);
        }


        //A method that reverses a number
        static void reverseNum(){
                System.out.println("A method that reverses a number");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int number = input.nextInt();
                int reverse=0;
                while(number>0) {
                        reverse=reverse*10+number%10;
                        number/=10;
                }
                System.out.println("Reversed number is:" +reverse);
        }



        //A method who counts the Vowels and the Digits in an array
        static void countVowelsDigits() {
                System.out.println("A method who counts the Vowels and the Digits in an array");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the text:");
                String text = input.next();
                int k=0;
                for(int i=0; i<text.length();++i) {
                        char a = text.charAt(i);
                        if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0')
                                k++;
                }
                System.out.println("The number is: "+k);
        }


        //A method that reads an array from keyboard
        static void readArray(int[] array, int n)
        {
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the elements of the array: ");
                for(int i=1; i<=n; i++)
                {
                        array[i]=input.nextInt();
                }
        }
        //A method that displays an array
        static void showArray(int[] array, int n)
        {
                for(int i=1; i<=n; i++)
                {
                        System.out.println(array[i] + " ");
                }
        }



        //A method that inserts an element to a specific position into an array
        static void insertElem(){
                System.out.println("//A method that inserts an element to a specific position into an array");
                Scanner input=new Scanner(System.in);
                int n;
                System.out.print("Enter the number of elements you want to store: ");
                n=input.nextInt();
                int[] array = new int[50];
                readArray(array, n);
                System.out.print("Enter the element you want to insert: ");
                int element = input.nextInt();
                System.out.println("Enter the position of which you would like the object to be inserted: ");
                int position = input.nextInt();
                for(int i=n;i>=position;--i)
                {
                        array[i+1]=array[i];
                }
                n++;
                array[position]=element;
                showArray(array,n);
        }


        //A method that removes the occurrences of a given element
        static void removeOccurences()
        {
                System.out.println("A method that removes the occurrences of a given element");
                Scanner input=new Scanner(System.in);
                int n;
                System.out.print("Enter the number of elements you want to store: ");
                n=input.nextInt();
                int[] array = new int[50];
                readArray(array, n);
                System.out.print("Enter the element to remove it's occurrences: ");
                int element = input.nextInt();
                for(int i=n; i>0;--i)
                {
                        if(array[i]==element)
                        {
                                for(int j=i; j<=n;++j)
                                {
                                        array[j]=array[j+1];
                                }
                                n--;
                        }
                }
                showArray(array, n);
        }


        //A method that sorts an array using bubbleSort
        static void bubbleSort()
        {
                System.out.println("A method that sorts an array using bubbleSort");
                Scanner input=new Scanner(System.in);
                int n;
                System.out.print("Enter the number of elements you want to store: ");
                n=input.nextInt();
                int[] array = new int[50];
                readArray(array, n);
                for(int i=0;i<n;++i)
                {
                        if(array[i]>array[i+1])
                        {
                                int copy = array[i];
                                array[i]=array[i+1];
                                array[i+1]=copy;
                                i=0;

                        }
                }
                showArray(array,n);
        }


        //A method that cmpute the average sum of an array without the maxim and minimum values
        static void computeAverageNoMinMax()
        {
                System.out.println("A method that compute the average sum of an array without the maximum and minimum values");
                Scanner input = new Scanner(System.in);
                int n;
                System.out.print("Enter the number of elements you want to store: ");
                n=input.nextInt();
                int[] array = new int[50];
                readArray(array, n);
                int min=array[1], max=array[1], sum=0, cmin=0, cmax=0;
                for(int i=1;i<=n;++i)
                {
                        if(min>array[i])
                        {
                               min=array[i];
                                cmin=0;
                        }
                        if(max<array[i])
                        {
                                max=array[i];
                                cmax=0;
                        }
                        if(min==array[i])
                        {
                                cmin++;
                        }
                        if(max==array[i])
                        {
                                cmax++;
                        }
                        sum+=array[i];
                }
                sum=sum-min*cmin-max*cmax;
                float average=(float)sum/(n-cmin-cmax);
                System.out.println("The average of the remaining elements is: "+average);
        }




        public static void main(String[] args) {


                //A call to checkOddEven method
                checkOddEven();

                //A call to sumAverageInt method
                sumAverageInt();

                //A call to perfectSquare method
                perfectSquare();

                //A call to sumPruductMinMax method
                sumProductMinMax();

                //A call to reverseNum method
                reverseNum();

                //A call to countVowelsDigits method
                countVowelsDigits();

                //A call to insertElem method
                insertElem();

                //A call to removeOccurences method
                removeOccurences();

                //A call to bubbleSort method
                bubbleSort();

                //A call to computeAverageNoMinMax method
                computeAverageNoMinMax();
        }
}