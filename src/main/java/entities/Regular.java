package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "regular")
@PrimaryKeyJoinColumn(name="id")
public class Regular extends Empleado{

    @Column(name = "salario")
    private float salario;

    @Column(name = "bonus")
    private int bonus;

    public Regular(String nombre, float salario, int bonus) {
        super(nombre);
        this.salario = salario;
        this.bonus = bonus;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "salario=" + salario +
                ", bonus=" + bonus +
                "} " + super.toString();
    }
}
