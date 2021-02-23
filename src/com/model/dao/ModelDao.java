package com.model.dao;

import com.model.datastore.ModelDataStore;
import com.model.entities.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelDao {
    ModelDataStore modelDataStore = new ModelDataStore();

    public void setModel(int id, String name, String size) {
        modelDataStore.setModel(id,name,size);
    }
    public List<Model> fillModel(){
        return modelDataStore.fillModel();
    }

}
