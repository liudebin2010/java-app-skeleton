package com.v51das.app.cassandra.reactive.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.Map;

/**
 * @description：燃油车辆实时数据
 * @author：twislyn
 * @date：Created in 2020/
 * 05/22
 * @modified By：
 * @version: 1.0
 */
@Table("w_iot_fuelvehicle_realtime_base")
public class IotFuelVehicleRealtimeBase {
    @PrimaryKey("rowid")
    private String rowId;
    /**
     * 进气量
     */
    @Column("airin")
    private Double airIn;
    /**
     * 大气压力
     */
    @Column("atmp")
    private Double atmp;
    /**
     * 标定验证码
     */
    @Column("cvn")
    private String cvn;
    @Column("dpf")
    private Double dpf;
    /**
     * 发动机冷却液温度
     */
    @Column("ect")
    private Integer ect;
    /**
     * 发动机燃料流量
     */
    @Column("eflow")
    private Double eflow;
    /**
     * 发动机转速
     */
    @Column("espeed")
    private Double espeed;
    @Column("flist")
    private List flist;
    /**
     * 油箱液位
     */
    @Column("flvl")
    private Double flvl;
    /**
     * 故障码数量
     */
    @Column("fnum")
    private Integer fnum;
    /**
     * 摩擦扭矩（作为发动机最大基准扭矩的百分比）
     */
    @Column("ftorq")
    private Integer ftorq;
    /**
     * 数据采集时间_登入
     */
    @Column("gatime")
    private String gatime;
    /**
     * IUPR值
     */
    @Column("iupr")
    private String iupr;
    /**
     * 纬度
     */
    @Column("lat")
    private Double lat;
    /**
     * 经度
     */
    @Column("lng")
    private Double lng;
    @Column("locs")
    private Map<String, Double> locs;
    /**
     * 定位状态
     */
    @Column("locsts")
    private String locsts;
    /**
     * MIL状态
     */
    @Column("milsts")
    private Integer milsts;
    /**
     * OBD诊断协议
     */
    @Column("obddp")
    private Integer obddp;
    /**
     * 发动机净输出扭矩，或发动机实际扭矩/指示扭矩
     */
    @Column("otorq")
    private Integer otorq;
    @Column("rdysts")
    private String rdysts;
    @Column("reiss")
    private Boolean reiss;
    @Column("remrg")
    private Double remrg;
    @Column("rfld")
    private Map rfld;
    @Column("scrdnnox")
    private Double scrdnnox;
    @Column("scrint")
    private Double scrint;
    @Column("scroutt")
    private Double scroutt;
    @Column("scrupnox")
    private Double scrupnox;
    /**
     * 车速
     */
    @Column("speed")
    private Double speed;
    @Column("sstr")
    private String sstr;
    @Column("supsts")
    private String supsts;
    @Column("swareid")
    private String swareid;
    /**
     * 累计里程
     */
    @Column("tmiles")
    private Double tmiles;
    /**
     * vin码
     */
    @Column("vin")
    private String vin;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public Double getAirIn() {
        return airIn;
    }

    public void setAirIn(Double airIn) {
        this.airIn = airIn;
    }

    public Double getAtmp() {
        return atmp;
    }

    public void setAtmp(Double atmp) {
        this.atmp = atmp;
    }

    public String getCvn() {
        return cvn;
    }

    public void setCvn(String cvn) {
        this.cvn = cvn;
    }

    public Double getDpf() {
        return dpf;
    }

    public void setDpf(Double dpf) {
        this.dpf = dpf;
    }

    public Integer getEct() {
        return ect;
    }

    public void setEct(Integer ect) {
        this.ect = ect;
    }

    public Double getEflow() {
        return eflow;
    }

    public void setEflow(Double eflow) {
        this.eflow = eflow;
    }

    public Double getEspeed() {
        return espeed;
    }

    public void setEspeed(Double espeed) {
        this.espeed = espeed;
    }

    public List getFlist() {
        return flist;
    }

    public void setFlist(List flist) {
        this.flist = flist;
    }

    public Double getFlvl() {
        return flvl;
    }

    public void setFlvl(Double flvl) {
        this.flvl = flvl;
    }

    public Integer getFnum() {
        return fnum;
    }

    public void setFnum(Integer fnum) {
        this.fnum = fnum;
    }

    public Integer getFtorq() {
        return ftorq;
    }

    public void setFtorq(Integer ftorq) {
        this.ftorq = ftorq;
    }

    public String getGatime() {
        return gatime;
    }

    public void setGatime(String gatime) {
        this.gatime = gatime;
    }

    public String getIupr() {
        return iupr;
    }

    public void setIupr(String iupr) {
        this.iupr = iupr;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Map<String, Double> getLocs() {
        return locs;
    }

    public void setLocs(Map<String, Double> locs) {
        this.locs = locs;
    }

    public String getLocsts() {
        return locsts;
    }

    public void setLocsts(String locsts) {
        this.locsts = locsts;
    }

    public Integer getMilsts() {
        return milsts;
    }

    public void setMilsts(Integer milsts) {
        this.milsts = milsts;
    }

    public Integer getObddp() {
        return obddp;
    }

    public void setObddp(Integer obddp) {
        this.obddp = obddp;
    }

    public Integer getOtorq() {
        return otorq;
    }

    public void setOtorq(Integer otorq) {
        this.otorq = otorq;
    }

    public String getRdysts() {
        return rdysts;
    }

    public void setRdysts(String rdysts) {
        this.rdysts = rdysts;
    }

    public Boolean getReiss() {
        return reiss;
    }

    public void setReiss(Boolean reiss) {
        this.reiss = reiss;
    }

    public Double getRemrg() {
        return remrg;
    }

    public void setRemrg(Double remrg) {
        this.remrg = remrg;
    }

    public Map getRfld() {
        return rfld;
    }

    public void setRfld(Map rfld) {
        this.rfld = rfld;
    }

    public Double getScrdnnox() {
        return scrdnnox;
    }

    public void setScrdnnox(Double scrdnnox) {
        this.scrdnnox = scrdnnox;
    }

    public Double getScrint() {
        return scrint;
    }

    public void setScrint(Double scrint) {
        this.scrint = scrint;
    }

    public Double getScroutt() {
        return scroutt;
    }

    public void setScroutt(Double scroutt) {
        this.scroutt = scroutt;
    }

    public Double getScrupnox() {
        return scrupnox;
    }

    public void setScrupnox(Double scrupnox) {
        this.scrupnox = scrupnox;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getSstr() {
        return sstr;
    }

    public void setSstr(String sstr) {
        this.sstr = sstr;
    }

    public String getSupsts() {
        return supsts;
    }

    public void setSupsts(String supsts) {
        this.supsts = supsts;
    }

    public String getSwareid() {
        return swareid;
    }

    public void setSwareid(String swareid) {
        this.swareid = swareid;
    }

    public Double getTmiles() {
        return tmiles;
    }

    public void setTmiles(Double tmiles) {
        this.tmiles = tmiles;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}