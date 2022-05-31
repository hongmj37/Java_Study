package code;

import java.util.ArrayList;
import java.util.Arrays;

public class Coin {
    public void coinFunc(Integer price, ArrayList<Integer> coinList){
        Integer totalCount = 0;
        Integer coinNum = 0;
        ArrayList<Integer> details = new ArrayList<Integer>();

        for(int index=0; index < coinList.size(); index++){
            coinNum = price / coinList.get(index);
            totalCount += coinNum;
            price -= coinNum * coinList.get(index);
            details.add(coinNum);
            System.out.println(coinList.get(index)+"원 : " + coinNum + "개" );
        }
        System.out.println("총 동전 수 : " + totalCount);
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        ArrayList<Integer> coinList = new ArrayList<Integer>(Arrays.asList(500,100,50,10));
        coin.coinFunc(9860, coinList);
    }
}
