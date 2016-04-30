package app.com.example.android.identity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void aadharcard(View view){
        Intent aadhar_card = new Intent(this, aadharcard.class);
        startActivity(aadhar_card);
    }

    public void pancard(View view){
        Intent pan_card = new Intent(this, pancard.class);
        startActivity(pan_card);
    }

    public void passport(View view) {
        Intent pass_port = new Intent(this, passport.class);
        startActivity(pass_port);
    }

    public void voterid(View view) {
        Intent voter_id = new Intent(this, voterid.class);
        startActivity(voter_id);
    }

    public void dlicense(View view) {
        Intent driving_license = new Intent(this, dlicense.class);
        startActivity(driving_license);
    }

}
