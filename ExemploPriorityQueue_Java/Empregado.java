import java.time.LocalDate;

// Exemplo baseado em https://howtodoinjava.com/java/collections/java-priorityqueue/
public class Empregado implements Comparable<Empregado>
{
    private Long id;
    private String nome;
    private LocalDate ddn;  //data de nascimento

    public Empregado(Long id, String nome, LocalDate ddn)
    {
        super();
        this.id = id;
        this.nome = nome;
        this.ddn = ddn;
    }

    @Override
    public int compareTo(Empregado emp)     // Ordem natural
    {
        return this.getId().compareTo(emp.getId());
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public LocalDate getDdn() { return ddn; }

    @Override
    public String toString()
    {
        return "Empregado [id=" + id + ", nome=" + nome + ", ddn=" + ddn + "]";
    }
}
