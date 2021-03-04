package com.cj.multidatasourcedemo.pojo.basic;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "T_DICT")
@DynamicUpdate
@DynamicInsert
@GenericGenerator(name = "system-uuid", strategy = "uuid")
public class Dict implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 主键 JAVA生成的UUID */
    @Id
    @Column(name = "DICT_ID")
    @GeneratedValue(generator="system-uuid")
    private String dictId;

    /** 字典类型 */
    @Column(name = "DICT_TYPE")
    private String dictType;

    /** 代码 */
    @Column(name = "DICT_CODE")
    private String dictCode;

    /** 名称 */
    @Column(name = "DICT_NAME")
    private String dictName;

    /** 排序 */
    @Column(name = "VIEW_ORDER")
    private Byte viewOrder;
    
    /** 有效状态 1=有效（默认）；0=无效 */
    @Column(name = "ACTIVE")
    private Byte active;

    public String getDictId()
    {
        return dictId;
    }

    public void setDictId(String dictId)
    {
        this.dictId = dictId;
    }

    public String getDictType()
    {
        return dictType;
    }

    public void setDictType(String dictType)
    {
        this.dictType = dictType;
    }

    public String getDictCode()
    {
        return dictCode;
    }

    public void setDictCode(String dictCode)
    {
        this.dictCode = dictCode;
    }

    public String getDictName()
    {
        return dictName;
    }

    public void setDictName(String dictName)
    {
        this.dictName = dictName;
    }

    public Byte getViewOrder()
    {
        return viewOrder;
    }

    public void setViewOrder(Byte viewOrder)
    {
        this.viewOrder = viewOrder;
    }

    public Byte getActive()
    {
        return active;
    }

    public void setActive(Byte active)
    {
        this.active = active;
    }
}
