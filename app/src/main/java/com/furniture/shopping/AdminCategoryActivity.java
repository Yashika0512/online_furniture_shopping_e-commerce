package com.furniture.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView table,sofa,living;
    private ImageView dining,cupboard,chair;
    private ImageView bed,drawer,tv;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

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



        table = (ImageView) findViewById(R.id.table);
        sofa = (ImageView) findViewById(R.id.sofa);
        living = (ImageView) findViewById(R.id.living);


        dining = (ImageView) findViewById(R.id.dining);
        cupboard = (ImageView) findViewById(R.id.cupboard);
        chair= (ImageView) findViewById(R.id.chair);


        bed = (ImageView) findViewById(R.id.bed);
        drawer = (ImageView) findViewById(R.id.drawer);
        tv = (ImageView) findViewById(R.id.tv);


        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Table");
                startActivity(intent);
            }
        });
        sofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sofa");
                startActivity(intent);
            }
        });
        living.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Livingroom wood");
                startActivity(intent);
            }
        });


        dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Dining Table");
                startActivity(intent);
            }
        });


        cupboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Cupboard");
                startActivity(intent);
            }
        });


        chair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Chair");
                startActivity(intent);
            }
        });



        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Bed ");
                startActivity(intent);
            }
        });


        drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Drawer");
                startActivity(intent);
            }
        });



        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.furniture.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "TV Stand");
                startActivity(intent);
            }
        });



    }
}
