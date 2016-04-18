package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Schema;

public class DataBase {

    public static void main(String []args) throws Exception {
        Schema schema = new Schema(1, "com.example.tomduan.kickoff.greendao");

//        addToken(schema);

        new DaoGenerator().generateAll(schema, "../AndroidModule/app/src/main/java");
    }
}
