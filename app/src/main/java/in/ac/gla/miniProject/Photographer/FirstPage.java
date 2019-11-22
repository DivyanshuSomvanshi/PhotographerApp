package in.ac.gla.miniProject.Photographer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ProgressBar;

public class FirstPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        Boolean isFirstTime;


        SharedPreferences app_preferences = PreferenceManager
                .getDefaultSharedPreferences(FirstPage.this);


        SharedPreferences.Editor editor = app_preferences.edit();

        isFirstTime = app_preferences.getBoolean("isFirstTime", true);


        if (isFirstTime) {

            Intent intent = new Intent(FirstPage.this,MainActivity.class);
            startActivity(intent);

//implement your first time logic
            editor.putBoolean("isFirstTime", false);
            editor.commit();

        }else{

            Intent intent = new Intent(FirstPage.this,SplashScreen.class);
            startActivity(intent);
//app open directly
        }
    }
}
