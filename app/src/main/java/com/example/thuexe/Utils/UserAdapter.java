package com.example.thuexe.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thuexe.R;
import com.example.thuexe.dangkyxe;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    ArrayList<User> lstUser;
    Context context ;
    UserCallback userCallback;

    public UserAdapter(ArrayList<User> lstUser, UserCallback userCallback) {
        this.lstUser = lstUser;
        this.userCallback = userCallback;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View userView = inflater.inflate(R.layout.activity_layoutitem, parent ,false);

        UserViewHolder viewHolder = new UserViewHolder(userView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
    User item = lstUser.get(position);

    holder.imAvarta.setImageBitmap(Utils.convertToBitmapFromAssets(context,item.getAvatar()));
    holder.tvName.setText(item.getName());
    // set su kien
        holder.itemView.setOnClickListener(v -> userCallback.onItemClick(item.getId()));
        //
    }


    @Override
    public int getItemCount() {
        return lstUser.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
        ImageView imAvarta;
        TextView tvName;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imAvarta = itemView.findViewById(R.id.ivAvatar);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
    public interface UserCallback{
        void onItemClick(String id);
    }
}
