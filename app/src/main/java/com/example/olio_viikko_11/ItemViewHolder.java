package com.example.olio_viikko_11;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView item;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        item = itemView.findViewById(R.id.tvItem);
    }
}
