package com.singledeveloper.old_parentonlinecare;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model)
    {
        holder.name.setText(model.getName());
        holder.age.setText(model.getAge());
        holder.gender.setText(model.getGender());
        holder.address.setText(model.getAddress());
        holder.contact.setText(model.getContact());
        Glide.with(holder.img.getContext()).load(model.getPurl()).into(holder.img);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

     class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img;
        TextView name,gender,address,contact,age;


        public myviewholder(@NonNull View itemView)  // -------------------------------------------> Remove static if any error occurred
        {
            super(itemView);
            img=(CircleImageView)itemView.findViewById(R.id.img1);
            name=(TextView)itemView.findViewById(R.id.nametext);
            age=(TextView)itemView.findViewById(R.id.agetext);
            gender=(TextView)itemView.findViewById(R.id.gendertext);
            address=(TextView)itemView.findViewById(R.id.addresstext);
            contact=(TextView)itemView.findViewById(R.id.contacttext);
        }
    }
}
