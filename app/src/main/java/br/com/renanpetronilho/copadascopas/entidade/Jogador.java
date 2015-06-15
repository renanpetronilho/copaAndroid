package br.com.renanpetronilho.copadascopas.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by renan on 14/06/15.
 */
public class Jogador implements Serializable{

    private Integer id;
    private String key;
    private String name;
    private String synonyms;
    private String code;
    private String born_at;
    private String city_id;
    private String region_id;
    private String country_id;
    private String nationality_id;
    private String created_at;
    private String updated_at;
    private List<Gol> gols;

    public Jogador() {
        this.gols = new ArrayList<Gol>();
    }

    public Jogador(Integer id, String key, String name, String synonyms, String code, String born_at, String city_id, String region_id, String country_id, String nationality_id, String created_at, String updated_at, List<Gol> gols) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.synonyms = synonyms;
        this.code = code;
        this.born_at = born_at;
        this.city_id = city_id;
        this.region_id = region_id;
        this.country_id = country_id;
        this.nationality_id = nationality_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.gols = new ArrayList<Gol>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBorn_at() {
        return born_at;
    }

    public void setBorn_at(String born_at) {
        this.born_at = born_at;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(String nationality_id) {
        this.nationality_id = nationality_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public List<Gol> getGols() {
        return gols;
    }

    public void setGols(List<Gol> gols) {
        this.gols = gols;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "gols=" + gols +
                '}';
    }
}
