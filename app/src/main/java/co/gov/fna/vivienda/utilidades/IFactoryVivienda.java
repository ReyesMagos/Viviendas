package co.gov.fna.vivienda.utilidades;

import org.json.JSONArray;

import java.util.List;

import co.gov.fna.vivienda.modelo.entidades.Vivienda;

/**
 * Created by usuario on 2/07/14.
 */
public interface  IFactoryVivienda {

    List<Vivienda> getViviendasRest();
    void fillViviendas(JSONArray arreglo, String [] arrayPropertiesNames);
}
