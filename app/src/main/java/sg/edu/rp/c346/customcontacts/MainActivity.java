package sg.edu.rp.c346.customcontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;
    ArrayList<ContactsItem> alContactsList;
    CustomAdapter caContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.lvCustomContacts);

        alContactsList = new ArrayList<>();

        ContactsItem con1 = new ContactsItem("Mary", "+65", 65442334);
        ContactsItem con2 = new ContactsItem("Ken","+65" ,97442437);

        alContactsList.add(con1);
        alContactsList.add(con2);

        caContacts = new CustomAdapter(this, R.layout.contacts_item, alContactsList);

        lvContacts.setAdapter(caContacts);

    }
}
