package models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public record Recipes(
        @SerializedName("meals")
        List<Recipe> recipe) {
}
