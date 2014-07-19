package co.gov.fna.vivienda.controlador;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

import co.gov.fna.vivienda.modelo.entidades.OpcionesDashBoard;
import co.gov.fna.vivienda.presentacion.actividades.DashBoard;

/**
 * Created by usuario on 19/07/14.
 */
public class ControladorDashBoard {

    private DashBoard activity;

    public ControladorDashBoard(DashBoard activity) {
        this.activity = activity;
    }

       public void createGrid(){
           List<OpcionesDashBoard> listaOpcionesDashBoard= new ArrayList<OpcionesDashBoard>();
           OpcionesDashBoard opcionesDashBoard= new OpcionesDashBoard(null,"Viviendas");
       }

    public DashBoard getActivity() {
        return activity;
    }

    public void setActivity(DashBoard activity) {
        this.activity = activity;
    }
}
