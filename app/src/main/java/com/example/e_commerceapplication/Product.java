package com.example.e_commerceapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {
    private String name;
    private double price;
    private int imageResource;

    public Product(String name, double price, int imageResource) {
        this.name = name;
        this.price = price;
        this.imageResource = imageResource;
    }

    protected Product(Parcel in) {
        name = in.readString();
        price = in.readDouble();
        imageResource = in.readInt();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(price);
        dest.writeInt(imageResource);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }
}
