import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz");
        int size= scanner.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            System.out.println((i+1)+".sayıyı giriniz");
            arr[i]= scanner.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i=0;i<size;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        for (int i=0;i<size;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("en büyük sayı:"+max);
        System.out.println("en küçük sayı:"+min);
    }
}