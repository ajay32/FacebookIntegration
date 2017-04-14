package com.hackingbuzz.facebookintegration;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


// we just taking an activity LoginActivity...on that...we calling a fragment on on Create.....

public class LoginActivity extends AppCompatActivity {

    private com.facebook.login.widget.LoginButton loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FragmentManager  fragmentManager = getSupportFragmentManager();

        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);  // so he trying to get fragment..if there one is present on activity layout...if not that we will put our won fragment...it is just for checking purpose..


        if (fragment == null) {
            fragment = new FacebookFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment)     // doing transcation with its tag..coz we just using one fragment ..n we not gonna need to find this fragment again in future..
                    .commit();
        }

    }
}
