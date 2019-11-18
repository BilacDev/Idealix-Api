package br.com.idealix.idealix.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "child")
public class Child implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @JsonFormat(pattern="yyyy-MM-dd")
    @NotNull
    @Column(name = "birthday") //nome da coluna no banco
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "gender")
    private Gender gender;

//    @NotNull
//    @ManyToOne
//    @JoinColumn(name = "responsible_id")
    private int responsible_id;

//    @NotNull
//    @ManyToOne
//    @JoinColumn(name = "classification_id")
    private int classification_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getResponsible_id() {
        return responsible_id;
    }

    public void setResponsible_id(int responsible_id) {
        this.responsible_id = responsible_id;
    }

    public int getClassification_id() {
        return classification_id;
    }

    public void setClassification_id(int classification_id) {
        this.classification_id = classification_id;
    }
}
