package aluno.gabrielxavier.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

import aluno.gabrielxavier.appminhaideiadb.datamodel.ProdutoDataModel;
import aluno.gabrielxavier.appminhaideiadb.datasource.AppDataBase;
import aluno.gabrielxavier.appminhaideiadb.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoDoObjeto;

    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.ID,obj.getId());
        dadoDoObjeto.put(ProdutoDataModel.NOME,obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());

        return insert(ProdutoDataModel.TABELA,dadoDoObjeto  );

    }

    @Override
    public boolean alterar(Produto obj) {

        return true;

    }

    @Override
    public boolean deletar(int id) {

        return false;

    }

    @Override
    public List<Produto> listar() {

        return null;
    }


}
