package org.example.customer;

public class Customer {
    public void order(String menuName, Menu menu, Cooking cooking){
        MenuItem menuItem = menu.choose(menuName);
        // 메뉴에서 해당하는 메뉴가 잇으면 메뉴 아이템을 반환받음
        Cook cook  = cooking.makeCook(menuItem);
        // 요리사에게 요리를 전달함.


    }
}
