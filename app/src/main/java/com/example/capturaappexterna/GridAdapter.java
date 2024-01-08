package com.example.capturaappexterna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {

    private List<Integer> data; // Cambiado a Integer para representar referencias a recursos de imágenes
    private Context context;

    public GridAdapter(Context context, List<Integer> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        // Configurar los datos del elemento de la cuadrícula aquí
        int imageResId = data.get(position);
        holder.imageView.setImageResource(imageResId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class GridViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            // Inicializar los elementos de la vista aquí
            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}
