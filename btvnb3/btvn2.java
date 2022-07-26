package btvnb3;

import java.util.Locale;
import java.util.Scanner;

public class btvn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao mot chuoi ky tu: ");
        String s = scanner.nextLine();
        System.out.print("Xoa dau cach thua: ");
        String s1 = s.trim().replaceAll("\\s+"," ");
        System.out.println(s1);
        String[] arr = s1.split(" ");
        s1 = "";
        for( int i = 0; i < arr.length; i++) {
            s1 += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        System.out.println("Chuoi sau khi chuyen doi: " + s1);
        System.out.print("Xoa cac so co trong chuoi: ");
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)>='0' && s1.charAt(i)<='9'){
                s1 = s1.replace(String.valueOf(s1.charAt(i)), " ");
            }
        }
        System.out.println(s1);
    }
}
