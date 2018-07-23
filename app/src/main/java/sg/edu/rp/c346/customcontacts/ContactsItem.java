package sg.edu.rp.c346.customcontacts;

/**
 * Created by 16019623 on 23/7/2018.
 */

public class ContactsItem {

    private String name;
    private String country;
    private int number;

    public ContactsItem(String name, String country, int number) {
        this.name = name;
        this.country = country;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ContactsItem{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", number=" + number +
                '}';
    }
}
