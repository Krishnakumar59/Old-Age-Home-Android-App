////package com.singledeveloper.old_parentonlinecare;
////
////import android.content.Context;
////import android.view.LayoutInflater;
////import android.view.View;
////import android.view.ViewGroup;
////import android.widget.Adapter;
////import android.widget.TextView;
////
////import androidx.annotation.NonNull;
////import androidx.recyclerview.widget.RecyclerView;
////
////import java.util.ArrayList;
////
////import ru.embersoft.expandabletextview.ExpandableTextView;
////
////public class itemadapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
////
////    private ArrayList<Item> items;
////    private Context context;
////
////    public  itemadapter(ArrayList<Item> items,Context context ){
////    this.items = items;
////    this.context = context;
////    }
////
////    @NonNull
////    @Override
////    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
////        View view = LayoutInflater.from(context).inflate(R.layout.item, parent,false);
////        return new ViewHolder(view);
////
////    }
////
////    @Override
////    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, final int position){
////        final  Item item = items.get(position);
////        holder.titleTextView.setText(item.getTitle());
////        holder.descTextView.setText(item.getDesc());
////        holder.descTextView.setOnStateChangeListener(new ExpandableTextView.OnStateChangeListener() {
////            @Override
////            public void onStateChange(boolean isShrink) {
////                Item contentItem = Item.get(position);
////                contentItem.setShrink(isShrink);
////                items.set(position, contentItem);
////            }
////        });
////        holder.descTextView.setText(item.getDesc());
////        holder.descTextView.resetState(item.isShrink);
////        }
////
////
////
////    @Override
////    public int getItemCount(){
////        return items.size();
////    }
////
////    public class ViewHolder extends RecyclerView.ViewHolder{
////
////        ExpandableTextView descTextView;
////        TextView titleTextView;
////
////
////        public ViewHolder(@NonNull View itemView){
////            super(itemView);
////            descTextView = itemView.findViewById(R.id.descTextView);
////            titleTextView = itemView.findViewById(R.id.titletextview);
////
////        }
////
////
////    }
////
////
////}
//
//
//Matatirtha Oldage Home Committee
//        Social club in Chandragiri Municipality
//        Address: Chandragiri 44600
//        Phone: 01-4312590
//
//
//
//
//        Panchawoti Home
//        Retirement home in Mahamanjushree Nagarkot
//        Address: Mahamanjushree Nagarkot
//        Phone: 01-5091517
//
//
//        Dyomaa Old Age Home, Bode.
//        Social welfare center in Madhyapur Thimi
//        Address: Bode-8
//        Phone: 01-6638013
//
//
//        Old age home in Kolkata - Shibasram
//        Retirement home in Kolkata, India
//        Address: 1250,survey park, Near Santoshpure Jora Bridge, Kolkata, West Bengal 700075, India
//        Phone: +91 99038 14392
//        Appointments: shibasram.org.in
//
//
//        Aravind Old Aged Home
//        Retirement home in Madurai, India
//        Address: V.R.V.Nagar Main Rd, Balaji Nagar, Bama Nagar, Madurai, Tamil Nadu 625017, India
//        Phone: +91 98411 08659
//
//
//
//
//        Old Age Home in Ernakulam, Kochi, Kerala
//        Retirement home in India
//        Address: JRA-41, Karath Road Opp. MRF Tyre Service, Puthiya Kavu Valavu, Puthiyakavu, Thrippunithura, Ernakulam, Kerala 682301, India
//        Phone: +91 484 278 2960
//
//
//
//
//
//
//
//
//
//
//
//
//
