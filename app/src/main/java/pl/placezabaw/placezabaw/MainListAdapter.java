package pl.placezabaw.placezabaw;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mateusz on 2017-04-29.
 */

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder>
{
    private Playground[] Items;
    private Activity activity;

    public MainListAdapter(Activity actvty, Playground[] n){this.Items = n; this.activity = actvty;}
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.tvName.setText(Items[position].getName());
        holder.ivImage.setImageResource(R.drawable.pl_zab);
        holder.tvRate.setText(Items[position].getRate()+"");

        holder.btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder rateDialog = new AlertDialog.Builder(activity);
                LayoutInflater inflater = activity.getLayoutInflater();
                rateDialog.setView(inflater.inflate(R.layout.dialog_rate,null));
                rateDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                rateDialog.setPositiveButton("Rate", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                rateDialog.show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Polecam "+Items[position].getName());
                shareIntent.setType("plain/text");
                activity.startActivity(shareIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Items.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public TextView tvRate;
        public ImageView ivImage;
        public ImageButton btnRate;
        public ImageButton btnShare;

        private ViewHolder(View v)
        {
            super(v);
            this.tvName = (TextView)v.findViewById(R.id.tvName);
            this.tvRate = (TextView)v.findViewById(R.id.tvRate);
            this.ivImage = (ImageView)v.findViewById(R.id.ivImage);
            this.btnRate = (ImageButton)v.findViewById(R.id.btnRate);
            this.btnShare = (ImageButton)v.findViewById(R.id.btnShare);
        }
    }
}
