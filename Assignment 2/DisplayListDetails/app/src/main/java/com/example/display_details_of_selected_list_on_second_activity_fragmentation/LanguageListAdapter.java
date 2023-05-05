package com.example.display_details_of_selected_list_on_second_activity_fragmentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LanguageListAdapter extends BaseAdapter {

    String[] languageNameList;
    Context context;

    LayoutInflater inflater;

    LanguageListAdapter(Context context, String[] languageNameList){
        this.context = context;
        this.languageNameList = languageNameList;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return languageNameList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.ui_text_view, null);

        TextView textView = view.findViewById(R.id.ui_text_view);

        textView.setText(languageNameList[i]);

        return view;
    }
}
