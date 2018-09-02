package pab.par.dom.activities.logic.dto;

import java.util.ArrayList;
import java.util.List;

public class OpeningHours {

    private List<String> mo = null;

    private List<String> tu = null;

    private List<String> we = null;

    private List<String> th = null;

    private List<String> fr = null;

    private List<String> sa = null;

    private List<String> su = null;

    public List<String> getMo() {
        return mo;
    }

    public void setMo(List<String> mo) {
        this.mo = mo;
    }

    public List<String> getTu() {
        return tu;
    }

    public void setTu(List<String> tu) {
        this.tu = tu;
    }

    public List<String> getWe() {
        return we;
    }

    public void setWe(List<String> we) {
        this.we = we;
    }

    public List<String> getTh() {
        return th;
    }

    public void setTh(List<String> th) {
        this.th = th;
    }

    public List<String> getFr() {
        return fr;
    }

    public void setFr(List<String> fr) {
        this.fr = fr;
    }

    public List<String> getSa() {
        return sa;
    }

    public void setSa(List<String> sa) {
        this.sa = sa;
    }

    public List<String> getSu() {
        return su;
    }

    public void setSu(List<String> su) {
        this.su = su;
    }

    public List<String> getByIndex(int index){
        List<String> openingHours = new ArrayList<>();

        if (index == 1){
            openingHours =  this.mo;
        }else if (index == 2){
            openingHours = this.tu;
        }else if (index == 3){
            openingHours = this.we;
        }else if (index == 4){
            openingHours = this.th;
        }else if (index == 5){
            openingHours = this.fr;
        }else if (index == 6){
            openingHours = this.sa;
        }else if (index == 7){
            openingHours = this.su;
        }

        return openingHours;
    }
}
