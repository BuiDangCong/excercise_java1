import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class hello2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       boolean check = true;
      while(check){
       System.out.println("1.Kiểm tra 1 số nhập từ bàn phím có nằm trong mảng hay không");
       System.out.println("2.In ra bảng cửu chương");
       System.out.println("3.Tính giai thừ của 1 số bất kì nhập từ bàn phím");
       System.out.println("4.In ra phần tử nằm trong mảng này nhưng không nằm trong mảng kia");
       System.out.println("5.Thoát chương trình");
       int select = Integer.parseInt(sc.nextLine());
       switch(select){
        case 1 :
        System.out.println("Bạn đã chọn chức năng 1");
        checkNumber();
         break;
        case 2 :
        System.out.println("Bạn đã chọn chức năng 2");
        nine_Chapters();
         break;
        case 3 :
        System.out.println("Bạn đã chọn chức năng 3");
        factorial();
         break;
        case 4 :
        System.out.println("Bạn đã chọn chức năng 4");
        compare_Array();
         break;
         case 5 :
         System.out.println("Thoát chương trình");
         check=false;
        default:
        System.out.println("vui lòng nhập từ 1-4");
         break;
       }
      }

    }

    public static void checkNumber() {
        //  Khai báo mảng 4 phần tử
        int arrNumber[] = new int[4];
        arrNumber[0]=6; 
        arrNumber[1]=7; 
        arrNumber[2]=8; 
        arrNumber[3]=9;
        // Nhập vào 1 số 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số");
        int numBer_input = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (int i = 0; i < arrNumber.length; i++) {
            if(arrNumber[i]== numBer_input){
                System.out.println("có tồn tại");
                flag = true;
            }

        }
        if(!flag){
            System.out.println("Không tồn tại");
        }

       }
        public static void nine_Chapters(){
        for (int i = 2; i <= 9; i++) {
             System.out.printf("Bảng cửu chương %d \n ", i);
            for (int j = 1; j < 10; j++) {
              System.out.printf("%d * %d =%d \n", i, j, (i * j)); }
             }
            
        }
        public static void factorial (){
             // nhập vào một số
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập vào một số");
       int number = scanner.nextInt();
       long tich = 1;
       for (int i = number; i > 0; i--) {
           tich *= i;
       }
       System.out.println("giai thừa của số vừa nhập:" + tich);
       }
       public static void compare_Array(){
        int arrNumber1 [] = new int[4];
        arrNumber1[0]=1;
        arrNumber1[1]=2;
        arrNumber1[2]=3;
        arrNumber1[3]=5;
        int arrNumber2 [] = new int[4];
        arrNumber2[0]=1;
        arrNumber2[1]=2;
        arrNumber2[2]=3;
        arrNumber2[3]=6;
        boolean flag = true;
        for (int i = 0; i < arrNumber1.length; i++) {
            for (int j = 0; j < arrNumber2.length; j++) {
                if(arrNumber1[i]== arrNumber2[j]){
                    flag = true;
                    break;
                }else if(arrNumber1[i]!=arrNumber2[j]){
                   flag = false;
                }
            }if(!flag){
                System.out.println("số không tồn tại trong mảng 2 là : "+ arrNumber1[i]);
            }
        }


       }

}

