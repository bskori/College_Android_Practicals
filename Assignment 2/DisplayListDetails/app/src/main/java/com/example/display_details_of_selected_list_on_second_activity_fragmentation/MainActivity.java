package com.example.display_details_of_selected_list_on_second_activity_fragmentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] languageNameList = {
            "C","Clojure","C-Sharp","Dart","Elixir","F-Sharp","Html-5","Java","Javascript","Julia","Kotlin",
            "Laravel","Php","Python","R-Language","Ruby Rails", "Rust","Scala","Solidity","Svelte","Swift","TypeScript"
    };
    ListView languagesListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languagesListView =findViewById(R.id.languagesListView);

        LanguageListAdapter languageListAdapter = new LanguageListAdapter(getApplicationContext(), languageNameList);

        languagesListView.setAdapter(languageListAdapter);


    }
}