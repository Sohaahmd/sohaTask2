package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BookListActivity extends AppCompatActivity {

    RecyclerView studentlist_rv;
    studentAdapter studentAdapter;

    List<student> bookList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        boolean ahmed = bookList.add(new student("123 ", "2", "90", "ahmed"));//
        bookList.add(new student("213 ","3","80","mohammed"));//
        //


       studentlist_rv = findViewById(R.id.booksList_rv);
        studentlist_rv.setLayoutManager(new LinearLayoutManager(this));
        studentAdapter = new studentAdapter(this ,bookList);
        studentlist_rv.setAdapter(studentAdapter);
    }
}
