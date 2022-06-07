package app.modelo.meusclientes.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

import app.modelo.meusclientes.datamodel.ClienteDataModel;
import app.modelo.meusclientes.datasource.AppDataBase;
import app.modelo.meusclientes.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadosDoObjeto;


    public ClienteController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Cliente obj) {

        dadosDoObjeto = new ContentValues();

        dadosDoObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadosDoObjeto.put(ClienteDataModel.IDADE,obj.getIDADE());
        dadosDoObjeto.put(ClienteDataModel.TELEFONE,obj.getTelefone());
        dadosDoObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());
        dadosDoObjeto.put(ClienteDataModel.CEP,obj.getCep());
        dadosDoObjeto.put(ClienteDataModel.BAIRRO,obj.getBairro());
        dadosDoObjeto.put(ClienteDataModel.LOGRADOURO,obj.getLogradouro());
        dadosDoObjeto.put(ClienteDataModel.NUMERO,obj.getNumero());
        dadosDoObjeto.put(ClienteDataModel.TERMOS_DE_USO,obj.isTermosDeUso());

        return insert(ClienteDataModel.TABELA,dadosDoObjeto);
    }

    @Override
    public boolean alterar(Cliente obj) {
        return false;
    }

    @Override
    public boolean deletar(int id) {
        return false;
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }
}
