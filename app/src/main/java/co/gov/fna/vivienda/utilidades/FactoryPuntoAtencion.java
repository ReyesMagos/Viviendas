package co.gov.fna.vivienda.utilidades;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import co.gov.fna.vivienda.modelo.entidades.PuntoAtencion;
import co.gov.fna.vivienda.modelo.entidades.Ubicacion;

/**
 * Created by admin on 19/07/2014.
 */
public class FactoryPuntoAtencion implements IFactoryPuntoAtencion {

    private static FactoryPuntoAtencion instance;
    private List<PuntoAtencion> listaPuntosV;

    public FactoryPuntoAtencion() {
    }

    public static FactoryPuntoAtencion getInstance() {
        if (instance == null) {
            instance = new FactoryPuntoAtencion();
        }
        return instance;
    }

    @Override
    public List<PuntoAtencion> getPuntoAtencionRest() {
        return listaPuntosV;
    }

    @Override
    public void fillPuntoAtencion(JSONArray arreglo, String[] arrayPropertiesNames) {

        if (arreglo == null || arreglo.length() == 0) {
            return;
        }

        listaPuntosV = new ArrayList<PuntoAtencion>();
        JSONObject object;
        try {
            for (int i = 0; i < arreglo.length(); i++){
                object = arreglo.getJSONObject(i);
                PuntoAtencion p = new PuntoAtencion();
                int j = 0;

                p.setCedulaCodigoBarras(object.getString(arrayPropertiesNames[j]));
                j++;
                p.setCostoTransaccion(object.getString(arrayPropertiesNames[j]));
                j++;
                p.setDepartamento(object.getString(arrayPropertiesNames[j]));
                j++;
                p.setDireccion(object.getString(arrayPropertiesNames[j]));
                j++;
                p.setHorarioAtencion(object.getString(arrayPropertiesNames[j]));
                j++;
                p.setHorarioExtendido(object.getString(arrayPropertiesNames[j]));
                j++;

                //Inicia ubicacion
                Double x = Double.parseDouble(object.getString(arrayPropertiesNames[j]));
                j++;
                Double y = Double.parseDouble(object.getString(arrayPropertiesNames[j]));
                j++;
                Ubicacion u = new Ubicacion(x, y);
                p.setUbicacion(u);
                //termina ubicacion

                p.setMunicipio(object.getString(arrayPropertiesNames[j]));
                j++;
                p.setNumero(object.getString(arrayPropertiesNames[j]));
                j++;
                p.setTipoEntidad(object.getString(arrayPropertiesNames[j]));
                j++;
                p.setTipoServicioOfrecido(object.getString(arrayPropertiesNames[j]));
                j++;

                listaPuntosV.add(p);
            }
        }catch (JSONException e) {
            return;
        }

    }
}
