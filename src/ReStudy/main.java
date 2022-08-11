package ReStudy;
public class main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("문자열 ").append("연결");
        String str = stringBuilder.toString();
        System.out.println(stringBuilder);   //결과: 문자열 연결
        System.out.println(str);  //결과: 문자열 연결
    }
}