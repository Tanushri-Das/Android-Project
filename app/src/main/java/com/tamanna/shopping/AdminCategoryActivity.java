package com.tamanna.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private LinearLayout cseBook, eeeBook, civilBook, archiBook, mechanicalBook, storybook;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle("Add Books");
        setSupportActionBar(toolbar);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        cseBook = (LinearLayout) findViewById(R.id.cse);
        eeeBook = (LinearLayout) findViewById(R.id.eee);
        civilBook = (LinearLayout) findViewById(R.id.civil);
        archiBook = (LinearLayout) findViewById(R.id.archi);
        storybook = (LinearLayout) findViewById(R.id.storybook);
        mechanicalBook = (LinearLayout) findViewById(R.id.mechanical);


        cseBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.tamanna.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "cse");
                startActivity(intent);
            }
        });
        eeeBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.tamanna.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "eee");
                startActivity(intent);
            }
        });


        civilBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.tamanna.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "civil");
                startActivity(intent);
            }
        });


        archiBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.tamanna.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "archi");
                startActivity(intent);
            }
        });


        mechanicalBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.tamanna.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "mechanical");
                startActivity(intent);
            }
        });

        storybook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.tamanna.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "storybook");
                startActivity(intent);
            }
        });
    }
}
