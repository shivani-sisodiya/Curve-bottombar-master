package com.example.curvebottomview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.curve.bottomnavigation.BottomNavigation;

public class MainActivity extends AppCompatActivity {
    public BottomNavigation bottomNavigation;
    private boolean isPause;
    private int SelectedTab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.add(new BottomNavigation.Model(1, R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new BottomNavigation.Model(2, R.drawable.ic_baseline_assignment_turned_in_24));
        bottomNavigation.add(new BottomNavigation.Model(3, R.drawable.ic_baseline_adb_24));
        bottomNavigation.add(new BottomNavigation.Model(4, R.drawable.ic_baseline_person_24));

        bottomNavigation.setOnClickMenuListener(new BottomNavigation.ClickListener() {
            @Override
            public void onClickItem(BottomNavigation.Model item) {
                switch (item.getId()){
                    case 1:
                        Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Assignment", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "ABD", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Person", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
        bottomNavigation.setOnShowListener(new BottomNavigation.ShowListener() {
            @Override
            public void onShowItem(BottomNavigation.Model item) {
                if(!isPause) {
                    switch (item.getId()) {
                        case 1:
                            SelectedTab =1;
                            break;
                        case 2:
                            SelectedTab =2;
                            break;
                        case 3:
                            SelectedTab =3;
                            break;
                        case 4:
                            SelectedTab =4;
                            break;
                    }
                }
            }
        });
        bottomNavigation.show(SelectedTab, true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        isPause = false;
    }

    @Override
    protected void onPause() {
        super.onPause();
        isPause = true;
    }
}