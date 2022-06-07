package aluno.gabrielxavier.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import aluno.gabrielxavier.appminhaideiadb.R;
import aluno.gabrielxavier.appminhaideiadb.api.AppUtil;
import aluno.gabrielxavier.appminhaideiadb.controller.ClienteController;
import aluno.gabrielxavier.appminhaideiadb.controller.ProdutoController;
import aluno.gabrielxavier.appminhaideiadb.model.Cliente;

public class MainActivity extends AppCompatActivity {
    ClienteController clienteController;

    Cliente obj;
    Cliente objnovo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteController = new ClienteController(getApplicationContext());


        Log.d(AppUtil.TAG, "onCreate:Minha ideia database ");

        obj = new Cliente();
        obj.setId(5);
        obj.setNome("Gabriel");
        obj.setEmail("bielxd2@hotmail.com");




//        objnovo = new Cliente();
//        obj.setNome("lucas");
//        obj.setEmail("dsadas@teste.com");
//
//
//
//
//
//        if(clienteController.incluir(obj)){
//
//            Toast.makeText(MainActivity.this, "Cliente"+obj.getNome()+"Incluido com sucesso...",
//                    Toast.LENGTH_SHORT).show();
//
//            Log.i(AppUtil.TAG, "Cliente"+obj.getNome()+" Incluido com sucesso...");
//
//        }else{
//
//            Toast.makeText(MainActivity.this, "Cliente"+obj.getNome()+"Não incluido com sucesso...",
//                    Toast.LENGTH_SHORT).show();
//
//            Log.e(AppUtil.TAG, "Cliente"+obj.getNome()+" Não incluido com sucesso...");
//        }
//
//        if(clienteController.incluir(objnovo)){
//
//            Toast.makeText(MainActivity.this, "Cliente2"+objnovo.getNome()+"Incluido com sucesso...",
//                    Toast.LENGTH_SHORT).show();
//
//            Log.d(AppUtil.TAG, "Cliente2"+objnovo.getNome()+"Incluido com sucesso...)");
//
//        }else{
//
//            Toast.makeText(MainActivity.this, "Cliente2"+objnovo.getNome()+"Não incluido com sucesso...",
//                    Toast.LENGTH_SHORT).show();
//
//            Log.d(AppUtil.TAG, "Cliente2"+objnovo.getNome()+"Não Incluido com sucesso...)");
//
//
//        }
        if (clienteController.deletar(obj.getId())) {

            Toast.makeText(MainActivity.this, "Cliente" + obj.getNome() + "Excluido com sucesso...",
                    Toast.LENGTH_SHORT).show();

            Log.d(AppUtil.TAG, "Cliente" + obj.getNome() + " Excluido com sucesso...)");

        } else {

            Toast.makeText(MainActivity.this, "Cliente" + obj.getNome() + " Não incluido com sucesso...",
                    Toast.LENGTH_SHORT).show();

            Log.d(AppUtil.TAG, "Cliente" + obj.getNome() + " Não Excluido com sucesso...)");

        }
    }
}