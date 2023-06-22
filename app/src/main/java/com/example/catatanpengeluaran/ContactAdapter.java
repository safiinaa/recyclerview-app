package com.example.catatanpengeluaran;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private final LayoutInflater mInflater;
    private List<KontakModel> contactList;

    private LayoutInflater LayoutInflater;
    private Context context;
    final ContactAdapter.OnItemClickListener listener;
    public interface OnItemClickListener{

    }

    public ContactAdapter(android.view.LayoutInflater mInflater, List<KontakModel> contactList, android.view.LayoutInflater layoutInflater, Context context, ContactAdapter.OnItemClickListener listener) {
        this.mInflater = mInflater;
        this.contactList = contactList;
        this.LayoutInflater = layoutInflater;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_contact, null);
        return new ContactAdapter.ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
    holder.bindData(contactList.get(position));
    }

    @Override
    public int getItemCount() {

        return contactList.size();
    }
    public void setItemCount(){
        return contactList.size();
    }

    public void setItem(List<ContactModel> item){
        contactList = item;
    }

    public interface OnItemClickListener {
        void onItemClick(ContactModel item);
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvNomer, tvStatus;
        ImageView ivAvatar;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvNomer= itemView.findViewById(R.id.tvNomer);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
        public void bindData(final KontakModel Item){
            ivAvatar.setColorFilter(Color.parseColor(Item.getColor(), PorterDuff);
        }
    }
}
