package app.modelo.meusclientes.datamodel;

public class ClienteDataModel {
    public static final String TABELA = "Cliente";

    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String IDADE = "idade";
    public static final String TELEFONE = "telefone";
    public static final String EMAIL = "email";
    public static final String CEP = "cep";
    public static final String BAIRRO = "bairro";
    public static final String LOGRADOURO = "logradouro";
    public static final String NUMERO = "numero";
    public static final String TERMOS_DE_USO = "termos_de_uso";


    public static String queryCriarTabela = "";

    public static String criarTabela(){

        queryCriarTabela += " CREATE TABLE "+TABELA+" ( ";
        queryCriarTabela += ID+" integer primary key autoincrement, ";
        queryCriarTabela += NOME+" text, ";
        queryCriarTabela += IDADE+" text, ";
        queryCriarTabela += TELEFONE+" integer, ";
        queryCriarTabela += EMAIL+" text, ";
        queryCriarTabela += CEP+" integer, ";
        queryCriarTabela += BAIRRO+" text, ";
        queryCriarTabela += LOGRADOURO+" text, ";
        queryCriarTabela += NUMERO+" integer, ";
        queryCriarTabela += TERMOS_DE_USO+" integer ";
        queryCriarTabela += " ) ";

        return queryCriarTabela;

    }
}
