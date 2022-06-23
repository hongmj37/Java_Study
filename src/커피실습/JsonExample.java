package 커피실습;

public class JsonExample {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("카페라떼", "Caffe Latte", 4500);
        Gson gson = new Gson();
        String str = gson.toJson(coffee);
        System.out.println(str);
    }
}
