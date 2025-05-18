package com.loosecoupling.convert.springinversioncontrol;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "New Database in action";
    }
}
