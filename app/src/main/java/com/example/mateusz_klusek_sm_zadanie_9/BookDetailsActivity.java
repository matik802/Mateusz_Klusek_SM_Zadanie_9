package com.example.mateusz_klusek_sm_zadanie_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class BookDetailsActivity extends AppCompatActivity {
    public static final String EXTRA_BOOK_ACTIVITY_DETAILS_TITLE = "pb.edu.pl.BOOK_ACTIVITY_DETAILS_TITLE";
    public static final String EXTRA_BOOK_ACTIVITY_DETAILS_AUTHOR = "pb.edu.pl.BOOK_ACTIVITY_DETAILS_AUTHOR";
    public static final String EXTRA_BOOK_ACTIVITY_DETAILS_PAGE_NUMBER = "pb.edu.pl.BOOK_ACTIVITY_DETAILS_PAGE_NUMBER";
    public static final String EXTRA_BOOK_ACTIVITY_DETAILS_COVER_ADDRESS = "pb.edu.pl.BOOK_ACTIVITY_DETAILS_COVER_ADDRESS";
    public static final String EXTRA_BOOK_ACTIVITY_DETAILS_EBOOK_ACCESS = "pb.edu.pl.BOOK_ACTIVITY_DETAILS_EBOOK_ACCESS";
    private TextView titleTextView;
    private TextView authorTextView;
    private TextView pageNumberTextView;
    private TextView ebookAccessTextView;
    private ImageView cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        titleTextView = findViewById(R.id.book_title);
        authorTextView = findViewById(R.id.book_author);
        pageNumberTextView = findViewById(R.id.book_page_number);
        cover = findViewById(R.id.img_cover);
        ebookAccessTextView = findViewById(R.id.book_ebook_access);

        Intent starter = getIntent();
        titleTextView.setText("Tytul: " + starter.getStringExtra(EXTRA_BOOK_ACTIVITY_DETAILS_TITLE));
        authorTextView.setText("Autor: " + starter.getStringExtra(EXTRA_BOOK_ACTIVITY_DETAILS_AUTHOR));
        pageNumberTextView.setText("Liczba stron: " + starter.getStringExtra(EXTRA_BOOK_ACTIVITY_DETAILS_PAGE_NUMBER));
        ebookAccessTextView.setText("Dostępny ebook: " + starter.getStringExtra(EXTRA_BOOK_ACTIVITY_DETAILS_EBOOK_ACCESS));
        String coverAddress = starter.getStringExtra(EXTRA_BOOK_ACTIVITY_DETAILS_COVER_ADDRESS);
        if (coverAddress != null)
            Picasso.with(this)
                    .load(coverAddress)
                    .placeholder(R.drawable.baseline_book_24)
                    .into(cover);
        else {
            cover.setImageResource(R.drawable.baseline_book_24);
        }
    }
}