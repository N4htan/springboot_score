package com.kindof.score.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PAGAMENTOS")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String doc_cli;

    @NotNull
    private Long tip_cli;

    @NotNull
    private int id_fnt;

    @NotNull
    private Long num_unc;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd@HH:mm:ss")
    private Date dat_vct;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd@HH:mm:ss")
    private Date dat_pgt;

    @NotNull
    private float vlr_pgt;

    @NotNull
    private String cod_mdl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoc_cli() {
        return doc_cli;
    }

    public void setDoc_cli(String doc_cli) {
        this.doc_cli = doc_cli;
    }

    public Long getTip_cli() {
        return tip_cli;
    }

    public void setTip_cli(Long tip_cli) {
        this.tip_cli = tip_cli;
    }

    public int getId_fnt() {
        return id_fnt;
    }

    public void setId_fnt(int id_fnt) {
        this.id_fnt = id_fnt;
    }

    public Long getNum_unc() {
        return num_unc;
    }

    public void setNum_unc(Long num_unc) {
        this.num_unc = num_unc;
    }

    public Date getDat_vct() {
        return dat_vct;
    }

    public void setDat_vct(Date dat_vct) {
        this.dat_vct = dat_vct;
    }

    public Date getDat_pgt() {
        return dat_pgt;
    }

    public void setDat_pgt(Date dat_pgt) {
        this.dat_pgt = dat_pgt;
    }

    public float getVlr_pgt() {
        return vlr_pgt;
    }

    public void setVlr_pgt(float vlr_pgt) {
        this.vlr_pgt = vlr_pgt;
    }

    public String getCod_mdl() {
        return cod_mdl;
    }

    public void setCod_mdl(String cod_mdl) {
        this.cod_mdl = cod_mdl;
    }
}
