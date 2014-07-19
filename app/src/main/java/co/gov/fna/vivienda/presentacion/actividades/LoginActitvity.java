package co.gov.fna.vivienda.presentacion.actividades;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.parse.Parse;
import com.parse.ParseAnalytics;


import com.example.usuario.tryww.R;

import co.gov.fna.vivienda.controlador.ControladorLoginActivity;


public class LoginActitvity extends Activity {
    private ControladorLoginActivity controlador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        controlador = new ControladorLoginActivity(this);
        Parse.initialize(this, getResources().getString(R.string.parseid), getResources().getString(R.string.parseid2));


    }

    public void getServices(View v) {
        //controlador.setGoingForViviendasSet(true);
        controlador.getRestFullServices();
    }

    public void singUp(View v) {
        final Dialog dialog
                = new Dialog(this);
        dialog.setContentView(R.layout.sing_up_dialog);
        dialog.setTitle("Title...");

        // set the custom dialog components - text, image and button
        final EditText txtUserName = (EditText) dialog.findViewById(R.id.txtUserName);
        final EditText txtPass = (EditText) dialog.findViewById(R.id.txtPassword);
        final EditText txtEmail = (EditText) dialog.findViewById(R.id.txtEmail);
        final EditText txtMobile = (EditText) dialog.findViewById(R.id.txtMobile);
        ImageView btnOk = (ImageView) dialog.findViewById(R.id.btnOk);
        ImageView btnCancel = (ImageView) dialog.findViewById(R.id.btnCancel);

        // if button is clicked, close the custom dialog
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = txtUserName.getText().toString();
                String password = txtPass.getText().toString();
                String email = txtEmail.getText().toString();
                String mobile = txtMobile.getText().toString();
                if (username != null && username.length() > 5 && password != null && password.length() > 5 && email != null && email.length() > 7 && mobile != null && mobile.length() > 5) {
                    controlador.singUp(username,password,email,mobile);
                }else{
                    controlador.showMessage("Alerta","Por Favor Verifique los Datos");
                }
                dialog.dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();


    }

    public void openDashBoar(View v){
        //controlador.changeToDashBoard();
        Intent i = new Intent(this, DashBoard.class);
        startActivity(i);
    }

    public void logIn(View v) {
        controlador.loggin("oscarg798", "oscardx");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
