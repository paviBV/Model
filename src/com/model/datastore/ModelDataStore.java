package com.model.datastore;

import com.model.entities.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelDataStore {
    List<Model> modelList =new ArrayList<>();

    public void setModel(int id, String name, String size) {
        Model model = new Model();
        model.setId(id);
        model.setName(name);
        model.setcSize(size);
        modelList.add(model);
    }
    public List<Model> fillModel(){
        return modelList;
    }

    }
