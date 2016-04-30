package app.com.example.android.identity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class pancard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void pan_services(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tin.tin.nsdl.com/pan/"));
        startActivity(browserIntent);
    }

    public void form_49a(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tin.tin.nsdl.com/pan2/servlet/NewPanApp"));
        startActivity(browserIntent);
    }
}
