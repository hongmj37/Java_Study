package Mon;

public class elect {
    public static void main(String[] args) {
        System.out.println("=".repeat(30));
        System.out.println("   주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(30));

        double result=0;
        double[] kwh = {99, 150, 250,301,450};

        for (int i=0; i<kwh.length; i++) {
            if (kwh[i] <= 100) {
                result =  kwh[i]* 60.7;
            } else if (kwh[i] > 100) {
                result = 100 * 125.9 + (kwh[i] - 100) * 60.7;
            } else if (kwh[i] > 200) {
                result = 200 * 125.9 + (kwh[i] - 200) * 60.7;
            } else if (kwh[i] > 300) {
                result = 300 * 125.9 + (kwh[i] - 300) * 60.7;
            } else if (kwh[i] > 400) {
                result = 400 * 125.9 + (kwh[i] - 400) * 60.7;
            } else if (kwh[i] > 500) {
                result = 500 * 125.9 + (kwh[i] - 500) * 60.7;
            } else {
                System.out.println("다시 하세요");
            }
            System.out.println(kwh[i] + "kWh의 전기요금은 " +result+"원 입니다.");
        }
    }
}
