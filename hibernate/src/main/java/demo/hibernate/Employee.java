package demo.hibernate;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Emp_Pro",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="proj_id",referencedColumnName = "id"))
	private List<Project> projects=new ArrayList<Project>();

}
