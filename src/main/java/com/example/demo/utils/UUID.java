package com.example.demo.utils;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class UUID implements Cloneable,Serializable {
    @Id
    @GenericGenerator(name="uuid",strategy="uuid.hex")
    @GeneratedValue(strategy= GenerationType.AUTO,generator="uuid")
    protected String oid;

    @Override
    public int hashCode(){
        return null==this.oid?"".hashCode():this.oid.hashCode();
    }

    @Override
    public String toString(){
        return null==this.oid?"":this.oid;
    }

    @Override
    public boolean equals(Object obj){
        if(null==obj){
            return false;
        }
        if(!(obj instanceof UUID)){
            return false;
        }
        UUID ref=(UUID) obj;
        return null==this.oid?null==ref.getOid():this.oid.equals(ref.getOid());
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
}
