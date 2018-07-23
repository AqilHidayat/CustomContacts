package sg.edu.rp.c346.customcontacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16019623 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ContactsItem> contactList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactsItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCountry = rowView.findViewById(R.id.textViewCountry);
        TextView tvNum = rowView.findViewById(R.id.textViewNumber);

        ContactsItem curItem = contactList.get(position);

        String name = curItem.getName();
        String country = curItem.getCountry();
        int num = curItem.getNumber();

        tvName.setText(name);
        tvCountry.setText(country);
        tvNum.setText(String.valueOf(num));

        return rowView;
    }
}
