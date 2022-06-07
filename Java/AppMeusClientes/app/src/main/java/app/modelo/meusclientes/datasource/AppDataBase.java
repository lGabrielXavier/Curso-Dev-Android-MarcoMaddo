package app.modelo.meusclientes.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import app.modelo.meusclientes.api.AppUtil;
import app.modelo.meusclientes.datamodel.ClienteDataModel;

public class AppDataBase extends SQLiteOpenHelper {


    private static final String DB_NAME = "MeusClientes.sql";
    private static final int DB_VERSION = 1;
    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db =getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela());

        Log.i(AppUtil.TAG, "onCreate: banco de dados criado..");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean insert(String tabela,ContentValues dados){


        db = getWritableDatabase();

        boolean retorno = false;

        try {

            retorno = db.insert(tabela,null,dados) > 0;

        }catch (Exception e){

            Log.i(AppUtil.TAG, "insert: "+e.getMessage());
        }
        return retorno;
    }

    public boolean deleteByID(String tabela, int id){

        db = getWritableDatabase();
        boolean retorno = false;

        try {

            retorno = db.delete(tabela,"id = ?",new String[]{String.valueOf(id)}) >0;



        }catch (Exception e){

            Log.i(AppUtil.TAG, "deleteByID: "+e.getMessage());
        }
        return retorno;

    }

    public boolean update(String tabela , ContentValues dados){

        db = getWritableDatabase();
        boolean retorno = false;

        try {

            retorno = db.update(tabela,dados,"id = ?",new String[]{String.valueOf(dados.get("id"))})>0;


        }catch (Exception e){

            Log.i(AppUtil.TAG, "update: "+e.getMessage());
        }

        return retorno;

    }
}
