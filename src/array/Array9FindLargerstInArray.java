package array;

import java.util.Scanner;

public class Array9FindLargerstInArray {

	public static void main(String[] args) {
		
		//ask user enter how many items in array
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many items in Array");
				int count =input. nextInt();
		
				//create ARRAY CALLED NUMS WITH THAT CAPACITY
				
				int[] nums = new int [count];    //when we didn't do assignment it gave us default value zero
				System.out.println(nums[0]);
				
				//using a loop enter values one by one
				
				for (int i=0; i <count ; i++) {
					
					System.out.println("Enter number" + (i+1));  //bu sekilde girilen sayi ne ise o kadar sayi girerek deger aliyoruz.
					                                    //i +1 koyma sebebimiz soruyu 1 2 3 diye sormak , i sifir oldugu icinde +1 koyduk
					nums [i]= input.nextInt();
				}
				
				for(int n :nums) {       //burada da aldigimiz degerleri yazdirdik
					System.out.print(n + " ");
				}
				//iterate the array and find the largest value
				
				int largest = nums[0];   //assume that first one is largest
				//lopp through the rest anc check if thay are greater than valur of largest
				//if true--> assign that value into largest after the loop
				
				for (int num : nums) {
					if (num > largest) {
						largest =num;
					}
				}
				System.out.println();
				System.out.println("largest value: " + largest);
				
	}
}
