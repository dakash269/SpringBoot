package com.javasampleapproach.angularjs.service;

import com.javasampleapproach.angularjs.dao.Datadao;
import com.javasampleapproach.angularjs.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * Created by akash on 24/7/17.
 */
@Service
public class Dataservice {
    @Autowired
    private Datadao datadao;
    public void addData(Data data){
        datadao.save(data);
    }
    public void updateData(Data data){
        datadao.findOne(data.getId());
        datadao.findOne(data.getId()).setDoing(data.getDoing());
        datadao.findOne(data.getId()).setDone(data.getDone());
        datadao.findOne(data.getId()).setTo_do(data.getTo_do());
    };
    public void deleteData(Data data){datadao.delete(data);}
    public List getAllDoing() {
        List<Data> list = ((List) datadao.findAll());
        List<Data> temp = new ArrayList<>();
        for (Data a : list) {
            if (Objects.equals(a.getDoing(), 1)) {
                temp.add(a);} }
        return temp;
    }
    public List getAllTo_do() {
        List<Data> list = ((List) datadao.findAll());
        List<Data> temp = new ArrayList<>();
        for (Data a : list) {
            if (Objects.equals(a.getTo_do(), 1)) {
                temp.add(a);} }
        return temp;
    }
    public List getAllDone() {
        List<Data> list = ((List) datadao.findAll());
        List<Data> temp = new ArrayList<>();
        for (Data a : list) {
            if (Objects.equals(a.getDone(), 1)) {
                temp.add(a);} }
        return temp;
    }
    public List getAllBacklog() {
        List<Data> list = ((List) datadao.findAll());
        List<Data> temp = new ArrayList<>();
        for (Data a : list) {
            if (Objects.equals(a.getDone(), 0) && Objects.equals(a.getDoing(), 0) && Objects.equals(a.getTo_do(),0)) {
                temp.add(a);} }
        return temp;
    }
}
