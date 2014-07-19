package co.gov.fna.vivienda.presentacion.actividades;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    public void getServices(View v){
        //controlador.setGoingForViviendasSet(true);
        controlador.getRestFullServices();
    }

    public void singUp(View v){
        controlador.singUp("oscarg798","oscardx", "oscarg78@gmail.com","3113438370");
    }

    public void logIn(View v){
        controlador.loggin("oscarg798","oscardx");
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
