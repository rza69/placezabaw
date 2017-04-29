package pl.placezabaw.placezabaw;

import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mateusz on 2017-04-29.
 */

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder>
{
    private String[] Names;

    public MainListAdapter(String[] n){this.Names = n;}
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvName.setText(Names[position]);

       // holder.ivImage.set
    }

    @Override
    public int getItemCount() {
        return Names.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public ImageView ivImage;

        private ViewHolder(View v)
        {
            super(v);
            this.tvName = (TextView)v.findViewById(R.id.tvName);
            this.ivImage = (ImageView)v.findViewById(R.id.ivImage);
        }
    }
}
