import java.util.Scanner;
import java.util.ArrayList;

public class PCBangSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuItem ramen = new MenuItem("라면", 3000);
        MenuItem cola = new MenuItem("콜라", 2000);

        Order myOrder = new Order(1, new ArrayList<MenuItem>());

        System.out.println("PC방 메뉴판");
        System.out.println("1. 라면 : 3000원");
        System.out.println("2. 콜라 : 2000원");

        System.out.print("주문할 음식 이름을 입력하세요! : ");
        String orderName = sc.next();

        if (orderName.equals("라면")) {
            myOrder.addMenu(ramen);
            System.out.println("주문이 완료되었습니다!");
            System.out.println("결제할 금액: " + myOrder.calculateTotal() + "원");
        }
        if (orderName.equals("콜라")) {
            myOrder.addMenu(cola);
            System.out.println("주문이 완료되었습니다!");
            System.out.println("결제할 금액: " + myOrder.calculateTotal() + "원");
        }
    }
}