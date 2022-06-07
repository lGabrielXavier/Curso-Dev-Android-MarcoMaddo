package aluno.gabrielxavier.appminhaideiadb.controller;

import java.util.List;

public interface ICrud <T>{
    //métodos para persistencias de dados no banco de dados.
    //incluir
    public boolean incluir(T obj);
    //alterar
    public boolean alterar(T obj);
    //deletar
    public boolean deletar(int id);
    //listar
    public List<T> listar();

    //poderia também

    //buscarpeloId
    //pesquisarpeloCPF

    // CRUD = Create retrieve Update Delete





}
