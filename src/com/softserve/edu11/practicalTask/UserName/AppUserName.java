package com.softserve.edu11.practicalTask.UserName;

import com.softserve.edu06.practicalTasks.car.UserEnter;

public class AppUserName {
    public static void main(String[] args) {
        UserName newUser = new UserName();
        newUser.printUserInfo();

        UserName user1 = new UserName("Yatsun", "Inna", "Oleksandrivna");
        UserName user2 = new UserName("Ivanov", "Ivan11", "Ivanovych_");
        UserName user3 = new UserName("Ivanov", "Ivan11", "IvanovychIvanovych$");
        UserName user4 = new UserName("Iv", "Ivan11", "Ivanovych");
        UserName user5 = new UserName("Iv", "Ivan11", "IvanovychIvanovych^");

        user1.checkUserName();
        user2.checkUserName();
        user3.checkUserName();
        user4.checkUserName();
        user5.checkUserName();
    }
}
