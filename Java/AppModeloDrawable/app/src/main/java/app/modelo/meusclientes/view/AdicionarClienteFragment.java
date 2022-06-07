package app.modelo.meusclientes.view;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import app.modelo.meusclientes.R;
import app.modelo.meusclientes.controller.ClienteController;
import app.modelo.meusclientes.model.Cliente;


public class AdicionarClienteFragment extends Fragment {

    // Fragment - Classe responsável pela camada de VISÃO (Layout)
    //declaração global de atributos-  varias globais
    View view;
    TextView txtTitulo;

    EditText editNomeCompleto;
    EditText editIdade;
    EditText editTelefone;
    EditText editEmail;
    EditText editCep;
    EditText editLogradouro;
    EditText editNumero;
    EditText editBairro;
    EditText editCidade;
    EditText editEstado;

    CheckBox chkTermosDeUso;

    Button btncCancelar,btnSalvar;

    ClienteController clienteController;
    Cliente novoCliente;

    public AdicionarClienteFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_adicionar_cliente, container, false);
        txtTitulo = view.findViewById(R.id.txtTitulo);
        txtTitulo.setText(R.string.modelo_fragment);

        // Trocar a cor da propriedade texto (setTextColor)
        txtTitulo.setTextColor(ColorStateList.valueOf(Color.CYAN));

        iniciarComponentesDeLayout();

        escutarEventosDosBotoes();

        return view;


    }

    private void iniciarComponentesDeLayout() {
        /**
         * Inicializar os componentes da tela/layout
         * para adicionar os clientes
         */

        txtTitulo = view.findViewById(R.id.txtTitulo);
        txtTitulo.setText(R.string.novoCliente);

        editNomeCompleto = view.findViewById(R.id.editNomeCompleto);
        editIdade = view.findViewById(R.id.editIdade);
        editTelefone = view.findViewById(R.id.editTelefone);
        editEmail = view.findViewById(R.id.editEmail);
        editCep = view.findViewById(R.id.editCep);
        editLogradouro = view.findViewById(R.id.editLogradouro);
        editNumero = view.findViewById(R.id.editNumero);
        editBairro = view.findViewById(R.id.editBairro);
        editCidade = view.findViewById(R.id.editCidade);
        editEstado = view.findViewById(R.id.editEstado);



        chkTermosDeUso = view.findViewById(R.id.chkTermosDeUso);

        btncCancelar = view.findViewById(R.id.btncCancelar);
        btnSalvar = view.findViewById(R.id.btnSalvar);

        novoCliente = new Cliente();
        txtTitulo.setText(R.string.novoCliente);




    }

    private void escutarEventosDosBotoes(){

        btncCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                   boolean dadosOK = true;

                if(TextUtils.isEmpty(editNomeCompleto.getText())){

                    dadosOK = false;
                    editNomeCompleto.setError("*");
                    editNomeCompleto.requestFocus();

                }
                if(TextUtils.isEmpty(editIdade.getText())){

                    dadosOK = false;
                    editIdade.setError("*");
                    editIdade.requestFocus();
                }
                if(TextUtils.isEmpty(editTelefone.getText())){

                    dadosOK= false;
                    editTelefone.setError("*");
                    editTelefone.requestFocus();

                }
                if (TextUtils.isEmpty(editEmail.getText())){

                    dadosOK=false;
                    editEmail.setError("*");
                    editEmail.requestFocus();
                }
                if(TextUtils.isEmpty(editCep.getText())){

                    dadosOK=false;
                    editCep.setError("*");
                    editCep.requestFocus();
                }

                if (TextUtils.isEmpty(editBairro.getText())){

                    dadosOK=false;
                    editBairro.setError("*");
                    editBairro.requestFocus();

                }
                if (TextUtils.isEmpty(editLogradouro.getText())){

                    dadosOK=false;
                    editLogradouro.setError("*");
                    editLogradouro.requestFocus();
                }
                if (TextUtils.isEmpty(editNumero.getText())){

                    dadosOK=false;
                    editNumero.setError("*");
                    editNumero.requestFocus();
                }
                if (TextUtils.isEmpty(editBairro.getText())){

                    dadosOK=false;
                    editBairro.setError("*");
                    editBairro.requestFocus();

                }

                if(TextUtils.isEmpty(editCidade.getText())){

                    dadosOK=false;
                    editCidade.setError("*");
                    editCidade.requestFocus();
                }

                if (TextUtils.isEmpty(editEstado.getText())){

                    dadosOK=false;
                    editEstado.setError("*");
                    editEstado.requestFocus();
                }

                if(dadosOK){

                    //popular dados
                    novoCliente.setNome(editNomeCompleto.getText().toString());
                    novoCliente.setIDADE(Integer.parseInt(editIdade.getText().toString()));
                    novoCliente.setTelefone(Integer.parseInt(editTelefone.getText().toString()));
                    novoCliente.setEmail(editEmail.getText().toString());
                    novoCliente.setCep(Integer.parseInt(editCep.getText().toString()));
                    novoCliente.setBairro(editBairro.getText().toString());
                    novoCliente.setLogradouro(editLogradouro.getText().toString());
                    novoCliente.setNumero(editLogradouro.getText().toString());
                    novoCliente.setTermosDeUso(chkTermosDeUso.isChecked());

                    clienteController.incluir(novoCliente);
                    Log.i("log_add_cliente", "onClick: Dados Corretos....");
                }else{

                    Log.i("log_add_cliente", "onClick: Dados Incorretos....");
                }
            }
        });

    }

}
