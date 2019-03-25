package com.example.bottomnavigationdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView idNbBottomNavigation;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idNbBottomNavigation = findViewById(R.id.idNbBottomNavigation);
        idNbBottomNavigation.setItemIconTintList(null);// to avoid tinting the menuItem Icon
        idNbBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.toString()) {
                    case "Home":
                        selectHome();
                        break;
                    case "Events":
                        selectExplore();
                        break;
                    case "Camera":
                        selectUpload();
                        break;
                    case "Notifications":
                        selectNotifications();
                        break;
                    case "My Stuff":
                        selectProfile();
                        break;
                }
                return true;
            }
        });

        selectHome();
    }

    private void selectHome() {
        idNbBottomNavigation.getMenu().getItem(0).setIcon(R.drawable.ic_home_active);
        idNbBottomNavigation.getMenu().getItem(1).setIcon(R.drawable.ic_search);
        idNbBottomNavigation.getMenu().getItem(2).setIcon(R.drawable.ic_upload);
        idNbBottomNavigation.getMenu().getItem(3).setIcon(R.drawable.ic_like);
        idNbBottomNavigation.getMenu().getItem(4).setIcon(R.drawable.ic_profile);
    }

    private void selectExplore() {
        idNbBottomNavigation.getMenu().getItem(0).setIcon(R.drawable.ic_home);
        idNbBottomNavigation.getMenu().getItem(1).setIcon(R.drawable.ic_search_active);
        idNbBottomNavigation.getMenu().getItem(2).setIcon(R.drawable.ic_upload);
        idNbBottomNavigation.getMenu().getItem(3).setIcon(R.drawable.ic_like);
        idNbBottomNavigation.getMenu().getItem(4).setIcon(R.drawable.ic_profile);
    }

    private void selectUpload() {
        idNbBottomNavigation.getMenu().getItem(0).setIcon(R.drawable.ic_home);
        idNbBottomNavigation.getMenu().getItem(1).setIcon(R.drawable.ic_search);
        idNbBottomNavigation.getMenu().getItem(2).setIcon(R.drawable.ic_upload_active);
        idNbBottomNavigation.getMenu().getItem(3).setIcon(R.drawable.ic_like);
        idNbBottomNavigation.getMenu().getItem(4).setIcon(R.drawable.ic_profile);
    }

    private void selectNotifications() {
        idNbBottomNavigation.getMenu().getItem(0).setIcon(R.drawable.ic_home);
        idNbBottomNavigation.getMenu().getItem(1).setIcon(R.drawable.ic_search);
        idNbBottomNavigation.getMenu().getItem(2).setIcon(R.drawable.ic_upload);
        idNbBottomNavigation.getMenu().getItem(3).setIcon(R.drawable.ic_like_active);
        idNbBottomNavigation.getMenu().getItem(4).setIcon(R.drawable.ic_profile);
    }

    private void selectProfile() {
        idNbBottomNavigation.getMenu().getItem(0).setIcon(R.drawable.ic_home);
        idNbBottomNavigation.getMenu().getItem(1).setIcon(R.drawable.ic_search);
        idNbBottomNavigation.getMenu().getItem(2).setIcon(R.drawable.ic_upload);
        idNbBottomNavigation.getMenu().getItem(3).setIcon(R.drawable.ic_like);
        idNbBottomNavigation.getMenu().getItem(4).setIcon(R.drawable.ic_profile_active);
    }
}