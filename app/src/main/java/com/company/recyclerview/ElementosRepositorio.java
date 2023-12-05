package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();


    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("bulbasaur", "https://pokeapi.co/api/v2/pokemon-species/1/"));
        elementos.add(new Elemento("ivysaur", "https://pokeapi.co/api/v2/pokemon-species/2/"));
        elementos.add(new Elemento("venusaur", "https://pokeapi.co/api/v2/pokemon-species/3/"));
        elementos.add(new Elemento("charmander", "https://pokeapi.co/api/v2/pokemon-species/4/"));
        elementos.add(new Elemento("charmeleon","https://pokeapi.co/api/v2/pokemon-species/5/"));
        elementos.add(new Elemento("charizard","https://pokeapi.co/api/v2/pokemon-species/6/"));
        elementos.add(new Elemento("squirtle","https://pokeapi.co/api/v2/pokemon-species/7/"));
        elementos.add(new Elemento("wartortle","https://pokeapi.co/api/v2/pokemon-species/8/"));
        elementos.add(new Elemento("blastoise","https://pokeapi.co/api/v2/pokemon-species/9/"));
        elementos.add(new Elemento("caterpie","https://pokeapi.co/api/v2/pokemon-species/10/"));
        elementos.add(new Elemento("metapod","https://pokeapi.co/api/v2/pokemon-species/11/"));
        elementos.add(new Elemento("butterfree","https://pokeapi.co/api/v2/pokemon-species/12/"));
        elementos.add(new Elemento("weedle","https://pokeapi.co/api/v2/pokemon-species/13/"));
        elementos.add(new Elemento("kakuna","https://pokeapi.co/api/v2/pokemon-species/14/"));
        elementos.add(new Elemento("beedrill","https://pokeapi.co/api/v2/pokemon-species/15/"));
        elementos.add(new Elemento("pidgey","https://pokeapi.co/api/v2/pokemon-species/16/"));
        elementos.add(new Elemento("pidgeotto","https://pokeapi.co/api/v2/pokemon-species/17/"));
        elementos.add(new Elemento("pidgeot","https://pokeapi.co/api/v2/pokemon-species/18/"));
        elementos.add(new Elemento("rattata","https://pokeapi.co/api/v2/pokemon-species/19/"));
        elementos.add(new Elemento("raticate","https://pokeapi.co/api/v2/pokemon-species/20/"));
    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}
