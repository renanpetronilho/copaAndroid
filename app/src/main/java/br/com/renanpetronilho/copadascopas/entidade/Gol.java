package br.com.renanpetronilho.copadascopas.entidade;

import java.io.Serializable;

/**
 * Created by renan on 14/06/15.
 */
public class Gol implements Serializable{

    private Integer id;
    private Integer person_id;
    private String game_id;
    private String team_id;
    private String minute;
    private String offset;
    private String score1;
    private String score2;
    private String penalty;
    private String owngoal;
    private String created_at;
    private String updated_at;

    public Gol(Integer id, Integer person_id, String game_id, String team_id, String minute, String offset, String score1, String score2, String penalty, String owngoal, String created_at, String updated_at) {
        this.id = id;
        this.person_id = person_id;
        this.game_id = game_id;
        this.team_id = team_id;
        this.minute = minute;
        this.offset = offset;
        this.score1 = score1;
        this.score2 = score2;
        this.penalty = penalty;
        this.owngoal = owngoal;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Gol() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getGame_id() {
        return game_id;
    }

    public void setGame_id(String game_id) {
        this.game_id = game_id;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getScore1() {
        return score1;
    }

    public void setScore1(String score1) {
        this.score1 = score1;
    }

    public String getScore2() {
        return score2;
    }

    public void setScore2(String score2) {
        this.score2 = score2;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getOwngoal() {
        return owngoal;
    }

    public void setOwngoal(String owngoal) {
        this.owngoal = owngoal;
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

    @Override
    public String toString() {
        return "Gol{" +
                "id=" + id +
                ", person_id=" + person_id +
                ", game_id='" + game_id + '\'' +
                ", team_id='" + team_id + '\'' +
                ", minute='" + minute + '\'' +
                ", offset='" + offset + '\'' +
                ", score1='" + score1 + '\'' +
                ", score2='" + score2 + '\'' +
                ", penalty='" + penalty + '\'' +
                ", owngoal='" + owngoal + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}
