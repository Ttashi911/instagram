package com.aryan.instagram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aryan.instagram.R;
import com.aryan.instagram.models.StoryModel;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    private List<StoryModel> listStories;
    private Context mContext;

    public StoryAdapter(List<StoryModel> listStories, Context mContext) {
        this.listStories = listStories;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.insta_story_card, parent, false);

        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        StoryModel story = listStories.get(position);
        holder.story.setImageResource(story.getStory());
        holder.name.setText(story.getName());
    }

    @Override
    public int getItemCount() {
        return listStories.size();
    }

    public class StoryViewHolder extends RecyclerView.ViewHolder{

        CircleImageView story;
        TextView name;

        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            story = itemView.findViewById(R.id.imgInstaStory);
            name = itemView.findViewById(R.id.tvStoryBy);

        }
    }
}
