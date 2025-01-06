package com.example.e_commerceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

public class MainActivity extends AppCompatActivity {
    private RecyclerView featuredProductsRecyclerView;
    private FeaturedProductsAdapter featuredProductsAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize button for checkout
        Button btnCheckout = findViewById(R.id.btnCheckout);
        btnCheckout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CheckoutActivity.class);
            startActivity(intent);
        });

        // Initialize button to view products (assuming you want to implement this)
        Button viewProductsButton = findViewById(R.id.viewProductsButton);
<<<<<<< HEAD
        viewProductsButton.setOnClickListener(v -> {
            // Handle button click action here (e.g., go to Product List screen)
        });

=======
        ImageView personIcon = findViewById(R.id.personIcon);
>>>>>>> 1deabb34be731e0e2e9af9623a840ff46281b654
        // Initialize the RecyclerView
        featuredProductsRecyclerView = findViewById(R.id.featuredProductsRecyclerView);
        featuredProductsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the product list
        productList = new ArrayList<>();

        // Add products to the list
        productList.add(new Product("Basic White T-Shirt", 15.99, R.drawable.white));
        productList.add(new Product("Slim Fit Denim Jeans", 39.99, R.drawable.jeans));

        // Initialize the adapter and set it to the RecyclerView
        featuredProductsAdapter = new FeaturedProductsAdapter(productList);
        featuredProductsRecyclerView.setAdapter(featuredProductsAdapter);
<<<<<<< HEAD
=======




        // Set up the button click listener
        viewProductsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click action here (e.g., go to Product List screen)
            }
        });

        personIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to LoginActivity
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
>>>>>>> 1deabb34be731e0e2e9af9623a840ff46281b654
    }
}
