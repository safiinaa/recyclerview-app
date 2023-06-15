package com.example.catatanpengeluaran;

import android.content.Context;
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

    public ContactAdapter(android.view.LayoutInflater mInflater, List<KontakModel> contactList, android.view.LayoutInflater layoutInflater, Context context, ContactAdapter.OnItemClickListener listener) {
        this.mInflater = mInflater;
        this.contactList = contactList;
        this.LayoutInflater = layoutInflater;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_contact, null);
        return new ContactAdapter.ContactViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter holder, int position) {
    holder.bindData(contactList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactList.size();
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

    }
}
