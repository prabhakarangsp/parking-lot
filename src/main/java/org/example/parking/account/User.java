package org.example.parking.account;

public class User
        extends Person
{
    @Override
    public void resetPassword()
    {
        if (super.email != null)
        {
            System.out.println("Sent email to the configured email address. " + super.email);
        }
        else
        {
            System.out.println(
                    "Email is not given during account creation. Please contact your administrator to reset password..");
        }
    }
}
