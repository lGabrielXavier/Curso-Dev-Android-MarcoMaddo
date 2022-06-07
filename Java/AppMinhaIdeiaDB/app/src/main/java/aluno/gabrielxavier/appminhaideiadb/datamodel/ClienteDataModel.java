package aluno.gabrielxavier.appminhaideiadb.datamodel;

public class ClienteDataModel {


    public static final String TABELA = "Cliente";


    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";

    public static String queryCriarTabela = "";


    public static String criartabela(){

            queryCriarTabela += " CREATE TABLE "+TABELA+" ( ";
            queryCriarTabela += ID+ " integer primary key autoincrement, ";
            queryCriarTabela += NOME+" text, ";
            queryCriarTabela += EMAIL+" text ";
            queryCriarTabela += " ) ";

            return queryCriarTabela;

    }


}
