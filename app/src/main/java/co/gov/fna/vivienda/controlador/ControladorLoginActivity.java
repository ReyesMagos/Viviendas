package co.gov.fna.vivienda.controlador;

import com.example.usuario.tryww.R;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import co.gov.fna.vivienda.modelo.entidades.Usuario;
import co.gov.fna.vivienda.presentacion.actividades.LoginActitvity;
import co.gov.fna.vivienda.servicios.GetRestServices;
import co.gov.fna.vivienda.utilidades.FactoryPuntoAtencion;
import co.gov.fna.vivienda.utilidades.FactoryVivienda;
import co.gov.fna.vivienda.utilidades.Utilities;

/**
 * Created by usuario on 18/07/14.
 */
public class ControladorLoginActivity {

    private boolean isGoingForViviendasSet;
    private LoginActitvity activity;
    private String[] urlSet;
    private Usuario usuario;

    public ControladorLoginActivity(LoginActitvity actividad){
        this.activity= actividad;
        this.urlSet= actividad.getResources().getStringArray(R.array.urlset);

    }

    public void procesaRespuestaRestFul(JSONObject objeto){
        if(isGoingForViviendasSet){
            try{
                String[] viviendaPropertysNames = activity.getResources().getStringArray(R.array.viviendas_properties_names);
                JSONArray arregloJSON = objeto.getJSONArray("d");
                FactoryVivienda factory = FactoryVivienda.getInstance();
                factory.fillViviendas(arregloJSON, viviendaPropertysNames);
            }catch(JSONException e){

            }

        }else{
            try{
                String[] puntosPropertysNames = activity.getResources().getStringArray(R.array.puntosatencion_properties_names);
                JSONArray arregloJSON = objeto.getJSONArray("d");
                FactoryPuntoAtencion factory = FactoryPuntoAtencion.getInstance();
                factory.fillPuntoAtencion(arregloJSON, puntosPropertysNames);
            }catch(JSONException e){

            }
        }
    }

    public void singUp(){
        

    }

    public void loggin(String user, String pass){
        final Utilities utilidades = new Utilities(activity.getApplicationContext());
        utilidades.showDialog("Alerta", "iniciando Session Espere por Favor", false);


        ParseUser.logInInBackground(user, pass, new LogInCallback() {


            public void done(ParseUser user, ParseException e) {

                if (user != null) {
                    // Hooray! The user is logged in.

                    utilidades.cancellDialog();
                    usuario= new Usuario(user);
                    utilidades.showAlertMessage("Inicio Exitoso","Exito");

                } else {

                }
            }
        });

    }

    public void getRestFullServices(){
        GetRestServices services;
        if(isGoingForViviendasSet) {
             services =
                    new GetRestServices(getUrlSet()[0],getActivity());
        }else{
            services =
                    new GetRestServices(getUrlSet()[1],getActivity());
        }
        this.isGoingForViviendasSet=true;
        services.execute();

    }

    public boolean isGoingForViviendasSet() {
        return isGoingForViviendasSet;
    }

    public void setGoingForViviendasSet(boolean isGoingForViviendasSet) {
        this.isGoingForViviendasSet = isGoingForViviendasSet;
    }

    public LoginActitvity getActivity() {
        return activity;
    }

    public void setActivity(LoginActitvity activity) {
        this.activity = activity;
    }

    public String[] getUrlSet() {
        return urlSet;
    }

    public void setUrlSet(String[] urlSet) {
        this.urlSet = urlSet;
    }
}


