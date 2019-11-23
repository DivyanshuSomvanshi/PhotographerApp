package in.ac.gla.miniProject.Photographer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatActivity;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Boolean isFirstTime;


        SharedPreferences app_preferences = PreferenceManager
                .getDefaultSharedPreferences(Main5Activity.this);


        SharedPreferences.Editor editor = app_preferences.edit();

        isFirstTime = app_preferences.getBoolean("isFirstTime", true);


        if (isFirstTime) {

            Intent intent = new Intent(Main5Activity.this, Login.class);
            startActivity(intent);

//implement your first time logic
            editor.putBoolean("isFirstTime", false);
            editor.commit();

        } else {

            Intent intent = new Intent(Main5Activity.this, Main2Activity.class);
            startActivity(intent);
//app open directly
        }
    }
}

