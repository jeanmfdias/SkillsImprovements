package models;

import com.google.gson.annotations.SerializedName;

public record Recipe(
        @SerializedName("strMeal")
        String name,
        @SerializedName("strCategory")
        String category) {
}
