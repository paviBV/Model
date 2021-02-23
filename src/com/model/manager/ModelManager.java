package com.model.manager;

import com.model.dao.ModelDao;
import com.model.datastore.ModelDataStore;
import com.model.entities.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelManager {
    ModelDao modelDao = new ModelDao();
    List<Model> modelList =modelDao.fillModel();

    public void setModel(int id, String name, String size) {
        modelDao.setModel(id,name,size);
    }

    public void getModelList(){
        for (int i = 0; i < modelList.size(); i++) {
            System.out.println(modelList.get(i));
        }
    }
    public void singleModelList(int id){
        for (int i = 0; i < modelList.size(); i++) {
            if (modelList.get(i).getId()==id){
                System.out.println(modelList.get(i));
                break;
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
    public void updateModelList(int id, String name, String size) {
        for (int i = 0; i < modelList.size(); i++) {
            if (modelList.get(i).getId() == id) {
                modelList.get(i).setName(name);
                modelList.get(i).setcSize(size);
                System.out.println(modelList.get(i));
            }
        }
    }

    public void DeleteModelList(int id) {

        for (int i = 0; i < modelList.size(); i++) {
            if (modelList.get(i).getId() == id) {
                modelList.remove(i);
            }
        }
        for (int i = 0; i < modelList.size(); i++) {
            if (modelList.get(i).getId() != 102) {

                System.out.println("Not existing");
                break;
            }
        }
    }
}

