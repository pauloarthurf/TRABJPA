/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author paulo_000
 */
@Entity
public class TarefasSemanais {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idTarefas;
    @Column(nullable=false)
    private String descricao;
    
    public TarefasSemanais(int id, String desc){
        this.idTarefas = id;
        this.descricao = desc;
    }

    public int getIdTarefas() {
        return idTarefas;
    }

    public void setIdTarefas(int idTarefas) {
        this.idTarefas = idTarefas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
