import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int soma = 0;
        int cont = 1;


        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < arr.length; i++){
            if(i == 1){
                soma = arr[1] - arr[0];
            }

            if (arr[i] - arr[i-1] != soma) {
                soma = arr[i] - arr[i-1];
                cont++;
            }
        }

        System.out.println(cont);
        sc.close();
    }
}
