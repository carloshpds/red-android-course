package com.gestta.gestta_app;

import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.gestta.gestta_app.adapters.ViewPageAdapter;
import com.gestta.gestta_app.fragments.DashboardFragment;
import com.gestta.gestta_app.fragments.RequestFragment;
import com.gestta.gestta_app.fragments.TaskFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private final ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());



    /**
     * The {@link ViewPager} that will host the losection contents.
     */

    @BindView(R.id.container)
    protected ViewPager mViewPager;

    @BindView(R.id.activity_main_tabs)
    protected TabLayout mainTabs;

    @BindView(R.id.toolbar)
    protected Toolbar mainToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupViewpageAdapter();
        mainTabs.setupWithViewPager(mViewPager);


    }

    private void setupViewpageAdapter() {
        viewPageAdapter.addFragment(DashboardFragment.newInstance(), "Dashboard");
        viewPageAdapter.addFragment(TaskFragment.newInstance(), "Tarefas");
        viewPageAdapter.addFragment(RequestFragment.newInstance(), "Solicitações");

        // Set up the ViewPager with the sections adapter.
        mViewPager.setAdapter(viewPageAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}