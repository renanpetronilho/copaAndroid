package br.com.renanpetronilho.copadascopas.entidade;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by renan on 12/06/15.
 */
public class Time  implements Serializable {
    private Integer id;
    private String key;
    private String title;
    private String code;
    private String synonyms;
    private String country_id;
    private String city_id;
    private String club;
    private String since;
    private String address;
    private String web;
    private String assoc_id;
    private String national;
    private String created_at;
    private String update_at;

    public Time(Integer id, String key, String title, String code, String synonyms, String country_id, String city_id, String club, String since, String address, String web, String assoc_id, String national, String created_at, String update_at) {
        this.id = id;
        this.key = key;
        this.title = title;
        this.code = code;
        this.synonyms = synonyms;
        this.country_id = country_id;
        this.city_id = city_id;
        this.club = club;
        this.since = since;
        this.address = address;
        this.web = web;
        this.assoc_id = assoc_id;
        this.national = national;
        this.created_at = created_at;
        this.update_at = update_at;
    }

    public Time() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getAssoc_id() {
        return assoc_id;
    }

    public void setAssoc_id(String assoc_id) {
        this.assoc_id = assoc_id;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", title='" + title + '\'' +
                ", code='" + code + '\'' +
                ", synonyms='" + synonyms + '\'' +
                ", country_id='" + country_id + '\'' +
                ", city_id='" + city_id + '\'' +
                ", club='" + club + '\'' +
                ", since='" + since + '\'' +
                ", address='" + address + '\'' +
                ", web='" + web + '\'' +
                ", assoc_id='" + assoc_id + '\'' +
                ", national='" + national + '\'' +
                ", created_at='" + created_at + '\'' +
                ", update_at='" + update_at + '\'' +
                '}';
    }
}
