package com.example.simplerecipeapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Data implements Parcelable {

    private String name;
    private Integer image1;
    private Integer image2;
    private Integer image_ingredients;
    private Integer image_instructors;

    public Data(String name, Integer image1, Integer image2, Integer image_ingredients, Integer image_instructors) {
        this.name = name;
        this.image1 = image1;
        this.image2 = image2;
        this.image_ingredients = image_ingredients;
        this.image_instructors = image_instructors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage1() {
        return image1;
    }

    public void setImage1(Integer image1) {
        this.image1 = image1;
    }

    public Integer getImage2() {
        return image2;
    }

    public void setImage2(Integer image2) {
        this.image2 = image2;
    }

    public Integer getImage_ingredients() {
        return image_ingredients;
    }

    public void setImage_ingredients(Integer image_ingredients) {
        this.image_ingredients = image_ingredients;
    }

    public Integer getImage_instructors() {
        return image_instructors;
    }

    public void setImage_instructors(Integer image_instructors) {
        this.image_instructors = image_instructors;
    }

    protected Data(Parcel in) {
        name = in.readString();
        if (in.readByte() == 0) {
            image1 = null;
        } else {
            image1 = in.readInt();
        }
        if (in.readByte() == 0) {
            image2 = null;
        } else {
            image2 = in.readInt();
        }
        if (in.readByte() == 0) {
            image_ingredients = null;
        } else {
            image_ingredients = in.readInt();
        }
        if (in.readByte() == 0) {
            image_instructors = null;
        } else {
            image_instructors = in.readInt();
        }
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        if (image1 == null){
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(image1);
        }
        if (image2 == null){
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(image2);
        }
        if (image_ingredients == null){
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(image_ingredients);
        }
        if (image_instructors == null){
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(image_instructors);
        }
    }
}
