package 프로그래머스.레벨1;

public class pro2 {
    public static void main(String[] args) {
        String phone_number = "027778888";
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++){
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4,phone_number.length());
        System.out.println(answer);
    }
}
