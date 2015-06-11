package sim.n.chip.posreader;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kfraser on 11/06/2015.
 */
public class IsoDepAdapter extends BaseAdapter{

    private LayoutInflater layoutInflater;
    private List<String> messages = new ArrayList<String>(100);
    private int messageCounter;

    public IsoDepAdapter(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
    }

    public void addMessage(String message) {
        messageCounter++;
        messages.add("Message [" + messageCounter + "]: " + message);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return messages == null ? 0 : messages.size();
    }

    @Override
    public Object getItem(int i) {
        return messages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        }
        TextView view = (TextView)convertView.findViewById(android.R.id.text1);
        view.setText((CharSequence)getItem(i));
        return convertView;

    }
}
