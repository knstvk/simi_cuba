package ch.so.agi.simi.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@NamePattern("%s (MAP)|identifier")
@Entity(name = "simi_Map")
public class Map extends ProductSet {
    private static final long serialVersionUID = 7635912888887894596L;

    @NotNull
    @Column(name = "FOREGROUND")
    protected Boolean foreground = true;

    public Boolean getForeground() {
        return foreground;
    }

    public void setForeground(Boolean foreground) {
        this.foreground = foreground;
    }
}