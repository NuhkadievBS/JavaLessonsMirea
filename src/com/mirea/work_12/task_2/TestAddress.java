package com.mirea.work_12.task_2;

public class TestAddress {
    public static void main(String[] args) {
        Address address1 = new Address();
        Address address2 = new Address(":");
        Address address3 = new Address(" ");
        Address address4 = new Address();

        address1.splitAddress("Russia,Moscow Oblast,Moscow,Arbat st.,5,1,17");
        address2.splitAddress("Russia:Moscow Oblast:Moscow:Arbat st.:5,1,17");
        address1.tokenizeAddress("Russia,Moscow Oblast,Moscow,Arbat st.,5,1,17");
        address2.tokenizeAddress("Russia,Moscow Oblast,Moscow,Arbat st.,5,1,17");

        address3.splitAddress("       ");
        boolean correctSplitAddress = address4.splitAddress("Russia,Novosibirsk Oblast,Novosibirsk,Lenin st,10,1,48");
        boolean correctTokenAddress = address4.tokenizeAddress("Russia,Novosibirsk Oblast,Novosibirsk,Lenin st,10,1,48");

        System.out.println(correctSplitAddress);
        System.out.println(correctTokenAddress);

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);

    }
}
