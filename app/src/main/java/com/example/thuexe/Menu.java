package com.example.thuexe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.thuexe.fragment.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Menu extends AppCompatActivity {
    private  BottomNavigationView mNavigationView;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mNavigationView  = findViewById(R.id.IDMenu);
        mViewPager  = findViewById(R.id.view_pager);

        setUpViewPager();

        mNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        mViewPager.setCurrentItem(0);
                        break;

                        case R.id.action_notica:
                            mViewPager.setCurrentItem(1);
                            break;

                            case R.id.action_bus:
                                mViewPager.setCurrentItem(2);
                                break;

                                case R.id.action_support:
                                    mViewPager.setCurrentItem(3);
                                    break;

                                    case R.id.action_accout:
                                        mViewPager.setCurrentItem(4);
                                        break;
                            }
                            return true;
                        }
        });
    }
    private void setUpViewPager(){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        mNavigationView.getMenu().findItem(R.id.action_home).setChecked(true);
                    case 1:
                        mNavigationView.getMenu().findItem(R.id.action_notica).setChecked(true);
                    case 2:
                        mNavigationView.getMenu().findItem(R.id.action_bus).setChecked(true);
                    case 3:
                        mNavigationView.getMenu().findItem(R.id.action_support).setChecked(true);
                    case 4:
                        mNavigationView.getMenu().findItem(R.id.action_accout).setChecked(true);

                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}