package com.example.labassignment7;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class DogsAdapter extends RecyclerView.Adapter<DogsAdapter.ViewHolder> {
        // Store a member variable for the products

        private ArrayList<Dog> dogsDataset;
        // Pass in the products array into the constructor
        public DogsAdapter(ArrayList<Dog> dogs) {

            dogsDataset = dogs;
        }
        public class ViewHolder extends RecyclerView.ViewHolder {
            // Your holder should contain a member variable
// for any view that will be set as you render a row
            public TextView textViewDogName, textViewDogBreed, textViewDogWeightCategory;
            // Constructor accepts the entire item row
            public ViewHolder(View itemView) {
                super(itemView);
                textViewDogName = (TextView) itemView.findViewById(R.id.textViewDogName);
                textViewDogBreed = (TextView) itemView.findViewById(R.id.textViewDogBreed);
                textViewDogWeightCategory = (TextView) itemView.findViewById(R.id.textViewDogWeightCategory);
//HERE: get hold of the other two TextView’s in row_layout and assign them to corresponding the variables
//HERE: get hold of the other two TextView's in row_layout and assign them to corresponding the variables
            }
        }
        @Override
        public DogsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
// Inflate the custom layout
            View dogView = inflater.inflate(R.layout.row_layout, parent, false);
            ViewHolder viewHolder = new ViewHolder(dogView);
            return viewHolder;
        }
        @Override
        public void onBindViewHolder(DogsAdapter.ViewHolder viewHolder, int position) {
// Get the data row based on position
            Dog dog = dogsDataset.get(position);
// Set item views for the given data rowdata row

            viewHolder.textViewDogName.setText(dog.name);
            viewHolder.textViewDogBreed.setText(dog.breed);
            viewHolder.textViewDogWeightCategory.setText(dog.wthCategory());
//HERE: set the text of TextViews textViewDogBreed and textViewDogWeightCategory with
//the breed and wthCategory from the dog object

            if(dog.wthCategory()==Dog.UNDERWEIGHT){
                viewHolder.textViewDogWeightCategory.setTextColor(Color.rgb(255,0,0));
            }
            if(dog.wthCategory()==Dog.OBESE){
                viewHolder.textViewDogWeightCategory.setTextColor(Color.rgb(0,255,0));
            }
            if(dog.wthCategory()==Dog.OVERWEIGHT){
                viewHolder.textViewDogWeightCategory.setTextColor(Color.rgb(0,0,255));
            }
        }
        @Override
        public int getItemCount() {
            return dogsDataset.size();
        }

}
