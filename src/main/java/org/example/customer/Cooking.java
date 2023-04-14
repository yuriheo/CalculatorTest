package org.example.customer;

public class Cooking {

    public Cook makeCook(MenuItem menuItem) {
        // 요리사는 메뉴를 받아서 요리를 함
        Cook cook = new Cook(menuItem);
        return cook;
    }
}
