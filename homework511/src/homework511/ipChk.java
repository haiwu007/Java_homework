package homework511;

import java.util.Scanner;

public class ipChk {
    static final int MASK_A = 0b10000000;
    static final int MASK_B = 0b01000000;
    static final int MASK_C = 0b00100000;
    static final int MASK_D = 0b00010000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainLoop:while (true) {
            String str = sc.next();
            if (str.equals("-exit")) {
                sc.close();
                return;
            }
            String ipStr[] = str.split("\\.", 4);
            if (ipStr.length != 4) {
                System.out.println("ip地址非法：长度非4，为" + ipStr.length);
                continue mainLoop;
            }
            int ip[] = new int[4];
            for(int i = 0; i < 4; i++){
                ip[i] = Integer.valueOf(ipStr[i]).intValue();
                if (ip[i] > 255 || ip[i] < 0) {
                    System.out.println("ip地址非法：ip地址超限，第" + (i + 1) + "个地址为" + ip[i]);
                    continue mainLoop;
                }
            }
            if ((ip[0] & MASK_A)==0) {
                System.out.println("ip地址合法，为A类地址");
                continue mainLoop;
            }
            else if ((ip[0] & MASK_B)==0) {
                System.out.println("ip地址合法，为B类地址");
                continue mainLoop;
            }
            else if ((ip[0] & MASK_C)==0) {
                System.out.println("ip地址合法，为C类地址");
                continue mainLoop;
            }
            else if ((ip[0] & MASK_D)==0) {
                System.out.println("ip地址合法，为D类地址");
                continue mainLoop;
            }
            else{
                System.out.println("ip地址合法，为E类地址");
                continue mainLoop;
            }
        }
    }
}
