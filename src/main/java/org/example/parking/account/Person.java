package org.example.parking.account;

public abstract class Person
{
    Address address;
    String name;
    String phoneNumber;
    String email;

    public abstract void resetPassword();
}
