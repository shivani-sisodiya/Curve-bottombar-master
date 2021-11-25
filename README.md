# Curve-bottombar-master
Curve BottomNavigationView
A simple curved bottom navigation for Android with AnimatedVectorDrawable and Jetpack Navigation support.

Setup

Update your module level build.gradle file and add the following dependency. Please check the project releases for latest versions.

dependencies {
    implementation project(path: ':bottomnavigation')
}

Setup in XML

Add BottomNavigation in your layout xml file.

  <com.curve.bottomnavigation.BottomNavigation
        android:id="@+id/bottomNavigation"
        android:layout_width="match_parent"
        android:layout_height="85dp"
        android:layout_gravity="bottom"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:background="@drawable/bottom_bar_gradiant"
        android:clickable="false" />

Setup in Code
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
        

![Screenshot_1637751392](https://user-images.githubusercontent.com/44597690/143378144-f097c3cb-39ec-4c3b-8e84-a96718b9e7d3.png)
