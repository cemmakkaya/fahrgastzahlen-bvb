package com.example.fahrgastzahlenbvb.data;

import com.example.fahrgastzahlenbvb.models.PassengerData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.reflect.TypeToken;

import com.example.fahrgastzahlenbvb.data.utils.LocalDateAdapter;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;

public class DataLoader {
    private static final String JSON_FILE_PATH = "/Users/cemakkaya/IdeaProjects/fahrgastzahlen-bvb/src/main/resources/datensatz.json";

    public List<PassengerData> loadData() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();

        try (JsonReader reader = new JsonReader(new FileReader(JSON_FILE_PATH))) {
            Type listType = new TypeToken<List<PassengerData>>(){}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}