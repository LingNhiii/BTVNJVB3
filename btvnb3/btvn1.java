package btvnb3;

import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.sqrt;
//import java.util.*;

public class btvn1 {
    public static void sum(int a[], int n){
        int sum=0, count=0;
        for(int i=0; i<n; i++){
            if(a[i]%2==1 && i%2==0){
                sum += a[i];
                count++;
            }
        }
        if(count==0){
            System.out.println("Khong co so le o vi tri chan!");
        }
        else {
            System.out.println("Trung binh cong cac so le o vi tri chan: " + sum/count);
        }
    }
    public static void min(int a[], int n){
        int min = a[0];
        int index;
        for(int i=0; i<n; i++){
            if(a[i] < min){
                min=a[i];
                index=i;
            }
        }
        System.out.printf("Min= " + min + " Vi tri cac so nho nhat trong mang la: ");
        for (int i=0; i<n; i++){
            if(a[i]==min){
                System.out.printf(i+1 + " ");
            }
        }
    }
    public static boolean test(int n) {
        int sqr = (int) Math.sqrt(n);
        if (Math.pow(sqr, 2) == n) {
            return true;
        } else
            return false;
    }
    public static void sqareNumber(int a[], int n){
        int count=0;
        for(int i=0; i<n; i++){
            if(test(a[i])) {
                System.out.printf(a[i] + " ");
                count++;
            }
        }
        if(count == 0){
            System.out.println("Khong co so chinh phuong");
        }
    }
    public static boolean primeNumber(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0)
                    return false;
            return true;
        }
    }

    public static void displayPrime(int[] a, int n) {
        boolean ktra = false;
        for (int i = 0; i < n; i++)
            if (primeNumber(a[i])) {
                ktra = true;
                break;
            }
        if (ktra) {
            for (int i = 0; i < n; i++)
                if (primeNumber(a[i]))
                    System.out.printf(a[i] + " ");
            System.out.println();
        } else
            System.out.println("Trong mang khong co so nguyen to");
    }
    public static void sort(int a[], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        int a[] = new int [n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        } //nhập mảng
        for (int i=0; i<n; i++){
            System.out.println(a[i] + " ");
        } //xuất mảng
        sum(a,n);
        min(a,n);
        System.out.println();
        System.out.printf("Cac so chinh phuong trong mang: ");
        sqareNumber(a,n);
        System.out.println();
        System.out.printf("So nguyen to co trong mang: ");
        displayPrime(a,n);
        System.out.println("Mang sau khi sap xep tang dan: ");
        sort(a,n);
        for (int i=0; i<n; i++){
            System.out.printf(a[i] + " ");
        }
    }
}
