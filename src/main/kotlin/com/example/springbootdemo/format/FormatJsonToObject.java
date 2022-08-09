package com.example.springbootdemo.format;

import com.example.springbootdemo.data.CandidateData;
import com.example.springbootdemo.data.CandidatesDataList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class FormatJsonToObject {
    public static String getJsonFromFile() throws IOException {
        String fileName = "json/hs-resume-data.json.json";
//        try (Reader reader = new FileReader("NODES.txt")) {
//            Gson gson = new Gson();

        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            ClassLoader classLoader = FormatJsonToObject.class.getClassLoader();
//            String path  = classLoader.getResource("/com/example/springbootdemo/format/hs-resume-data.json").getPath();
            Reader reader = Files.newBufferedReader(Paths.get("/Users/yariv/Desktop/hs-resume-data.json"));

            // convert JSON string to User object
            Type CandidateListType = new TypeToken<ArrayList<CandidateData>>(){}.getType();
            List<CandidateData> candidatesDataList = gson.fromJson(reader,CandidateListType);

            // print user object
//            System.out.println(candidatesDataList);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
            return  null;
    }
}
