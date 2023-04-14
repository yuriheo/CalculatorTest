package org.example.customer;

import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems;
    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 메뉴를 전달하면 메뉴에 대한 객체를 반환
    public MenuItem choose(String name) {
        return this.menuItems.stream()
                .filter(menuItem -> menuItem.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 메뉴 이름입니다."));
    }


}
