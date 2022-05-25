package com.codeteam.crudcode.model;
// importanciones pertinentes
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 *  llamamos la tabla de SQL que creamos por ende debemos decirle
 *  que es una @entity y @table diciendole cual tabla de la base de datos es a
 *  la que nos referimos para esta implementacion
 *
 * @author Justin Alejandro Diaz Jimenez -- jusadiazjim@unal.edu.co
 *
 * @since 1.00.00
 *
 * @version 1
 *
 */
@Entity
@Table (name = "Tb_Tarea")
public class Tarea {


    /** le decimos al codigo que es el Id, le decimos que columna es y
     * finalmente que es un valor autogenerado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "Id")
    private Integer Id;

    /** Definimos las columnas y su representacion en java **/

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;
    @Column(name = "e_mail")
    private String e_mail;
    @Column(name = "born_date")
    private Date born_date;
    @Column(name = "Finalizado")
    private Boolean Finalizado;


    /** Organizamos los Geters y los Setters **/

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.Finalizado = finalizado;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Date getBorn_date() {
        return born_date;
    }

    public void setBorn_date(Date born_date) {
        this.born_date = born_date;
    }
}
