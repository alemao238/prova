package com.senai.prova;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final String LOGIN_PADRAO = "senai";
	private static final String SENHA_PADRAO = "123";

	private String loginDigitado;
	private String senhaDigitada;

	private EditText campoLogin;
	private EditText campoSenha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 
	}

	public void validarLogin(View view) {
		capturarDados(view);
		if (!LOGIN_PADRAO.equals(loginDigitado)) {
			mostrarMensagem("Login incorreto");
		} else if (!SENHA_PADRAO.equals(senhaDigitada)) {
			mostrarMensagem("Senha incorreta");
		} else {
			mostrarMensagem("Login efetuado com sucesso");
		}
	}

	private void mostrarMensagem(String mensagem) {
		Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
	}

	private void obterFormulario(View view) {
		campoLogin = (EditText) findViewById(R.id.et_login);
		campoSenha = (EditText) findViewById(R.id.et_senha);
	}

	private void capturarDados(View view) {
		obterFormulario(view);
		loginDigitado = campoLogin.getText().toString();
		senhaDigitada = campoSenha.getText().toString();
	}

	public void limparFormulario(View view) {
		obterFormulario(view);
		campoLogin.setText("");
		campoSenha.setText("");
	}
}
