package com.pgz.agile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnLongClick;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.subtitle)
    TextView subtitle;
    @BindView(R.id.hello)
    Button hello;
    @BindView(R.id.list_of_things)
    ListView listOfThings;
    @BindView(R.id.footer)
    TextView footer;

    @BindString(R.string.app_name)
    String butterKnife;
    @BindString(R.string.field_method)
    String fieldMethod;
    @BindString(R.string.by_jake_wharton)
    String byJakeWharton;
    @BindString(R.string.say_hello)
    String sayHello;

    @BindViews({R.id.title, R.id.subtitle, R.id.hello})
    List<View> headerViews;

    private SimpleAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        title.setText(butterKnife);
        subtitle.setText(fieldMethod);
        footer.setText(byJakeWharton);
        hello.setText(sayHello);

        adapter = new SimpleAdapter(this);
        listOfThings.setAdapter(adapter);
    }

    @OnClick(R.id.hello)
    public void onHelloClicked() {
        Toast.makeText(this, "Hello, views!", LENGTH_SHORT).show();
    }

    @OnLongClick(R.id.hello)
    public boolean sayGetOffMe() {
        Toast.makeText(this, "Let go of me!", LENGTH_SHORT).show();
        return true;
    }

    @OnItemClick(R.id.list_of_things)
    void onItemClick(int position) {
        Toast.makeText(this, "You clicked: " + adapter.getItem(position), LENGTH_SHORT).show();
    }

}
