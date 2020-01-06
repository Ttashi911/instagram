package com.aryan.instagram.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aryan.instagram.models.PostModel;
import com.aryan.instagram.R;
import com.aryan.instagram.adapters.StoryAdapter;
import com.aryan.instagram.models.StoryModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btmNav;
    public static List<PostModel> listPosts = new ArrayList<>();
    public static List<StoryModel> listStories = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNav = findViewById(R.id.nav_view);

        getSupportActionBar().hide();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_add, R.id.navigation_liked, R.id.navigation_profile
        ).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(btmNav, navController);

        listPosts.add(new PostModel("Aryan Rajbhandari", "Battle between two childhood friends!", R.drawable.post, R.drawable.profilepic));
        listPosts.add(new PostModel("Tony Starc", "I am done with this.", R.drawable.profilepic2, R.drawable.profilepic2));


        listStories.add(new StoryModel("Aryan Rajbhandari", R.drawable.home, 0));
        listStories.add(new StoryModel("Add", R.drawable.add, 0));
        listStories.add(new StoryModel("Aryan Rajbhandari", R.drawable.home, 0));
        listStories.add(new StoryModel("Add", R.drawable.add, 0));
        listStories.add(new StoryModel("Aryan Rajbhandari", R.drawable.home, 0));
        listStories.add(new StoryModel("Add", R.drawable.add, 0));
        listStories.add(new StoryModel("Aryan Rajbhandari", R.drawable.home, 0));
        listStories.add(new StoryModel("Add", R.drawable.add, 0));
        listStories.add(new StoryModel("Aryan Rajbhandari", R.drawable.home, 0));
        listStories.add(new StoryModel("Add", R.drawable.add, 0));

        setUpStories();
    }


    public void setUpStories(){

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        rvStories = findViewById(R.id.rvStories);
//
//        StoryAdapter adapter = new StoryAdapter(listStories, MainActivity.this);
//        rvStories.setAdapter(adapter);
//
//        rvStories.setLayoutManager(layoutManager);

    }

}
