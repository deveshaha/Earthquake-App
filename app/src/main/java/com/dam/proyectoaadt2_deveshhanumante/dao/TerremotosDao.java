package com.dam.proyectoaadt2_deveshhanumante.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.dam.proyectoaadt2_deveshhanumante.entity.Terremotos;

import java.util.List;

@Dao
public interface TerremotosDao {

    @Query("SELECT * FROM TERREMOTOS")
    public List<Terremotos> getAll();

    @Insert
    public long insert(Terremotos terremotos);
}
