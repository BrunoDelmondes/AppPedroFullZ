package com.example.delmo.apppedrofull;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by delmo on 31/05/2017.
 */
public abstract class GenericDAO extends SQLiteOpenHelper {

    private static final String BancoLembrete = "AcoesGeraisDiarias";
    private static final int VERSAO = 1;


    private String sqlTabelaLembrete = "CREATE TABLE IF NOT EXISTS Lembrete(" +
            "lembrete INTEGER PRIMARY KEY AUTOINCREMENT," +
            "Hora VARCHAR(45) NOT NULL " +
            "Local VARCHAR(45) NOT NULL " +
            ");";
    private String sqlTabelaUsuario = "CREATE TABLE IF NOT EXISTS Usuario(" +
            "login INTEGER PRIMARY KEY AUTOINCREMENT," +
            "senha VARCHAR(45) NOT NULL " +
            "Local VARCHAR(45) NOT NULL " +
            ");";
    private String sqlTabelaCadastro = "CREATE TABLE IF NOT EXISTS Cadastro(" +
            "login INTEGER PRIMARY KEY AUTOINCREMENT," +
            "senha VARCHAR(45) NOT NULL " +
            "rep VARCHAR(45) NOT NULL " +
            ");";


    public GenericDAO(Context context) {
        super(context);
    }

    public GenericDAO(Context context) {super(context,BancoLembrete,null,VERSAO);}
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlTabelaLembrete);
        db.execSQL(sqlTabelaUsuario);
        db.execSQL(sqlTabelaCadastro);



}
