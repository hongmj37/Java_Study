package 프로그래머스.레벨1;

public class pro1 {
    public static void main(String[] args) {
                int n = 3;
                String answer = "";
                for(int i=0; i<n; i++){
                    if(i % 2 == 0){
                        answer += "수";
                    }
                    if(i % 2 == 1){
                        answer += "박";
                    }
                }
        System.out.println(answer);
            }
        }


