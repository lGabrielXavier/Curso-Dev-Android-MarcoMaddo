package aluno.gabrielxavier.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import aluno.gabrielxavier.appminhaideiadb.api.AppUtil;
import aluno.gabrielxavier.appminhaideiadb.datamodel.ClienteDataModel;
import aluno.gabrielxavier.appminhaideiadb.datasource.AppDataBase;
import aluno.gabrielxavier.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadoDoObjeto;


     public ClienteController(Context context) {
        super(context);

         Log.d(AppUtil.TAG, "ClienteController: CONECTADO ");
    }

    @Override
    public boolean incluir(Cliente obj) {

         // KEY,VALUES
        //ID é a chave primaria da tabela cliente
        //é gerada automaticamente pela SQLite a cada
        //novo registroa adicionado.
        //SQL >>>>>>>> INSERT INTO TABLE ( .. . .. ..) VALUES (#######)


         dadoDoObjeto = new ContentValues();

         dadoDoObjeto.put(ClienteDataModel.NOME,obj.getNome());
         dadoDoObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());

         return insert(ClienteDataModel.TABELA,dadoDoObjeto);

         //enviar os dados (dadoDoObjeto) para a classe appDataBase
        //utilizando um método capaz de adicionar o OBJ no banco de dados
        //dados, tabela qualquer uma(Cliente)



    }

    @Override
    public boolean alterar(Cliente obj) {

        // KEY,VALUES


        //ID é a chave primaria da tabela cliente( No alterar tem que passar o ID)
        //é gerada automaticamente pela SQLite a cada
        //novo registroa adicionado.
        //SQL >>>>>>>> UPDATE


        dadoDoObjeto = new ContentValues();
        dadoDoObjeto.put(ClienteDataModel.ID,obj.getId());
        dadoDoObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());

        return true;

        //enviar os dados (dadoDoObjeto) para a classe appDataBase
        //utilizando um método capaz de alterar o OBJ no banco de dados
        //dados, tabela qualquer uma(Cliente),respeitando  o ID(Primary key)



    }

    @Override
    public boolean deletar(int id) {



         return deleteByID(ClienteDataModel.TABELA,id);

    }

    @Override
    public List<Cliente>  listar() {

         List<Cliente> lista = new ArrayList<>();

        return lista;
    }
}
