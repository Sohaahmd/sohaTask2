
    package com.mohanadalkrunz99.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

    public class studentAdapter extends RecyclerView.Adapter<com.mohanadalkrunz99.myapplication.studentAdapter.BookVh> {

        Context context ;
        List<student> studentList;

        public studentAdapter(Context context ,  List<student> studentList) {
            this.context = context;
            this.studentList = studentList;
        }

        @NonNull
        @Override
        public com.mohanadalkrunz99.myapplication.studentAdapter.BookVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.row_book , parent , false);
            return new com.mohanadalkrunz99.myapplication.studentAdapter.BookVh(view);
        }

        @Override
        public void onBindViewHolder(@NonNull com.mohanadalkrunz99.myapplication.studentAdapter.BookVh holder, int position) {
            holder.setData(studentList.get(position));
        }


        @Override
        public int getItemCount() {
            return 0;
        }

        class BookVh extends RecyclerView.ViewHolder{
            TextView std_id , std_avg, std_level , std_name;
            public BookVh(@NonNull View itemView) {
                super(itemView);
                std_id = itemView.findViewById(R.id.std_id);
                std_avg = itemView.findViewById(R.id.std_avg);
                std_level = itemView.findViewById(R.id.std_level);
                std_name = itemView.findViewById(R.id.std_name);
            }

            public void setData(student student) {
                std_id.setText(student.getId());
                std_avg.setText(student.getAvg());
                std_level.setText(student.getLevel());
                std_name.setText(student.getName());
            }
        }
    }

