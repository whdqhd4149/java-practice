package day09;

public class Review_day08 {
    public static void main(String[] args){

        Stock stock1 = new Stock();
        Stock stock2 = new Stock();

        stock1.name = "삼성전자";
        stock1.buyPrice = 70000;
        stock1.currentPrice = 80000;
        stock1.quantity = 10;

        stock2.name = "SK하이닉스";
        stock2.buyPrice = 150000;
        stock2.currentPrice = 140000;
        stock2.quantity = 5;

        System.out.println("종목명: " + stock1.name);
        System.out.println("총 매수금액: " + stock1.buyPrice * stock1.quantity + "원");
        System.out.println("총 평가금액: " + stock1.currentPrice * stock1.quantity + "원");
        System.out.println("보유 수량: " + stock1.quantity + "주");
        System.out.println("평가손익: " + (stock1.currentPrice - stock1.buyPrice) * stock1.quantity + "원");
        System.out.println("수익률: " + (double)(stock1.currentPrice - stock1.buyPrice) / stock1.buyPrice * 100 + "%");
        System.out.println();
        System.out.println("종목명: " + stock2.name);
        System.out.println("총 매수금액: " + stock2.buyPrice * stock2.quantity + "원");
        System.out.println("총 평가금액: " + stock2.currentPrice * stock2.quantity + "원");
        System.out.println("보유 수량: " + stock2.quantity + "주");
        System.out.println("평가손익: " + (stock2.currentPrice - stock2.buyPrice) * stock2.quantity + "원");
        System.out.println("수익률: " + ((double)(stock2.currentPrice - stock2.buyPrice) / stock2.buyPrice * 100) + "%");


    }


}
