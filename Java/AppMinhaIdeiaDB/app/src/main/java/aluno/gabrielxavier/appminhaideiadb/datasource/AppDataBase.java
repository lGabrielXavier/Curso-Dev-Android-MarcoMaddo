package aluno.gabrielxavier.appminhaideiadb.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import aluno.gabrielxavier.appminhaideiadb.api.AppUtil;
import aluno.gabrielxavier.appminhaideiadb.datamodel.ClienteDataModel;
import aluno.gabrielxavier.appminhaideiadb.datamodel.ProdutoDataModel;
import aluno.gabrielxavier.appminhaideiadb.model.Cliente;

public class AppDataBase extends SQLiteOpenHelper {
    private static final String DB_NAME ="App_MinhaIdeia.sqlite" ;
    private static final int DB_VERSION = 1;

    SQLiteDatabase db;


    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: criando bancoo de dados.. ");

        db = getWritableDatabase();


    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criartabela());

        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente Criada.. "+ClienteDataModel.criartabela());

        db.execSQL(ProdutoDataModel.criarTabela());

        Log.d(AppUtil.TAG, "onCreate: Tabela Produto Criado "+ProdutoDataModel.criarTabela());



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newVersion) {

    }

    public boolean insert(String tabela, ContentValues dados){

        /**
         * Método para incluir dados no banco de dados.
         * @return
        */


        db = getWritableDatabase();

        boolean retorno = false;

        try {

            retorno = db.insert(tabela,null,dados) >0;

        }catch (Exception e){

            Log.d(AppUtil.TAG, "insert: "+e.getMessage());
        }

        return retorno;
    }

    public boolean deleteByID(String tabela, int id){

        /**
         * Método para deletar dados no banco de dados.
         * @return
         */

        db = getWritableDatabase();

        boolean retorno = false;

        try {
            //retorno = db.insert(tabela,null,id) > 0;

            retorno = db.delete(tabela,"id = ?",new String[]{String.valueOf(id)}) > 0;

        }catch (Exception e){

            Log.d(AppUtil.TAG, "Delete:"+e.getMessage());
        }

        return retorno;

    }

}
