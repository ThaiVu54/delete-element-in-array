import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        int n, X;
        Scanner sc = new Scanner(System.in);

        //todo nhap so luong phan tu trong mang
        do {
            System.out.print("nhap so phan tu cua mang: ");
            n = sc.nextInt();
        } while (n <= 0);
        int[] arr = new int[n];

        //todo nhap gia tri cac phan tu trong mang
        System.out.println("Nhap cac phan tu cho mang");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        //todo hien thi mang vua nhap
        System.out.println("mang ban dau: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + "\t");
        }

        //todo nhap so nguyen k can xoa
        Scanner sc1 = new Scanner(System.in);
        System.out.print("\nnhap so nguyen can xoa: ");

        //todo tim vi tri phan tu muon xoa
        X = sc1.nextInt();
//        int d = 0;
//        int c = n - 1;
//        int l;
//        while (d <= c) {
//            l = (d + c) / 2;
//            if (arr[l] == X) {
//                System.out.println("Tìm thấy phần tử " + X + " tại vị trí " + l);
////                return;
////            } else if (arr[l] < X) {
////                d = l + 1;
////            } else {
////                c = l - 1;
//            } else
//            System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
//            break;
//        }

        //todo in ra mang moi sau khi xoa
        int count = 0;
        for (int i = 0; i<n;i++){
            if(arr[i] != X){
                arr[count] = arr[i];
                count++;
            }
        }
        n = count;
        System.out.println("mang sau khi xoa "+X+" : ");
        for (int i = 0; i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}


