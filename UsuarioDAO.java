package com.example.delmo.apppedrofull;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

/**
 * Created by delmo on 31/05/2017.
 */
public class UsuarioDAO extends GenericDAO implements DAO<Usuario>{
    private SQLiteDatabase database;

    public UsuarioDAO(Context context) {
        super(context);
        database = getWritableDatabase();
    }




    @Override
    public boolean salvar(Usuario usuario) {return false;}
    @Override
    public List<Usuario> listar() {return null;}
    @Override
    public boolean deletar(int id) {return false;}
    @Override
    public boolean atualizar(Usuario usuario) {return false;}
    @Override
    public void onCreate(SQLiteDatabase db) {}
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
