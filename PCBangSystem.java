import java.util.Scanner;

public class PCBangSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 🎮 PC방 메뉴판 ===");
        System.out.println("- 라면 : 3000원");
        System.out.println("- 콜라 : 2000원");
        System.out.println("===========================");

        System.out.print("주문할 음식 이름을 입력하세요: ");
        String orderName = sc.next();

        if (orderName.equals("라면") || orderName.equals("콜라")) {
                System.out.println("주문이 완료되었습니다.");
        }

    }
}